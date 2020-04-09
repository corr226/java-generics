package shopping;

//import java.util.function.BiPredicate;

public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

  // Better approach "command Pattern", aka delegate to
  // caller-provided check (or not even bother!)
//  public boolean matchedBy(BiPredicate<E, E> test) {
//    return test.test(left, right);
//  }

// Intermediate approach, use inheritance...
//  public boolean matched() {
////    if (left instanceof Sized)... // works but "ugly"
//    return left.getSize() == right.getSize();
//  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
