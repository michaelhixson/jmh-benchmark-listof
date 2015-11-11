package rnd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

final class ImmutableList {
  private ImmutableList() {}

  @SafeVarargs
  static <E> List<E> of(E... es) {
    switch (es.length) {
      case 0: return of0();
      case 1: return of1(es[0]);
      case 2: return of2(es[0], es[1]);
      case 3: return of3(es[0], es[1], es[2]);
      case 4: return of4(es[0], es[1], es[2], es[3]);
      case 5: return of5(es[0], es[1], es[2], es[3], es[4]);
      case 6: return of6(es[0], es[1], es[2], es[3], es[4], es[5]);
      case 7: return of7(es[0], es[1], es[2], es[3], es[4], es[5], es[6]);
      case 8: return of8(es[0], es[1], es[2], es[3], es[4], es[5], es[6], es[7]);
      case 9: return of9(es[0], es[1], es[2], es[3], es[4], es[5], es[6], es[7], es[8]);
      case 10: return of10(es[0], es[1], es[2], es[3], es[4], es[5], es[6], es[7], es[8], es[9]);
      default: return copyOf(es);
    }
  }

  static <E> List<E> of0() {
    return Collections.emptyList();
  }

  static <E> List<E> of1(E e1) {
    return Collections.singletonList(Objects.requireNonNull(e1));
  }

  static <E> List<E> of2(E e1, E e2) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2)));
  }

  static <E> List<E> of3(E e1, E e2, E e3) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3)));
  }

  static <E> List<E> of4(E e1, E e2, E e3, E e4) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4)));
  }

  static <E> List<E> of5(E e1, E e2, E e3, E e4, E e5) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5)));
  }

  static <E> List<E> of6(E e1, E e2, E e3, E e4, E e5, E e6) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5),
        Objects.requireNonNull(e6)));
  }

  static <E> List<E> of7(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5),
        Objects.requireNonNull(e6),
        Objects.requireNonNull(e7)));
  }

  static <E> List<E> of8(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5),
        Objects.requireNonNull(e6),
        Objects.requireNonNull(e7),
        Objects.requireNonNull(e8)));
  }

  static <E> List<E> of9(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5),
        Objects.requireNonNull(e6),
        Objects.requireNonNull(e7),
        Objects.requireNonNull(e8),
        Objects.requireNonNull(e9)));
  }

  static <E> List<E> of10(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
    return Collections.unmodifiableList(Arrays.asList(
        Objects.requireNonNull(e1),
        Objects.requireNonNull(e2),
        Objects.requireNonNull(e3),
        Objects.requireNonNull(e4),
        Objects.requireNonNull(e5),
        Objects.requireNonNull(e6),
        Objects.requireNonNull(e7),
        Objects.requireNonNull(e8),
        Objects.requireNonNull(e9),
        Objects.requireNonNull(e10)));
  }

  @SafeVarargs
  static <E> List<E> copyOf(E... es) {
    E[] copy = es.clone();
    for (E e : copy) Objects.requireNonNull(e);
    return Collections.unmodifiableList(Arrays.asList(copy));
  }
}
