/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import static byui.cit260.bandManager.control.GameControl.MusicStoreScene;
import byui.cit260.bandManager.model.MusicStoreScene;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class MusicStoreMenuView extends MenuView {

    //private String promptMessage;
    private final MusicStoreScene scene = new MusicStoreScene();
    private Game game;

    public MusicStoreMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| You are at the Music Store                    |"
                + "\n-------------------------------------------------"
                + "\nD -- View List of Drums"
                + "\nG -- View List of Guitars"
                + "\nB -- View List of Bass Guitars"
                + "\nK -- View List of Keyboards"
                + "\nM -- View List of Microphones"
                + "\nI -- Purchase/Upgrade Equipment"
                + "\nQ -- Leave Music Store"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Music Store Menu option: ");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // View Current Assets
                this.viewListOfDrums(scene.getDrums());
                break;
            case "G": // Purchase / Upgrade Vehicle
                this.viewListofGuitars(scene.getGuitar());
                break;
            case "B": // View Performance Points
                this.viewListOfBassGuitars(scene.getBass());
                break;
            case "K": // View Performance Points
                this.viewListOfKeyboards(scene.getKeyboard());
                break;
            case "M": // View Performance Points
                this.viewListOfMicrophones(scene.getMic());
                break;
            case "I": // Purchase / Upgrade Instruments
                this.purchaseUpgradeInstruments();
                break;
            case "Q": // Quit
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }
    
    public void setGame(Game game) {
        this.game = game;
    }    

    private void viewListOfDrums(Instrument[] drums) {
        StringBuilder line;

        // Display header
        this.console.println("\n                    List of Drums");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument");
        line.insert(12, "Description");
        line.insert(30, "Price");
        line.insert(40, "Points");
        line.insert(50, "Level");
        this.console.println(line.toString());

        // for each loop to display the drums    
        for (Instrument drum : drums) {
            line = new StringBuilder("                                 ");
            line.insert(0, drum.getType());
            line.insert(12, drum.getDescription());
            line.insert(30, drum.getPrice());
            line.insert(40, drum.getPerformancePoints());
            line.insert(50, drum.getLevel());

            // Display the line
            this.console.println(line.toString());

        }

    }

    private void viewListofGuitars(Instrument[] guitars) {
        StringBuilder line;

        // Display header
        this.console.println("\n                     List of Guitars");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument");
        line.insert(12, "Description");
        line.insert(30, "Price");
        line.insert(40, "Points");
        line.insert(50, "Level");
        this.console.println(line.toString());

        // for each loop to display the guitars    
        for (Instrument guitar : guitars) {
            line = new StringBuilder("                                 ");
            line.insert(0, guitar.getType());
            line.insert(12, guitar.getDescription());
            line.insert(30, guitar.getPrice());
            line.insert(40, guitar.getPerformancePoints());
            line.insert(50, guitar.getLevel());

            // Display the line
            this.console.println(line.toString());

        }
    }

    private void viewListOfBassGuitars(Instrument[] bass) {
        StringBuilder line;

        // Display header
        this.console.println("\n                List of Bass Guitars");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument");
        line.insert(12, "Description");
        line.insert(30, "Price");
        line.insert(40, "Points");
        line.insert(50, "Level");
        this.console.println(line.toString());

        // for each loop to display bass guitars    
        for (Instrument bassG : bass) {
            line = new StringBuilder("                                 ");
            line.insert(0, bassG.getType());
            line.insert(12, bassG.getDescription());
            line.insert(30, bassG.getPrice());
            line.insert(40, bassG.getPerformancePoints());
            line.insert(50, bassG.getLevel());

            // Display the line
            this.console.println(line.toString());

        }
    }

    private void viewListOfKeyboards(Instrument[] keyboards) {
        StringBuilder line;

        // Display header
        this.console.println("\n                   List of Keyboards");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument");
        line.insert(12, "Description");
        line.insert(30, "Price");
        line.insert(40, "Points");
        line.insert(50, "Level");
        this.console.println(line.toString());

        // for each loop to display the keyboards    
        for (Instrument keyboard : keyboards) {
            line = new StringBuilder("                                 ");
            line.insert(0, keyboard.getType());
            line.insert(12, keyboard.getDescription());
            line.insert(30, keyboard.getPrice());
            line.insert(40, keyboard.getPerformancePoints());
            line.insert(50, keyboard.getLevel());

            // Display the line
            this.console.println(line.toString());

        }
    }

    private void viewListOfMicrophones(Instrument[] microphones) {
        StringBuilder line;

        // Display header
        this.console.println("\n                  List of Microphones");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument");
        line.insert(12, "Description");
        line.insert(30, "Price");
        line.insert(40, "Points");
        line.insert(50, "Level");
        this.console.println(line.toString());

        // for each loop to display the mics    
        for (Instrument mics : microphones) {
            line = new StringBuilder("                                 ");
            line.insert(0, mics.getType());
            line.insert(12, mics.getDescription());
            line.insert(30, mics.getPrice());
            line.insert(40, mics.getPerformancePoints());
            line.insert(50, mics.getLevel());

            // Display the line
            this.console.println(line.toString());

        }

    }

    private void purchaseUpgradeInstruments() {
        
         // display the BuyInstrumentsMenuView (July 7 - Shannon is still working on this)
      //  BuyInstrumentsMenuView buyInstrumentsMenu = new BuyInstrumentsMenuView();
      //  buyInstrumentsMenu.setGame(game);
      //  buyInstrumentsMenu.display();
        
        
        MusicStoreView buyIt = new MusicStoreView();
        buyIt.display();
    }

}
