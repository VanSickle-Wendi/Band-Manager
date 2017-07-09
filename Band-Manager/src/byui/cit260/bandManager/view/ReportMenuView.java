/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.model.Game;

/**
 *
 * @author Wendi
 */
public class ReportMenuView extends MenuView {
    
    private String menu;
    private String promptMessage;
    private Game game;

    public ReportMenuView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n| Report Menu                                      |"
                + "\n-------------------------------------------------"
                + "\nM -- Map Report"
                + "\nB -- Band Member Report"
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
            case "M": // View Map Report
                this.mapReport();
                break;
            case "D": // Band Report
                this.bandReport();
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

    private void mapReport() {
        this.console.println("*** mapReport function called ***");
    }

    private void bandReport() {
        this.console.println("*** bandReport function called ***");
    }
}
