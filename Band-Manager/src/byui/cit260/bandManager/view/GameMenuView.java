/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
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
                + "\nH -- Audition Menu"
                + "\nZ -- Music Store"
                + "\nK -- Car Lot"
                + "\nR -- Rehearsal"
                + "\nI -- Radio Interview"
                + "\nT -- TV Appearance"
                + "\nF -- Movie Cameo"
                + "\nS -- Star Party"
                + "\nN -- Travel to a New Location"
                + "\nC -- Check into a New Hotel"
                + "\nG -- Big Gig Performance"
                + "\nJ -- Small Gig Performance"
                + "\nV -- View Band Members and Status Menu"
                + "\nL -- Lists of Ideas"
                + "\nD -- Report Menu"
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
            case "Z": // Hold Auditions
                this.goToMusicStore();
                break;
            case "K": // Hold Auditions
                this.goToCarLot();
                break;
            case "R": // Hold Auditions
                this.rehearsal();
                break;
            case "I": // Radio Interview
                this.radio();
                break;
            case "T": // TV Appearance
                this.tv();
                break;
            case "F": // Movie Cameo
                this.movie();
                break;
            case "S": // Star Party
                this.star();
                break;
            case "N": // Travel to New Location
                this.travelToNewLocation();
                break;
            case "C": // Check into hotel
                this.checkInHotel();
                break;
            case "G": // Biggig Performance
                this.bigGigPerformance();
                break;
            case "J": // SmallGig Performance
                this.smallGigPerformance();
                break;
            case "V": // View band members and status
                this.bandMemberStatus();
                break;
            case "L": // Ideas for the game
                this.listsOfIdeas();
                break;
            case "D": // Reports
                this.reportMenu();
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

    private void viewMap() {
        MapView showMap = new MapView();
        showMap.displayMap();
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

    private void goToMusicStore() {
        // display the Bank menu
        MusicStoreMenuView musicMenu = new MusicStoreMenuView();
        musicMenu.display();
    }

    private void goToCarLot() {
        CarLotMenuView carMenu = new CarLotMenuView();
        carMenu.display();
    }

    private void rehearsal() {
        // display the RehearsalView
        RehearsalView onlyRehearsal = new RehearsalView();
        onlyRehearsal.display();
    }

    private void radio() {
        // display the RadioInterview
        RadioInterview onlyRadio = new RadioInterview();
        onlyRadio.display();
    }

    private void tv() {
        // display the TVAppearanceView
        TVAppearanceView onlyTV = new TVAppearanceView();
        onlyTV.display();
    }

    private void movie() {
        // display the MovieCameoView
        MovieCameoView onlyMovie = new MovieCameoView();
        onlyMovie.display();
    }

    private void star() {
        // display the StarPartyView
        StarPartyView onlyStar = new StarPartyView();
        onlyStar.display();
    }

    private void travelToNewLocation() {
        this.console.println("*** travelToNewLocation function called ***");
    }

    private void checkInHotel() {
        HotelCheckInView checkIn = new HotelCheckInView();
        checkIn.display();
    }

    private void smallGigPerformance() {
        SmallGigView checkIn = new SmallGigView();
        checkIn.display();
    }

    private void bigGigPerformance() {
        BigGigView checkIn = new BigGigView();
        checkIn.display();
    }

    private void bandMemberStatus() {
        MemberStatusMenuView MemberStatusMenu = new MemberStatusMenuView();
        MemberStatusMenu.display(); 
    }

    private void listsOfIdeas() {
        IdeaMenuView ideaMenu = new IdeaMenuView();
        ideaMenu.display();
    }

    private void reportMenu() {
        ReportMenuView reportsMenu = new ReportMenuView();
        reportsMenu.display();        
    }

}
