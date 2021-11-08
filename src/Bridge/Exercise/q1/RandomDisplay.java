package Bridge.Exercise.q1;

import java.util.Random;

public class RandomDisplay extends Display {
  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }
  public void randomDisplay() {
    open();
    Random random = new Random();
    int times = random.nextInt(10);
    for (int i = 0; i < times; i++) {
      print();
    }
    close();
  }
}
