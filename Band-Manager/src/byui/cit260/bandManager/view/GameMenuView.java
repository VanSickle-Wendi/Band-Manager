/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.model.Game;
import java.util.Scanner;

/**
 *
 * @author Crazian
 */
public class GameMenuView {

    private String menu;
    private String promptMessage;
    private Game game;

    public GameMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Game Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nM -- View Map"
                + "\nA -- Asset Menu"
                + "\nB -- Bank Menu"
                + "\nH -- Hold Auditions"
                + "\nT -- Travel to a New Location"
                + "\nC -- Check into a New Hotel"
                + "\nG -- Gig Performance"
                + "\nV -- View Band Members and Status"
                + "\nQ -- Quit the Game Menu"
                + "\n-------------------------------------------------";

        this.promptMessage = "\nPlease choose a Game Menu option: ";

    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void displayGameMenuView() {

        boolean done = false; // set flag to not done
        do {
            System.out.println(menu);
            // prompt for and get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; //exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;

            }
            valid = true; // End the loop
        }
        return value; // return the value entered
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "M": // View Map
                this.viewMap();
                break;
            case "A": // Asset Menu
                this.viewAssetMenu();
                break;
            case "B": // Bank Menu
                this.viewBankMenu();
                break;
            case "H": // Hold Auditions
                this.holdAuditions();
                break;
            case "T": // Travel to New Location
                this.travelToNewLocation();
                break;
            case "C": // Check into hotel
                this.checkInHotel();
                break;
            case "G": // Gig Performance
                this.gigPerformance();
                break;
            case "V": // View band members and status
                this.bandMemberStatus();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void viewAssetMenu() {
        // display the asset menu
        AssetMenuView assetMenu = new AssetMenuView();
        assetMenu.display();
    }

    private void viewBankMenu() {
        // display the Bank menu
        BankMenuView bankMenu = new BankMenuView();
        bankMenu.display();
    }

    private void holdAuditions() {
        // display the audition menu
        AuditionMenuView auditionMenu = new AuditionMenuView();
        auditionMenu.setGame(game);
        auditionMenu.displayAuditionMenuView();
    }

    private void travelToNewLocation() {
        System.out.println("*** travelToNewLocation function called ***");
    }

    private void checkInHotel() {
        System.out.println("*** checkInHotel function called ***");
    }

    private void gigPerformance() {
        System.out.println("*** gigPerformance function called ***");
    }

    private void bandMemberStatus() {
        System.out.println("*** bandMemberStatus function called ***");
    }

}
