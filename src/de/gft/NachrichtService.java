/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public class NachrichtService {

  public <T extends NachrichtContext> T process(NachrichtTyp actionType, NachrichtConfiguration nachrichtConfiguration, NachrichtDescriptor descriptor, T context) {
    NachrichtOrchestrator nachrichtOrchestrator = new NachrichtOrchestrator();

    // hier holen wir uns normalerweise über den ActionType die NachrichtKonfiguration und den Descriptor
    // RegisterService für die Klassen zu dem ActionType

    System.out.println("ActionType: " + actionType);

    return nachrichtOrchestrator.applyStandardfolge(nachrichtConfiguration, descriptor, context);
  }
}
