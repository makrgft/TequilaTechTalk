/*
 * Copyright (c) 2019 DVKA
 */

package de.gft;

public class NachrichtOrchestrator {

    @SuppressWarnings("unchecked")
    public <T extends NachrichtContext> T  applyStandardfolge(NachrichtConfiguration actionConfiguration,
                                               NachrichtDescriptor nachrichtDescriptor,
                                               T context) {
        context.setNachrichtDescriptor(nachrichtDescriptor);

        context = (T) actionConfiguration.getPrepareDataOperation().apply(context);
        context = (T) actionConfiguration.getProcessDataOperation().apply(context);
        context = (T) actionConfiguration.getEmailSendingOperation().apply(context);
        return context;
    }
}
