/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;

/**
 *
 * @author Crazian
 */
public class IdeaMenuView extends MenuView {

    private String promptMessage;
    private Game game;

    public IdeaMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Idea Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nI -- List of Possible Issues"
                + "\nB -- List of Possible Band Names"
                + "\nR -- List of Possible Radio Shows"
                + "\nT -- List of Possible TV Shows"
                + "\nQ -- Quit the Idea Menu"
                + "\n-------------------------------------------------"
                + "\n"
                + "\nPlease choose an Idea Menu option: ");

    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "I": // List of Possible Issues
                this.possibleIssues();
                break;
            case "B": // List of Possible Band Names
                this.possibleBandNames();
                break;
            case "R": // List of Possible Radio Shows
                this.possibleRadioShows();
                break;
            case "T": // List of Possible TV Shows
                this.possibleTVShows();
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

    private void possibleIssues() {
        PossibleIssuesView issues = new PossibleIssuesView();
        issues.display();
    }

    private void possibleBandNames() {
        PossibleBandNamesView names = new PossibleBandNamesView();
        names.display();
    }

    private void possibleRadioShows() {
        // display the pay band view
        this.console.println("*** possibleBandNames function called ***");
    }

    private void possibleTVShows() {
        TakeLoanView loan = new TakeLoanView();
        loan.display();
    }

}
