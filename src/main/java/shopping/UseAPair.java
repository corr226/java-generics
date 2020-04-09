package shopping;

import java.time.LocalDate;

public class UseAPair {
  public static void main(String[] args) {
//    Pair<String> p = new Pair<>("Fred", LocalDate.now());
    Pair<String> p = new Pair<>("Fred", "Jones");

//    p.setRight(LocalDate.now());
    p.setRight("Smith");
    String last = p.getRight();
  }
}
