/*
 * Copyright (c) 2020 DVKA
 */

package de.gft.bestellbestaetigung;

import de.gft.*;

@NachrichtId(types = {NachrichtTyp.BESTELLBESTAETIGUNG})
public class BestellbestaetigungConfiguration implements NachrichtConfiguration<BestellbestaetigungContext> {

  private final BestellbestaetigungOperations bestellbestaetigungOperations = new BestellbestaetigungOperations();
  private final DefaultEmailOperations defaultEmailOperations = new DefaultEmailOperations();

  @Override
  public PrepareDataOperation<BestellbestaetigungContext> getPrepareDataOperation() {
    return defaultEmailOperations.prepareVorgang()
            .andThen(bestellbestaetigungOperations.prepareBestellnummer())
            .andThen(defaultEmailOperations.prepareEmpfaenger());
  }

  @Override
  public ProcessDataOperation<BestellbestaetigungContext> getProcessDataOperation() {
    return bestellbestaetigungOperations.createEmail();
  }


  @Override
  public EmailSendingOperation<BestellbestaetigungContext> getEmailSendingOperation() {
    return defaultEmailOperations.sendeEmail();
  }

}
