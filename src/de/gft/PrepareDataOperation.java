/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

import java.util.Objects;

@FunctionalInterface
public interface PrepareDataOperation<C extends NachrichtContext> {
  C apply(final C context);

  @SuppressWarnings("unchecked")
  default <E extends C> PrepareDataOperation<E> andThen(PrepareDataOperation<E> after) {
    Objects.requireNonNull(after);
    return (E context) -> {
      context = (E) apply(context);
      return after.apply(context);
    };
  }
}
