/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Map;

/**
 *
 * @author Wendi
 */
public class MapView {
    
    private void displayMap() {
        Game game = BandManager.getCurrentGame();
        Map map = game.getMap();
        Location[] locations = map.getLocations();
        
        for (int i=0; i < locations.length; i++){
            System.out.println("Location " + locations[1].getName() + "! "
                               + locations[i].getScene().getDescription());
        }
    }
    
}
