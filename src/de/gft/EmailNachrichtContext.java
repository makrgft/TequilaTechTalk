/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public class EmailNachrichtContext<D extends NachrichtDescriptor> implements NachrichtContext<D> {

  private D nachrichtDescriptor;

  private String vorgang;
  private String email;
  private String empfaenger;

  public String getVorgang() {
    return vorgang;
  }

  public void setVorgang(String vorgang) {
    this.vorgang = vorgang;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmpfaenger() {
    return empfaenger;
  }

  public void setEmpfaenger(String empfaenger) {
    this.empfaenger = empfaenger;
  }

  @Override
  public D getNachrichtDescriptor() {
    return nachrichtDescriptor;
  }

  public void setNachrichtDescriptor(D nachrichtDescriptor) {
    this.nachrichtDescriptor = nachrichtDescriptor;
  }
}
