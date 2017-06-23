/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.AuditionControl;
import byui.cit260.bandManager.control.PerformanceControl;
import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class AuditionMenuView extends MenuView {

    private String promptMessage;
    private AuditionControl auditionControl;
    private Game game;

    public AuditionMenuView() {
            super("\n"
                + "\n-------------------------------------------------"
                + "\n| Audition Menu                                 |"
                + "\n-------------------------------------------------"
                + "\nD -- Audition a Drummer"
                + "\nS -- Audition a Singer"
                + "\nG -- Audition a Guitar Player"
                + "\nB -- Audition a Bass Player"
                + "\nK -- Audition a Keyboard Player"
                + "\nC -- Calculate Audition Points"
                + "\nQ -- Quit the Audition Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nChoose a band member to audition: ");

        auditionControl = new AuditionControl();

    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "D": // Audition a Drummer
                this.auditionDrummer();
                break;
            case "S": // Audition a Singer
                this.auditionSinger();
                break;
            case "G": // Audition a Guitar Player
                this.auditionGuitarPlayer();
                break;
            case "B": // Audition a Bass Player
                this.auditionBassPlayer();
                break;
            case "K": // Audition a Keyboard Player
                this.auditionKeyboardPlayer();
                break;
            case "C": // Calculate Audition Points
                this.calculateBandAuditionPoints();
                break;
            case "Q": // Quit
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private String getUserInput(String prompt) {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + prompt);
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break; // end the loop
        }

        return value; // return the value entered
    }

    private void auditionDrummer() {
        String drummersName = getUserInput("What is your drummer's name?");
        String drummersIssue = getUserInput("What is your drummer's issue?");

        BandMember drummer = auditionControl.createBandMember("Drummer", drummersName, drummersIssue);
        game.getBand().setDrummer(drummer);

        System.out.println(drummer);
    }

    private void auditionSinger() {
        String singersName = getUserInput("What is your singer's name?");
        String singersIssue = getUserInput("What is your singer's issue?");

        BandMember singer = auditionControl.createBandMember("Singer", singersName, singersIssue);
        game.getBand().setSinger(singer);

        System.out.println(singer);
    }

    private void auditionGuitarPlayer() {
        String guitarPlayersName = getUserInput("What is your guitar player's name?");
        String guitarPlayersIssue = getUserInput("What is your guitar player's issue?");

        BandMember guitarPlayer = auditionControl.createBandMember("Guitar Player", guitarPlayersName, guitarPlayersIssue);
        game.getBand().setGuitarPlayer(guitarPlayer);

        System.out.println(guitarPlayer);
    }

    private void auditionBassPlayer() {
        String bassPlayersName = getUserInput("What is your bass player's name?");
        String bassPlayersIssue = getUserInput("What is your bass player's issue?");

        BandMember bassPlayer = auditionControl.createBandMember("Bass Player", bassPlayersName, bassPlayersIssue);
        game.getBand().setBassPlayer(bassPlayer);

        System.out.println(bassPlayer);
    }

    private void auditionKeyboardPlayer() {
        String keyboardPlayersName = getUserInput("What is your keyboard player's name?");
        String keyboardPlayersIssue = getUserInput("What is your keyboard player's issue?");

        BandMember keyboardPlayer = auditionControl.createBandMember("Keyboard Player", keyboardPlayersName, keyboardPlayersIssue);
        game.getBand().setKeyboardPlayer(keyboardPlayer);

        System.out.println(keyboardPlayer);
    }

    private void calculateBandAuditionPoints() {
        System.out.println("*** calculateBandAuditionPoints function called ***");
    }

}
