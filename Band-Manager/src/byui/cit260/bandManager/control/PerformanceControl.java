/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import java.util.Random;

/**
 *
 * @author Crazian
 */
public class PerformanceControl {
    
        //Default to the standard Random class for normal operations
        private Random randomGenerator = new Random(System.currentTimeMillis());
        
        //Allow a unit test method to set its own random number generator.
        protected void setRandomGenerator(Random randomGenerator) {
            this.randomGenerator = randomGenerator;
        }    
    
    public double calcAuditionPoints(double skillLevel, double instrumentQuality, double issueCost) {
        
        if (skillLevel != 250 && skillLevel != 500 && skillLevel != 750 && skillLevel != 1000) {
            return -999;
        }
        
        if (instrumentQuality < 250 || instrumentQuality > 500) {
            return -999;
        }
        
        if (issueCost < 1 || issueCost > 500) {
            return -999;
        }
        
      // Assign randomGenerator, with range 1 to 4, to tempInstrumentQuality variable
        int tempInstrumentQuality = randomGenerator.nextInt(4) + 1;     
      // Multiply instrumentQuality by random number between 1 and 4 and assign to instrument variable
        double instrument = Math.ceil(instrumentQuality * tempInstrumentQuality);             
               
      // Assign randomGenerator, with range 1 to 2, to tempIssue variable
        int tempIssue = randomGenerator.nextInt(2) + 1;
      // Divide issueCost by random number either 1 or 2 and assign to issue variable
        double issue = Math.ceil(issueCost / tempIssue);    
              
        double auditionPoints = ((skillLevel + instrument) - issue) / 2;
        
        return auditionPoints; 
    }  
}
