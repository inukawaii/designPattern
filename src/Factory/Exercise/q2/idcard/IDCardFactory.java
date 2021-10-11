package Factory.Exercise.q2.idcard;
import Factory.Exercise.q2.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
  private List<String> owners = new ArrayList<String>();
  private int number = 0;
  protected Product createProduct(String owner) {
    number++;
    return new IDCard(owner, number);
  }
  protected void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }
  public List<String> getOwner() {
    return owners;
  }
}
