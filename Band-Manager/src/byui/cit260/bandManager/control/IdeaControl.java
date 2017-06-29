/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.model.BandNames;
import byui.cit260.bandManager.model.Issues;
import byui.cit260.bandManager.view.PossibleIssuesView;

/**
 *
 * @author Wendi
 */
public class IdeaControl {

    public static void alphabetizeIssues(Issues[] issueList) {

        // Alphabetize the Issues[]
        for (int i = 1; i < issueList.length; i++) {
                for (int j=issueList.length-1; j >= i; j--) {
                    if (issueList[j-1].getIssueDescription().compareTo(issueList[j].getIssueDescription()) > 1) {
                        Issues k = issueList[j-1];
                        issueList[j-1] = issueList[j];
                        issueList[j] = k;
                    }
                }
        }
    }

    public static void sortAlphaBackwards(BandNames[] bandNameList) {
        
        // Alphabetize the BandNames[]
        for (int i = 1; i < bandNameList.length; i++) {
                for (int j=bandNameList.length-1; j >= i; j--) {
                    if (bandNameList[j-1].getNamesOfBands().compareTo(bandNameList[j].getNamesOfBands()) < 1) {
                        BandNames k = bandNameList[j-1];
                        bandNameList[j-1] = bandNameList[j];
                        bandNameList[j] = k;
                    }
                }
        }
        
    }

}
