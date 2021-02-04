/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

import java.util.Objects;

@FunctionalInterface
public interface ProcessDataOperation<C extends NachrichtContext> {
    C apply(final C context);

    @SuppressWarnings("unchecked")
    default <E extends C> ProcessDataOperation<E> andThen(ProcessDataOperation<E> after) {
        Objects.requireNonNull(after);
        return (E context) -> {
            context = (E) apply(context);
            return after.apply(context);
        };
    }
}
