/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public class DefaultEmailOperations {

    public <T extends EmailNachrichtContext> PrepareDataOperation<T> prepareVorgang() {
        return context -> {
            context.setVorgang("1234567");
            return context;
        };
    }

    public <T extends EmailNachrichtContext> PrepareDataOperation<T> prepareEmpfaenger() {
        return context -> {
            context.setEmpfaenger("empfaenger@nachricht.de");
            return context;
        };
    }

    public <T extends EmailNachrichtContext> EmailSendingOperation<T> sendeEmail() {
        return context -> {
            System.out.println(context.getEmail());
            return context;
        };
    }
}
