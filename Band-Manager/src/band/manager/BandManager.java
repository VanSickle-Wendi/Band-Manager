/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager;

import byui.cit260.bandManager.model.AuditionScene;
import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.BankScene;
import byui.cit260.bandManager.model.Equipment;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.PerformanceScene;
import byui.cit260.bandManager.model.Player;
import byui.cit260.bandManager.model.Scene;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.SpendingScene;
import byui.cit260.bandManager.model.Vehicle;
import byui.cit260.bandManager.view.StartProgramView;
        
/**
 *
 * @author Wendi
 */
public class BandManager {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BandManager.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BandManager.player = player;
    }

}
