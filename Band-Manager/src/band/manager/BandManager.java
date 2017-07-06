/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager;

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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Wendi
 */
public class BandManager {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static void main(String[] args) {

        try {
            // open character stream files for end user input and output
            BandManager.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            BandManager.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            BandManager.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();            
        startProgramView.display();
        return;
        
        }catch (Throwable te) {
            
            System.out.println("Exception: " + te.toString() +
                               "\nCause: " + te.getCause() +
                               "\nMessage: " + te.getMessage());
            te.printStackTrace();
        }
        
        finally { 
            try {
                if (BandManager.inFile != null)
                    BandManager.inFile.close();
                
                if (BandManager.outFile != null)
                    BandManager.outFile.close();
                
                if (BandManager.logFile != null)
                    BandManager.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }          
        }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        BandManager.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        BandManager.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        BandManager.logFile = logFile;
    }



    
}
