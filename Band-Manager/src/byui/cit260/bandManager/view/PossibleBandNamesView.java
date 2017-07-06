/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.IdeaControl;
import byui.cit260.bandManager.model.BandNames;

/**
 *
 * @author shaza
 */
public class PossibleBandNamesView extends InteractiveView {

    private BandNames[] bandNameList = new BandNames[4];
    private IdeaControl nameLength;

    public PossibleBandNamesView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Here is a list of possible Band Names.       |"
                + "\n-------------------------------------------------");

        nameLength = new IdeaControl();

        bandNameList[0] = new BandNames(" Five Stars");
        bandNameList[1] = new BandNames(" Daniel and the Lions");
        bandNameList[2] = new BandNames(" Captain Geech and the Shrimp Shack Shooters");
        bandNameList[3] = new BandNames(" The Great Googley Moogleys");

        // Display array here
        for (BandNames l : bandNameList) {
            //this.console
            System.out.println(l.getNamesOfBands());
        }
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        // prompt user for band name
        String bandName = getInput("What name are you thinking about for your band?");

        //this.console
        System.out.println("\n" + bandName + " Hmmm! Is it easy to say?          "
                + "\n"
                + "\n Remember, what ever name you choose      "
                + "\n you could be stuck with for years!       "
                + "\n"
                + "\n       Here is our list in reverse        "
                + "\n        alphabetical order.               "
                + "\n");

        // Display alphabetized Array
        IdeaControl.sortAlphaBackwards(bandNameList);
        for (BandNames byLength : bandNameList) {
            //this.console
            System.out.println(byLength.getNamesOfBands());
        }

        return false;

    }

}

