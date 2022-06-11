package observer;

import factory.BicycleFactory;
import factory.DollFactory;

public class Elf implements Observer {

  private String elfName;
  private Observable Board;

  public Elf(String elfName) {
    setElfName(elfName);
  }

  @Override
  public void receiveUpdate() {
    if (Board.prepareToy().equals("Doll")) {
      DollFactory dollFactory = new DollFactory();
      dollFactory.createToy();
    }
    if (Board.prepareToy().equals("Bicycle")) {
      BicycleFactory bicycleFactory = new BicycleFactory();
      bicycleFactory.createToy();
    }
  }

  @Override
  public void setBoard(Observable Board) {
    this.Board = Board;
  }

  @Override
  public void removeBoard() {
    Board = null;
  }

  public String getElfName() {
    return elfName;
  }

  public void setElfName(String elfName) {
    this.elfName = elfName;
  }
}
