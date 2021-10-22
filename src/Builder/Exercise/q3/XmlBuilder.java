package Builder.Exercise.q3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Builder.Example.Builder;

public class XmlBuilder extends Builder {
  private String filename;
  private PrintWriter writer;
  public void makeTitle(String title) {
    filename = title + ".xml";
    try {
      writer = new PrintWriter(new FileWriter(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.println("<?xml version=\"1.0\"><title>" + title + "</title>");
  }
  public void makeString(String str) {
    writer.println("<word>" + str + "</word>");
  }
  public void makeItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      writer.println("<item>" + items[i] + "</item>");
    }
  }
  public void close() {
    writer.close();
  }
}
