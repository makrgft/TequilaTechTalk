/*
 * Copyright (c) 2019 DVKA
 */

package de.gft.versandbestaetigung;

import de.gft.EmailNachrichtContext;
import de.gft.NachrichtDescriptor;

public class VersandbestaetigungContext extends EmailNachrichtContext<NachrichtDescriptor> {

  private String sendungsverfolgung;

  public String getSendungsverfolgung() {
    return sendungsverfolgung;
  }

  public void setSendungsverfolgung(String sendungsverfolgung) {
    this.sendungsverfolgung = sendungsverfolgung;
  }
}
