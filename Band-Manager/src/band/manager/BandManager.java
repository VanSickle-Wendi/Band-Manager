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
import byui.cit260.bandManager.model.Scene;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.SpendingScene;
import byui.cit260.bandManager.model.Vehicle;
        
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
       playerOne.setFinalScore(30);
       
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
       
       Scene regSceneInfo = new Scene();
       
       regSceneInfo.setSceneDescription("Garage with the band equipment set up.");
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
       
       Band bandMembers = new Band();
       
       bandMembers.setDrummer("Jack the Drummer");
       bandMembers.setSinger("Adele the Singer");
       bandMembers.setBassPlayer("Nick the bass player");
       bandMembers.setGuitarPlayer("Scar the Guitar Player");
       bandMembers.setKeyboardPlayer("Glen the Pianist");
       bandMembers.setBandName("Captain Geech and the Shrimp Shack Shooters");
      
       String fullBand = bandMembers.toString();
       System.out.println(fullBand);
       
       SpendingScene spendingOne = new SpendingScene();
      
       spendingOne.setAmount(300);
       spendingOne.setItemType("Guitar");
       
       String wallet = spendingOne.toString();
       System.out.println(wallet);   
     
       Game gameOne = new Game();
       
       gameOne.setTotalMoney(5000);
       gameOne.setTotalPerformancePoints(15);
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);
       
       Vehicle vehicleOne = new Vehicle();
       
       vehicleOne.setVehicleLevel(1);
       
       String garage = vehicleOne.toString();
       System.out.println(garage);
       
       Instrument musicToolOne = new Instrument();
       
       musicToolOne.setInstrumentLevel(1);
       
       String musicBoxOne = musicToolOne.toString();
       System.out.println(musicBoxOne);
       
    }
    
}
