package factory;

import entities.Bicycle;
import singleton.Santa;

public class BicycleFactory implements ToyFactory {

  @Override
  public void createToy() {
    Bicycle bike = new Bicycle();
    Santa.getInstance().addAToy((bike));
  }
}
