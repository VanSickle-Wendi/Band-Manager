/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;

/**
 *
 * @author shaza
 */
public class MainMenuView extends MenuView {

    private String promptMessage;
    private Game game;

    public MainMenuView() {
            super("\n"
                + "\n-------------------------------------------------"
                + "\n| Main Menu                                     |"
                + "\n-------------------------------------------------"
                + "\nN -- Start new game"
                + "\nL -- Load a saved game"
                + "\nH -- Help on how to play the game"
                + "\nS -- Save game"
                + "\nQ -- Quit and Exit Game"
                + "\n-------------------------------------------------");

        this.promptMessage = "\nPlease choose a Main Menu option: ";
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L": // get and start a existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void startNewGame() {
        // create new game
        game = GameControl.createNewGame(BandManager.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.setGame(game);
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {

        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
