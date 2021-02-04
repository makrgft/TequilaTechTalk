/*
 * Copyright (c) 2019 DVKA
 */

package de.gft.versandbestaetigung;

import de.gft.ProcessDataOperation;

public class VersandbestaetigungOperations {

  public ProcessDataOperation<VersandbestaetigungContext> druckeVersandlabel() {
    return context -> {

      // hier könnte man z.B. noch den Druck anstossen

      context.setSendungsverfolgung("0048290344263264392");
      return context;
    };
  }

  public ProcessDataOperation<VersandbestaetigungContext> createEmail() {
    return context -> {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Empfaenger: ")
              .append(context.getEmpfaenger())
              .append("\n")
              .append(context.getNachrichtDescriptor().getNachrichtenTyp())
              .append("\n")
              .append("Ihre Ware hat soeben das Lager verlassen!")
              .append("\n")
              .append("Sendungsverfolgung: ")
              .append(context.getSendungsverfolgung())
              .append("\n")
              .append("Bei Fragen senden Sie uns bitte immer auch die Vorgangsnummer ")
              .append(context.getVorgang())
              .append("\n")
              ;

      context.setEmail(stringBuilder.toString());
      return context;
    };
  }

}
