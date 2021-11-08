package Bridge.Exercise.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFileDisplayImpl extends DisplayImpl {
  private String string;
  private int width;

  public TextFileDisplayImpl(String filename) {
    File file = new File(filename);
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      this.string = br.readLine();
      this.width = string.getBytes().length;
    } catch(IOException e) {
      e.getStackTrace();
    }
  }

  public void rawOpen() {
    printLine();
  }

  public void rawPrint() {
    System.out.println("|" + string + "|");
  }

  public void rawClose() {
    printLine();
  }

  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
