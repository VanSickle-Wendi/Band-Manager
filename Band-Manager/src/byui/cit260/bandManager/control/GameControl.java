/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.BandManager;
import byui.cit260.bandManager.exceptions.GameControlException;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.CarLotScene;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.InstrumentType;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.MusicStoreScene;
import byui.cit260.bandManager.model.Player;
import byui.cit260.bandManager.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

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
        MusicStoreScene[] instrumentList = GameControl.MusicStoreScene();
        game.setInstruments(instrumentList);

        // Create Vehicle list and save in the game  
        CarLotScene[] vehicleList = GameControl.CarLotScene();
        game.setVehicles(vehicleList);

        Map map = MapControl.createMap();
        game.setMap(map);
        //createMap(game);

        // move actors to starting position in the map. Do we need this? p15
        return game;
    }

    public static Map createMap(Game game) {
        Map map = MapControl.createMap();
        //game.setMap(map);  
        return map;
    }

    public static MusicStoreScene[] MusicStoreScene() {
        BandManager.getOutFile().println("called MusicStoreScene");
        BandManager.getLogFile().println("called MusicStoreScene");
        return null;
    }

    public static CarLotScene[] CarLotScene() {
        BandManager.getOutFile().println("called CarLotScene");
        BandManager.getLogFile().println("called CarLotScene");
        return null;
    }

    public static void saveGame(Game game, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game); // write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e);
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject(); // read the game object from file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        // close the output file
        BandManager.setCurrentGame(game); // save in BandManager      
    }
}
