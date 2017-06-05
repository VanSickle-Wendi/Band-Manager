/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class AssetMenuView {
    
    private String menu;
    private String promptMessage;

    public AssetMenuView() {
        this.menu = "\n"
                + "\n-------------------------------------------------"
                + "\n| Asset Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nC -- Current Assets"
                + "\nI -- Purchase / Upgrade Instruments"
                + "\nV -- Purchase / Upgrade Vehicle"
                + "\nP -- View Performance Points"
                + "\nQ -- Quit the Asset Menu"
                + "\n-------------------------------------------------";     
        
        this.promptMessage = "\nPlease choose an Asset Menu option: ";        
        
    } 
    
    public void displayAssetMenuView() {

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
            case "C": // View Current Assets
                this.viewCurrentAssets();
                break;
            case "I": // Purchase / Upgrade Instruments
                this.purchaseUpgradeInstruments();
                break;
            case "V": // Purchase / Upgrade Vehicle
                this.purchaseUpgradeVehicle();
                break;
            case "P": // View Performance Points
                this.viewPerformancePoints();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }    

    private void viewCurrentAssets() {
        System.out.println("*** viewCurrentAssets function called ***");
    }

    private void purchaseUpgradeInstruments() {
        System.out.println("*** purchaseUpgradeInstruments function called ***");
    }

    private void purchaseUpgradeVehicle() {
        System.out.println("*** purchaseUpgradeVehicle function called ***");
    }

    private void viewPerformancePoints() {
        System.out.println("*** viewPerformancePoints function called ***");
    }
    
}
