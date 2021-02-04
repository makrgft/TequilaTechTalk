/*
 * Copyright (c) 2019 DVKA
 */

package de.gft.bestellbestaetigung;

import de.gft.PrepareDataOperation;
import de.gft.ProcessDataOperation;

public class BestellbestaetigungOperations {

  public <T extends BestellbestaetigungContext> PrepareDataOperation<T> prepareBestellnummer() {
    return context -> {
      context.setBestellnummer(12345);
      return context;
    };
  }

  public <T extends BestellbestaetigungContext> ProcessDataOperation<T> createEmail() {
    return context -> {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Empfaenger: ")
              .append(context.getEmpfaenger())
              .append("\n")
              .append(context.getNachrichtDescriptor().getNachrichtenTyp())
              .append("\n")
              .append("Hiermit bestätigen wir Ihre Bestellung!")
              .append("\n")
              .append("Ihre Bestellnummer lautet: ")
              .append(context.getBestellnummer())
              .append("\n")
              .append("Bei Fragen senden Sie uns bitte immer auch die Vorgangsnummer ")
              .append(context.getVorgang())
              .append("\n")
              .append("Wir melden uns, sobald ihre Bestellung das Lager verlassen hat.")
              ;

      context.setEmail(stringBuilder.toString());
      return context;
    };
  }

}
