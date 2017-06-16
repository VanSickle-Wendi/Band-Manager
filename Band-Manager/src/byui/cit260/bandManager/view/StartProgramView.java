/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.model.Player;
import java.util.Scanner;

/**
 *
 * @author shaza
 */
public class StartProgramView extends MenuView {

    //private String promptMessage;

    public StartProgramView() {
            super("\n                 Band Manager Game                            "
                + "\n**************************************************************"
                + "\n*                                                            *"
                + "\n* In this game you will take on the role of a band           *"
                + "\n* manager. You will need to take out a loan in order to      *"
                + "\n* afford the costs of holding auditions, hotel               *"
                + "\n* expenses, paying band members, buying equipment,           *"
                + "\n* buying vehicles, and paying back your loan. You may        *"
                + "\n* earn performance points and money by doing                 *"
                + "\n* well at promotional appearances and concerts. As your      *"
                + "\n* band rises to play better venues, your potential for       *"
                + "\n* earning money goes up. The goal is to be able to pay       *"
                + "\n* back your loan, earn the highest income for yourself       *"
                + "\n* and your band members, and gain the most popularity        *"
                + "\n* for the band.                                              *"
                + "\n*                                                            *"
                + "\n* You hope to discover 5 great musicians and coach them      *"
                + "\n* to stardom. The game takes place in several cities         *"
                + "\n* in Southern California. Once you have held                 *"
                + "\n* auditions and purchased sound equipment, you will all      *"
                + "\n* meet in your garage to name the band and have your         *"
                + "\n* first rehearsal. Advancement in the game from lower        *"
                + "\n* to higher venues will be determined by your band’s         *"
                + "\n* performance level at several different locations           *"
                + "\n* including the first rehearsal, gigs, a radio               *"
                + "\n* interview, a television performance, and a spot in a       *"
                + "\n* movie.                                                     *"
                + "\n*                                                            *"
                + "\n* The game is won not only when your band plays well at      *"
                + "\n* the highest venue, but when you are out of debt and        *"
                + "\n* making a good living. The game is lost if the manager      *"
                + "\n* runs out of money or the band plays two bad gigs in a      *"
                + "\n* row.  After the band has passed level 4, they go to        *"
                + "\n* ‘the big star party.’ Your accountant is there and         *"
                + "\n* tells you your net worth and star status.                  *"
                + "\n**************************************************************"
                + "\n"
                + "\nPlease enter your name: ");

    }

    @Override
    public boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { // if successfull
            System.out.println("\nError creating the player.");
            return false;
        }

        //display next view
        this.displayNextView(player);

        return true; // success
    }

    private void displayNextView(Player player) {

        System.out.println("\n=========================================="
                + "\n Welcome to the game " + player.getPlayersName()
                + "\n We hope you have a lot of fun!"
                + "\n=========================================="
        );

        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        // Display the main menu view
        mainMenuView.display();
    }

}
