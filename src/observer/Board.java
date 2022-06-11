package observer;

import java.util.ArrayList;
import java.util.List;

public class Board implements Observable {

  private String toyName;
  private List<Elf> elves;

  public Board() {
    this.elves = new ArrayList<>();
  }

  @Override
  public void addElfToBoard(Elf elf) {
    // if(elf){}
    if (elf != null) {
      elves.add(elf);
      elf.setBoard(this);
    }
  }

  @Override
  public void removeElf(Elf elf) {
    this.elves.remove(elf);
    elf.removeBoard();
  }

  @Override
  public void notifyElves(String toyName) {
    for (Elf elf : elves) {
      elf.receiveUpdate();
    }
  }

  public void orderDoll() {
    this.toyName = "Doll";
    System.out.println("You got a doll!");
    this.notifyElves(toyName);
  }

  public void orderBike() {
    this.toyName = "Bicycle";
    System.out.println("You got a bicycle!");
    this.notifyElves(toyName);
  }

  public List<Elf> getElves() {
    return elves;
  }

  public void setElves(List<Elf> elves) {
    this.elves = elves;
  }

  @Override
  public String prepareToy() {
    return this.toyName;
  }
}
