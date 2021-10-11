package Factory.Exercise.q2;

import Factory.Exercise.q2.framework.*;
import Factory.Exercise.q2.idcard.*;
public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("夏目漱石");
    Product card2 = factory.create("樋口一葉");
    Product card3 = factory.create("津田梅子");
    card1.use();
    card2.use();
    card3.use();
  }
}
