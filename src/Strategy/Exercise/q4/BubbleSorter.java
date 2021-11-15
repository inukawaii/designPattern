package Strategy.Exercise.q4;

public class BubbleSorter implements Sorter {
  public void sort(Comparable[] data) {
    Comparable temp;
    for (int i = 0; i < data.length; i++) {
      System.out.print(data[i]);
      for (int j = 0; j < data.length - i - 1; j++) {
        if ( data[j].compareTo(data[j + 1]) > 0 ) {
          temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }
    }
  }
}
