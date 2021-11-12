package Strategy.Example;

public class Player {
  private String name;
  private Strategy strategy;
  private int wincount;
  private int losecount;
  private int gamecount;
  public Player(String name, ProbStrategy probStrategy) {
    this.name = name;
    this.strategy = probStrategy;
  }
  public Player(String name2, WinningStrategy winningStrategy) {
    this.name = name2;
    this.strategy = winningStrategy;
  }
  public Hand nextHand() {
    return strategy.nextHand();
  }
  public void win() {
    strategy.study(true);
    wincount++;
    gamecount++;
  }
  public void lose() {
    strategy.study(false);
    losecount++;
    gamecount++;
  }
  public void even() {
    gamecount++;
  }
  public String toString() {
    return "[" +  name + ":" + gamecount + " games, " + wincount + "win, " +  losecount + " lose" + "]"; 
  }
  
}
