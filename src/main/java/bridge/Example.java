package bridge;

public class Example<E> {
  public void doStuff(E e) {}
}

class Ex2<F extends String> extends Example<F> {
  public void doStuff(F e) {}
}
