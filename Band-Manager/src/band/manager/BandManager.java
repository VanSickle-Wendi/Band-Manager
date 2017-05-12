/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager;

import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.Player;

/**
 *
 * @author Wendi
 */
public class BandManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setManagerName("Fred Flinstone");
       playerOne.setMoney(30);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
       
       BandMember memberStats = new BandMember();
       
       memberStats.setMemberName("Joe Hardy");
       memberStats.setCurrentSkillLevel(25);
       memberStats.setCurrentIssue("Stage Fright");
       memberStats.setEquipmentPoints(25);
       
       String memberBio = memberStats.toString();
       System.out.println(memberBio);
    }
    
}
