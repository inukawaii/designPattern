package Strategy.Exercise.q1;

import java.util.Random;
import Strategy.Example.Strategy;
import Strategy.Example.Hand;

public class RandomStrategy implements Strategy {
  private Random random;

  public RandomStrategy(int seed) {
    random = new Random(seed);
  }

  public Hand nextHand() {
    return Hand.getHand(random.nextInt(3));
  }

  public void study(boolean win) {
  }
}

