/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.BandManager;
import byui.cit260.bandManager.model.Player;

/**
 *
 * @author Crazian
 */
public class GameControl {

    public static Player createPlayer(String playersName) {

        if (playersName == null) {
            return null;
        }
            
        Player player = new Player();
        player.setPlayersName(playersName);
            
        BandManager.setPlayer(player); // save the player
            
        return player;     
    }
    
}
