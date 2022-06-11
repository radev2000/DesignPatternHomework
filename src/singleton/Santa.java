package singleton;

import entities.Toy;
import java.util.*;

public class Santa {

  private static Santa instance;
  private ArrayList<Toy> toys;

  public Santa() {
    this.toys = new ArrayList<>();
  }

  public void addAToy(Toy toy) {
    if (toy != null) {
      toys.add(toy);
    }
  }

  public void printToys() {

    int bicyclesCount = countMatches(toysToString(), "bike");
    int dollsCount = countMatches(toysToString(), "doll");

    System.out.println("You have the following toys in your bag:");
    System.out.println("Number of Bicycles: " + bicyclesCount);
    System.out.println("Number of Dolls: " + dollsCount);

    // Use it for debugging
    // System.out.println("......... " + toysToString());

  }

  public static Santa getInstance() {
    if (instance == null)
      instance = new Santa();
    return instance;
  }

  public static void setInstance(Santa instance) {
    Santa.instance = instance;
  }

  String toysToString() {
    return toys.toString();
  }

  public static boolean isEmpty(String s) {
    return s == null || s.length() == 0;
  }

  public static int countMatches(String text, String str) {
    if (isEmpty(text) || isEmpty(str)) {
      return 0;
    }

    return text.split(str, -1).length - 1;
  }
}
