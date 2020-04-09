package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static void breakList(List/*<String>*/ l) {
    l.add(0, LocalDate.now());
  }
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(
        Arrays.asList(/*LocalDate.now(), */"Alfred"));
//    names = Collections.checkedList(names, String.class);
//    names.add(LocalDate.now());
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
//    breakList(names);

//    String fredsName = (String)names.get(0);
    String fredsName = names.get(0); // "automatic" cast
    System.out.println("Fred's name is " + fredsName);
    System.out.println("Name at subscript zero is " + names.get(0));
  }
}
