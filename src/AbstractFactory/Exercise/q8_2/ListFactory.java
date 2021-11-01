package AbstractFactory.Exercise.q8_2;

import AbstractFactory.Exercise.q8_2.*;

public class ListFactory extends Factory { 
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }

  public Page createYahooPage() {
    return new ListPage('Yahoo!', "Yahoo!");
  }
}
