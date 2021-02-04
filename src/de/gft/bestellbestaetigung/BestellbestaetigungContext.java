package de.gft.bestellbestaetigung;

import de.gft.EmailNachrichtContext;
import de.gft.NachrichtDescriptor;

public class BestellbestaetigungContext extends EmailNachrichtContext<NachrichtDescriptor> {

    private Integer bestellnummer;

    public Integer getBestellnummer() {
        return bestellnummer;
    }

    public void setBestellnummer(Integer bestellnummer) {
        this.bestellnummer = bestellnummer;
    }
}