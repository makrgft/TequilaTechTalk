/*
 * Copyright (c) 2020 DVKA
 */

package de.gft.versandbestaetigung;

import de.gft.*;

@NachrichtId(types = {NachrichtTyp.VERSANDBESTAETIGUNG})
public class VersandbestaetigungConfiguration implements NachrichtConfiguration<VersandbestaetigungContext> {

  private VersandbestaetigungOperations versandbestaetigungOperations = new VersandbestaetigungOperations();
  private DefaultEmailOperations defaultEmailOperations = new DefaultEmailOperations();

  @Override
  public PrepareDataOperation<VersandbestaetigungContext> getPrepareDataOperation() {
    return defaultEmailOperations.prepareVorgang()
            .andThen(defaultEmailOperations.prepareEmpfaenger());
  }

  @Override
  public ProcessDataOperation<VersandbestaetigungContext> getProcessDataOperation() {
    return versandbestaetigungOperations.druckeVersandlabel()
            .andThen(versandbestaetigungOperations.createEmail())
     ;
  }

  @Override
  public EmailSendingOperation<VersandbestaetigungContext> getEmailSendingOperation() {
    return defaultEmailOperations.sendeEmail();
  }

}
