/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import byui.cit260.bandManager.view.BuyInstrumentsMenuView;
import byui.cit260.bandManager.view.MusicStoreMenuView;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author shaza
 */
public class PurchasedInstruments implements Serializable {
   // private final MusicStoreScene scene = new MusicStoreScene();
    private Game game;

    public PurchasedInstruments() {
    }
    
    public void setGame(Game game) {
        this.game = game;
    } 
    
    public ArrayList<MusicStoreScene> addPurchasedInstruments() {
        BuyInstrumentsMenuView showDrums = new BuyInstrumentsMenuView();
        MusicStoreMenuView showDrums1 = new MusicStoreMenuView();
        Instrument dumb = null;
        
        ArrayList<MusicStoreScene> bandInstruments = new ArrayList<>();
         
        
       // bandInstrument.add(new MusicStoreScene(showDrums.buyDrums(drums)
        
        return null;
        
       
        
    }
    
    
}
