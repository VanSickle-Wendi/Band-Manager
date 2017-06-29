/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.IdeaControl;
import byui.cit260.bandManager.model.Issues;

/**
 *
 * @author Wendi
 */
public class PossibleIssuesView extends InteractiveView {

    private Issues[] issueList = new Issues[4];
    private IdeaControl sortFunction;

    public PossibleIssuesView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Here is a list of possible issues.            |"
                + "\n-------------------------------------------------");

        sortFunction = new IdeaControl();

        issueList[0] = new Issues(" Won't eat brown M & M's");
        issueList[1] = new Issues(" Trashes hotel rooms");
        issueList[2] = new Issues(" Refuses to wear anything but black");
        issueList[3] = new Issues(" Breaks instrument at the end of big gigs");

        // Display array here
        for (Issues s : issueList) {
            System.out.println(s.getIssueDescription());
        }
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        // prompt user for band name
        String issueName = getInput("What issue would you assign?");

        System.out.println("\n" + issueName + "! How annoying!          "
                + "\n"
                + "\n When you audition the band, you can      "
                + "\n assign them each an issue to deal with.  "
                + "\n"
                + "\n Let's put the list in alphabetical order."
                + "\n");

        // Display alphabetized Array
        IdeaControl.alphabetizeIssues(issueList);
        for (Issues sorted : issueList) {
            System.out.println(sorted.getIssueDescription());
        }

        return false;

    }

}
