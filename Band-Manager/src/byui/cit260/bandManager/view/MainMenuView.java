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
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose a Main Menu option: ");
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
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

        // prompt for and get the name of the file the game is saved in
        this.console.println("\n\nEnter the file path for the file where the game "
                            + "is saved.");
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game"
                + " is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(BandManager.getCurrentGame(), filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    private void displayHelpMenu() {

        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

}
