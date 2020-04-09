package methods;

import java.util.function.Function;

public class InstanceMethod {
  public <E, F> F map(E e, Function<E, F> op) {
    return op.apply(e);
  }
}
