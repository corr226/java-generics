package shopping;

//public class ClothingPair<F extends Sized, String> extends Pair<F> {
public class ClothingPair<E extends Sized & Colored> extends Pair<E> {
//  Colored x = new Glove(8, "Red");
//  java.lang.String s = "Hello";
//  String s = "Hello";
  public ClothingPair(E left, E right) {
    super(left, right);
  }

//  public static <F extends Sized & Colored> boolean match(F left, F right) {
  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public boolean matched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
