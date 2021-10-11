package Factory.Exercise.q2.idcard;
import Factory.Exercise.q2.framework.*;

public class IDCard extends Product{
  private String owner;
  private int number;
  IDCard(String owner, int number) {
    System.out.println(owner + "[" + number + "]" + "のカードをつくります。");
    this.owner = owner;
    this.number = number;
  }
  public void use() {
    System.out.println(owner + "[" + number + "]" + "のカードを使います。");
  }
  public String getOwner() {
    return owner;
  }
}
