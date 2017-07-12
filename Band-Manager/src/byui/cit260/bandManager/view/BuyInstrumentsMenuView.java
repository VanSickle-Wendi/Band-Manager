/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.exceptions.BankControlException;
import byui.cit260.bandManager.exceptions.EquipmentControlException;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.MusicStoreScene;
import java.io.PrintWriter;

/**
 *
 * @author shaza
 */
public class BuyInstrumentsMenuView extends MenuView {

    private String promptMessage;
    private EquipmentControl equipmentControl;
    private final MusicStoreScene scene = new MusicStoreScene();
    private Game game;
    int item;

    public BuyInstrumentsMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Buy Instruments Menu                          |"
                + "\n-------------------------------------------------"
                + "\nD -- Buy Drums"
                + "\nG -- Buy Guitar"
                + "\nB -- Buy Bass Guitar"
                + "\nK -- Buy Keyboard"
                + "\nM -- Buy Microphone"
                + "\nR -- Print List of Instruments"
                + "\nA -- Go to Asset Menu"
                + "\nQ -- Quit the Audition Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nChoose a type of instrument to purchase: ");

        equipmentControl = new EquipmentControl();

    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // Audition a Drummer
                this.buyDrums(scene.getDrums());
                break;
            case "G": // Audition a Singer
                this.buyGuitar(scene.getGuitar());
                break;
            case "B": // Audition a Guitar Player
                this.buyBassGuitar(scene.getBass());
                break;
            case "K": // Audition a Bass Player
                this.buyKeyboards(scene.getKeyboard());
                break;
            case "M": // Audition a Keyboard Player
                this.buyMicrophone(scene.getMic());
                break;
            case "R": // Calculate Audition Points
                this.printList();
                break;
            case "A": // Calculate Audition Points
                this.goToAssetMenu();
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

    private String getUserInput(String prompt) {

        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        try {

            while (!valid) { // loop while an invalid value is entered
                this.console.println("\n" + prompt);
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\nInvalid value: value can not be blank");
                    continue;
                }
                break; // end the loop
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }

        return value; // return the value entered
    }

    private Instrument buyDrums(Instrument[] drums) {
        Instrument bandDrums = null;
        MusicStoreMenuView showDrums = new MusicStoreMenuView();
        int buyDrums = 0;
        int a = 1;

        showDrums.viewListOfDrums(scene.getDrums());
        do {
            try {
                buyDrums = Integer.parseInt(getUserInput("Please enter the level of drums "
                        + "\nyou would like to purchase (1, 2, 3, or 4): "));
                a = 2;

            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, 3, or 4");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.drumAsset(buyDrums);
            bandDrums = drums[item];

            PrintWriter pw = new PrintWriter(console);

            pw.printf("You have purchased %s, ", bandDrums.getType());
            pw.printf("%s, ", bandDrums.getDescription());
            pw.printf("$%s%n", bandDrums.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandDrums;
    }

    private Instrument buyGuitar(Instrument[] guitar) {
        Instrument bandGuitar = null;
        MusicStoreMenuView showGuitars = new MusicStoreMenuView();
        int buyGuitar = 0;
        int a = 1;

        showGuitars.viewListofGuitars(scene.getGuitar());
        do {
            try {
                buyGuitar = Integer.parseInt(getUserInput("Please enter the level of the guitar "
                        + "\nyou would like to purchase (1, 2, 3, or 4): "));
                a = 2;
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, 3, or 4");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.guitarAsset(buyGuitar);
            bandGuitar = guitar[item];

            PrintWriter pw = new PrintWriter(console);

            pw.printf("You have purchased %s, ", bandGuitar.getType());
            pw.printf("%s, ", bandGuitar.getDescription());
            pw.printf("$%s%n", bandGuitar.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandGuitar;

    }

    private Instrument buyBassGuitar(Instrument[] bass) {
        Instrument bandBass = null;
        MusicStoreMenuView showBassGuitars = new MusicStoreMenuView();
        int buyBass = 0;
        int a = 1;

        showBassGuitars.viewListOfBassGuitars(scene.getBass());
        do {
            try {
                buyBass = Integer.parseInt(getUserInput("Please enter the level of the bass guitar "
                        + "\nyou would like to purchase (1, 2, 3, or 4): "));
                a = 2;
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, 3, or 4");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.bassAsset(buyBass);
            bandBass = bass[item];

            PrintWriter pw = new PrintWriter(console);

            pw.printf("You have purchased %s, ", bandBass.getType());
            pw.printf("%s, ", bandBass.getDescription());
            pw.printf("$%s%n", bandBass.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandBass;
    }

    private Instrument buyKeyboards(Instrument[] keyboard) {
        Instrument bandKeyboards = null;
        MusicStoreMenuView showKeyboards = new MusicStoreMenuView();
        int buyKeyboards = 0;
        int a = 1;

        showKeyboards.viewListOfKeyboards(scene.getKeyboard());
        do {
            try {
                buyKeyboards = Integer.parseInt(getUserInput("Please enter the level of keyboards "
                        + "\nyou would like to purchase (1, 2, 3, or 4):  "));
                a = 2;
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, 3, or 4");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.keyboardAsset(buyKeyboards);
            bandKeyboards = keyboard[item];

            PrintWriter pw = new PrintWriter(console);

            pw.printf("You have purchased %s, ", bandKeyboards.getType());
            pw.printf("%s, ", bandKeyboards.getDescription());
            pw.printf("$%s%n", bandKeyboards.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandKeyboards;
    }

    private Instrument buyMicrophone(Instrument[] mic) {
        Instrument bandMic = null;
        MusicStoreMenuView showMicrophones = new MusicStoreMenuView();
        int buyMic = 0;
        int a = 1;

        showMicrophones.viewListOfMicrophones(scene.getMic());
        do {
            try {
                buyMic = Integer.parseInt(getUserInput("Please enter the level of the microphone "
                        + "\nyou would like to purchase (1, 2, 3, or 4): "));
                a = 2;
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(),
                        "\nPlease type a 1, 2, 3, or 4");
            }

        } while (a == 1);
        // new instance of BankingControl class
        EquipmentControl bought = new EquipmentControl();

        try {

            item = bought.micAsset(buyMic);
            bandMic = mic[item];
            
              PrintWriter pw = new PrintWriter(console);
            
            pw.printf("You have purchased %s, ", bandMic.getType());
            pw.printf("%s, ", bandMic.getDescription());
            pw.printf("$%s%n", bandMic.getPrice());

        } catch (EquipmentControlException ece) {
            ErrorView.display(this.getClass().getName(), ece.getMessage());
        }

        return bandMic;

    }

    private void printList() {
        InstrumentReportView printReport = new InstrumentReportView();
        // assetMenu.setGame(game);
        printReport.display();
    }

    private void goToAssetMenu() {

        AssetMenuView assetMenu = new AssetMenuView();
        // assetMenu.setGame(game);
        assetMenu.display();
    }

}
