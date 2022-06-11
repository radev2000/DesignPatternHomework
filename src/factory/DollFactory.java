package factory;

import entities.Doll;
import singleton.Santa;

public class DollFactory implements ToyFactory {

  @Override
  public void createToy() {
    Doll doll = new Doll();
    Santa.getInstance().addAToy((doll));
  }
}
