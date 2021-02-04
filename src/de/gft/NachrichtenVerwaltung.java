package de.gft;

import de.gft.bestellbestaetigung.BestellbestaetigungConfiguration;
import de.gft.bestellbestaetigung.BestellbestaetigungContext;
import de.gft.bestellbestaetigung.BestellbestaetigungDescriptor;
import de.gft.versandbestaetigung.VersandbestaetigungConfiguration;
import de.gft.versandbestaetigung.VersandbestaetigungContext;
import de.gft.versandbestaetigung.VersandbestaetigungDescriptor;

/**
 * Class NachrichtenVerwaltung.
 *
 * @author GFT Technologies SE
 */
public class NachrichtenVerwaltung {

    public static void main(String[] args){
        NachrichtService nachrichtService = new NachrichtService();
        nachrichtService.process(NachrichtTyp.BESTELLBESTAETIGUNG, new BestellbestaetigungConfiguration(), new BestellbestaetigungDescriptor(), new BestellbestaetigungContext());
        nachrichtService.process(NachrichtTyp.VERSANDBESTAETIGUNG, new VersandbestaetigungConfiguration(), new VersandbestaetigungDescriptor(), new VersandbestaetigungContext());
    }
}
