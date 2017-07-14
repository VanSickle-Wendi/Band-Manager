/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
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
                + "\nI -- Display Instruments you own"
                + "\nK -- Display Vehicle you own"    
                + "\nV -- Purchase / Upgrade Vehicle"
                + "\nP -- View Performance Points"
                + "\nQ -- Quit the Asset Menu"
                + "\n-------------------------------------------------"
                + "\n"
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
                this.displayInstrumentAssets();
                break;
            case "V": // Purchase / Upgrade Vehicle
                this.purchaseUpgradeVehicle();
                break;
            case "K": // Purchase / Upgrade Vehicle
                this.displayVehicleAssets();
                break;
            case "P": // View Performance Points
                this.viewPerformancePoints();
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

    private void viewCurrentAssets() {
        this.console.println("*** viewCurrentAssets function called ***");
    }
    
    private void displayVehicleAssets(){
        console.println(BandManager.getCurrentGame().getVehicles());
    }

    private void displayInstrumentAssets() {
        console.println(BandManager.getCurrentGame().getInstruments());
    }

    private void purchaseUpgradeVehicle() {
        this.console.println("*** purchaseUpgradeVehicle function called ***");
    }

    private void viewPerformancePoints() {
        this.console.println("*** viewPerformancePoints function called ***");
    }

    
}
