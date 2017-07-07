/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.BandManager;
import byui.cit260.bandManager.exceptions.GameControlException;
import byui.cit260.bandManager.model.CarLotScene;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.InstrumentType;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.MusicStoreScene;
import byui.cit260.bandManager.model.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
        

        createMap(game);
        
        // move actors to starting position in the map. Do we need this? p15
       
        return game;
    }
    public static void createMap(Game game) {
        Map map = MapControl.createMap();
        game.setMap(map);    
    }
   
    public static MusicStoreScene[] MusicStoreScene() {
        System.out.println("called MusicStoreScene");
        return null;
    }
    
    public static CarLotScene[] CarLotScene() {
        System.out.println("called CarLotScene");
        return null;
    }

    public static void saveGame(Game game, String filePath) 
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        BandManager.setCurrentGame(game); // save in BandManager      
    }
         
    }
    

