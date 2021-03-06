package Composite.Example;

import java.util.ArrayList;

public class Directory extends Entry {
  private String name;
  private ArrayList<Entry> directory = new ArrayList();
  public Directory(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public int getSize() {
    int size = 0;
    java.util.Iterator<Entry> it = directory.iterator();
    while(it.hasNext()) {
      Entry entry = (Entry)it.next();
      size += entry.getSize();
    }
    return size;
  }
  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    java.util.Iterator<Entry> it = directory.iterator();  
    while (it.hasNext()) {
      Entry entry = (Entry)it.next();
      entry.printList(prefix + "/" + name);
    }
  }
}
