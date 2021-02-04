/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public interface NachrichtConfiguration<C extends NachrichtContext>{
  PrepareDataOperation<C> getPrepareDataOperation();

  ProcessDataOperation<C> getProcessDataOperation();

  EmailSendingOperation<C> getEmailSendingOperation();

}