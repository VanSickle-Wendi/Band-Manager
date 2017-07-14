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
 * @param <E>
 */
public class PurchasedInstruments<E> extends ArrayList<E> implements Serializable {
   // private final MusicStoreScene scene = new MusicStoreScene();
    private Game game;

    public PurchasedInstruments() {
    }
    
    public void setGame(Game game) {
        this.game = game;
    } 
    
    public ArrayList addPurchasedInstruments() {
        BuyInstrumentsMenuView showDrums = new BuyInstrumentsMenuView();
        MusicStoreMenuView showDrums1 = new MusicStoreMenuView();
        
        
        ArrayList<Instrument[]> bandInstruments = new ArrayList<>();
         
        
       
        
        return bandInstruments;
        
            
    }
       
}
