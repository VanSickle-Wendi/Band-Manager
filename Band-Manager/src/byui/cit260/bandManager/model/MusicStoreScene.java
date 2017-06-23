/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author shaza
 */
public class MusicStoreScene implements Serializable {
    

    public MusicStoreScene() {

        Instrument[] drums = new Instrument[4];
        drums[0] = new Instrument(InstrumentType.Drums, "Yamaha Stage", 499.99, 10);
        drums[1] = new Instrument(InstrumentType.Drums, "Pearl Masters", 749.50, 20);
        drums[0] = new Instrument(InstrumentType.Drums, "Tama Silverstar", 1099.99, 40);
        drums[1] = new Instrument(InstrumentType.Drums, "DW Performance", 1665.98, 80);
    }

}
