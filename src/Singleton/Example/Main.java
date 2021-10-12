package Singleton.Example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Start.");
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    if (obj1 == obj2) {
      System.out.println("Same");
    } else {
      System.out.println("Different");
    }
    System.out.println("End.");
  }
}
