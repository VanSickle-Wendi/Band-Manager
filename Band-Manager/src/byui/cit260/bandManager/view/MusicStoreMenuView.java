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

    private String promptMessage;

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
                + "\nPlease choose an Music Store Menu option: ");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // View Current Assets
                this.viewListOfDrums();
                break;
            case "G": // Purchase / Upgrade Vehicle
                this.viewListofGuitars();
                break;
            case "B": // View Performance Points
                this.viewListOfBassGuitars();
                break;
            case "K": // View Performance Points
                this.viewListOfKeyboards();
                break;
            case "M": // View Performance Points
                this.viewListOfMicrophones();
                break;
            case "I": // Purchase / Upgrade Instruments
                this.purchaseUpgradeInstruments();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void viewListOfDrums() {
        StringBuilder line;

        Game game = BandManager.getCurrentGame();
        MusicStoreScene[] instrument = game.getInstruments();

        System.out.println("\n         List of Instruments");
        line = new StringBuilder("                                     ");
        line.insert(0, "Instrument Type");
        line.insert(20, "Description");
        line.insert(40, "Price");
        line.insert(50, "Performance Points");
        System.out.println(line.toString());

        // for each instrument item
        for (MusicStoreScene item : instrument) {
            line = new StringBuilder("                                 ");
            line.insert(0, item.getType());
            line.insert(23, item.getDescription());
            line.insert(33, item.getPrice());
            line.insert(43, item.getPerformancePoints());

            // Display the line
            System.out.println(line.toString());

        }

    }

    private void viewListofGuitars() {
        System.out.println("*** viewListofGuitars function called ***");
    }

    private void viewListOfBassGuitars() {
        System.out.println("*** viewListOfBassGuitars function called ***");
    }

    private void viewListOfKeyboards() {
        System.out.println("*** viewListOfKeyboards function called ***");
    }

    private void viewListOfMicrophones() {
        System.out.println("*** viewListOfMicrophones function called ***");
    }

    private void purchaseUpgradeInstruments() {
        MusicStoreView buyIt = new MusicStoreView();
        buyIt.display();
    }

}
