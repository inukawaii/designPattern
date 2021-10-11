package Factory.Exercise.q2.idcard;
import Factory.Example.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
  private List<String> owners = new ArrayList<String>();
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }
  protected void registerProduct(Product product) {
    owners.add(((IDCard)product).getOwner());
  }
  public List<String> getOwner() {
    return owners;
  }
}
