/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.model.BandMember;
import java.util.Random;

/**
 *
 * @author Wendi
 */
public class AuditionControl {
    
    //Default to the standard Random class for normal operations
    private Random randomGenerator = new Random(System.currentTimeMillis());

    //Allow a unit test method to set its own random number generator.
    protected void setRandomGenerator(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
    
    //Create the createBandMember() function with BandMember as the return type
    public BandMember createBandMember(String bandPosition, String musicianName, String issueDescription) {
        BandMember member = new BandMember(); //Create an instance of BandMember and save in member variable
    
        member.setBandPosition(bandPosition);
        member.setMusicianName(musicianName);
        member.setIssueDescription(issueDescription);
        member.setSkillLevel(assignSkillLevel());
        member.setInstrumentQuality(assignInstrumentQuality());
        member.setIssueCost(assignIssueCost());
        
        return member;
    }
   

    public double assignSkillLevel() {
        // Assign randomGenerator, with range 1 to 4, to randomSkillLevel variable
        double randomSkillLevel = randomGenerator.nextInt(4) + 1;  
        
       // change randomSkillLevel to 250 or 500 or 750 or 1000      
        if (randomSkillLevel == 1) {
            randomSkillLevel = 250;
        }else
        
        if (randomSkillLevel == 2) {
            randomSkillLevel = 500;        
        }else    
        
        if (randomSkillLevel == 3) {
            randomSkillLevel = 750; 
        }else
        
        if (randomSkillLevel == 4) {
            randomSkillLevel = 1000; 
        }   
        
        return randomSkillLevel;
    }
    
    public double assignInstrumentQuality() {
        // Assign randomGenerator, with range 250 to 500, to randomInstrumentQuality variable        
        double randomInstrumentQuality = randomGenerator.nextInt(500-250) + 250;
        return randomInstrumentQuality;
    }
    
    public double assignIssueCost() {
        // Assign randomGenerator, with range 1 to 500, to randomIssueCost variable
        double randomIssueCost = randomGenerator.nextInt(500) + 1;
        return randomIssueCost;
    }     
    
}
