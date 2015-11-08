package rnd;

import java.util.List;

public interface List_JEP269<E> extends List<E> {
  @SafeVarargs
  static <E> List<E> of(E... es) {
    return ImmutableList.of(es);
  }
}
