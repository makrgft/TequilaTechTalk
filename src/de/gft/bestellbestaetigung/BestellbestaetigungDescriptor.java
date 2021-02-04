/*
 * Copyright (c) 2019 DVKA
 */

package de.gft.bestellbestaetigung;

import de.gft.NachrichtId;
import de.gft.NachrichtDescriptor;
import de.gft.NachrichtTyp;

@NachrichtId(types = {NachrichtTyp.BESTELLBESTAETIGUNG})
public class BestellbestaetigungDescriptor implements NachrichtDescriptor {

    @Override
    public String getNachrichtenTyp() {
        return "Bestellbestätigung";
    }
}
