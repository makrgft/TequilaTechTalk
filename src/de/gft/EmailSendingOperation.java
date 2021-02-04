/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

@FunctionalInterface
public interface EmailSendingOperation<C extends NachrichtContext> {
   C apply(C context);
}
