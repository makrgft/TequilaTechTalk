/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public interface NachrichtContext<D extends NachrichtDescriptor> {
  D getNachrichtDescriptor();

  void setNachrichtDescriptor(D nachrichtDescriptor);
}
