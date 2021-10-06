package Iterator.Exercise;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
  // ArrayList<データ型> 変数名 = new ArrayList<>();
  private ArrayList<Book> books;
  public BookShelf(int maxsize) {
    this.books = new ArrayList<>();
  }
  public Book getBookAt(int index) {
    return books.get(index);
  }
  public void appendBook(Book book) {
    this.books.add(book);
  }
  public int getLength() {
    return this.books.size();
  }
  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
