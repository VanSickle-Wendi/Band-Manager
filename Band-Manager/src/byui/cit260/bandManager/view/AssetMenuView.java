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
public class AssetMenuView extends MenuView {

    private String promptMessage;

    public AssetMenuView() {
            super("\n"
                + "\n-------------------------------------------------"
                + "\n| Asset Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nC -- Current Assets"
                + "\nI -- Purchase / Upgrade Instruments"
                + "\nV -- Purchase / Upgrade Vehicle"
                + "\nP -- View Performance Points"
                + "\nQ -- Quit the Asset Menu"
                + "\n-------------------------------------------------"
                + "\nPlease choose an Asset Menu option: ");

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
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
