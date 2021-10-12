package Singleton.Exercise;

public class Triple {
  private static Triple one = new Triple(1);
  private static Triple second = new Triple(2);
  private static Triple third = new Triple(3);
  public int id;
  private Triple(int number) {
    this.id = number;
  }
  public static Triple getInstance(int id) {
    Triple t;
    switch (id) {
      case 1:
        t = one;
        break;
      case 2:
        t = second;
        break;
      case 3:
        t = third;
        break;
      default:
        throw new RuntimeException();  
    }
    return t;
  }
}
