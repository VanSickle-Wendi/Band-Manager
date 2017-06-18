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
public class GameMenuView extends MenuView {

    private String menu;
    private String promptMessage;
    private Game game;

    public GameMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Game Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nM -- View Map"
                + "\nA -- Asset Menu"
                + "\nB -- Bank Menu"
                + "\nH -- Hold Auditions"
                + "\nR -- Rehearsal"
                + "\nT -- Travel to a New Location"
                + "\nC -- Check into a New Hotel"
                + "\nG -- Gig Performance"
                + "\nV -- View Band Members and Status"
                + "\nQ -- Quit the Game Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Game Menu option: ");

    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
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
            case "R": // Hold Auditions
                this.rehearsal();
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
        auditionMenu.display();
    }
    
    private void rehearsal() {
        // display the RehearsalView
        RehearsalView onlyRehearsal = new RehearsalView();
        onlyRehearsal.display();
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
