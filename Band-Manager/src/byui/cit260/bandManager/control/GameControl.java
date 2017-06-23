/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.BandManager;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Map;
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

    public static Game createNewGame(Player player) {
        Game game = new Game();
        BandManager.setCurrentGame(game); // save in BandMangager
        
        game.setPlayer(player); // save player in game        

        // Create Instrument list and save in the game
        // Create Vehicle list and save in the game   
        

        Map map = MapControl.createMap();
        game.setMap(map);
       
        return game;
    }
    

    public void finalNetWorth() {
        System.out.println("*** finalNetWorth function called ***");
    }

}
