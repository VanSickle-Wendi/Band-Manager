/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager;

import byui.cit260.bandManager.model.AuditionScene;
import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.BankScene;
import byui.cit260.bandManager.model.Equipment;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.PerformanceScene;
import byui.cit260.bandManager.model.Player;
import byui.cit260.bandManager.model.RegularScene;

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
       
       AuditionScene musicianStats = new AuditionScene();
       
       musicianStats.setBandPosition("Drummer");
       musicianStats.setMusicianName("Hoss Cartwright");
       musicianStats.setStartingSkillLevel(30);
       musicianStats.setStartingIssue("Tends to break drum heads");
       
       String musicianBio = musicianStats.toString();
       System.out.println(musicianBio);
       
       RegularScene regSceneInfo = new RegularScene();
       
       regSceneInfo.setRegularSceneDescription("Garage with the band equipment set up.");
       regSceneInfo.setSymbol('@');
       
       String regSceneStats = regSceneInfo.toString();
       System.out.println(regSceneStats);
       
       Equipment inventoryData = new Equipment();
       
       inventoryData.setEquipmentType("Gibson Guitar");
       inventoryData.setPrice(1800.00);
       
       String inventory = inventoryData.toString();
       System.out.println(inventory);
       
       BankScene currentBanking = new BankScene();
       
       currentBanking.setLoan(15000);
       currentBanking.setBankAccount(25000);
       currentBanking.setLoanPayment(1500);
       currentBanking.setReceivePayment(5000);
       currentBanking.setBandPayment(2500);
       
       String bankingInfo = currentBanking.toString();
       System.out.println(bankingInfo);
       
       Map locationBank = new Map();
       
       locationBank.setDescription("Welcome to the bank.");
       
       String mapInfo = locationBank.toString();
       System.out.println(mapInfo);
       
       Location locationOne = new Location();
       
       locationOne.setLocationNumber(01);
       locationOne.setTimesVisited(01);
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);
       
       PerformanceScene performanceOne = new PerformanceScene();
       
       performanceOne.setScore(75);
       
       String performanceInfo = performanceOne.toString();
       System.out.println(performanceInfo);
             
    }
    
}
