package runtimetype;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ToArray {
  public static <F, E extends F> F[] toArray(List<E> l, Class<F> classType) {
//    E[] result = (E[])new Object[l.size()];// E is only meaningful at COMPILE TIME
    // known as "Type Erasure"
    F[] result = (F[])(Array.newInstance(classType, l.size()));
    for (int i = 0; i < result.length; i++) {
      result[i] = l.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    System.out.println("List: " + ls);
    CharSequence[] names = toArray(ls, CharSequence.class);
    System.out.println("Array type is " + names);
    for (CharSequence s : names) {
      System.out.println(s);
    }
//    Object classType = String.class;
//    String [] sa = {};
//    System.out.println("Type of sa is " + sa.getClass().getName());
//    System.out.println("Type of ls is " + ls.getClass().getName());
  }
}
