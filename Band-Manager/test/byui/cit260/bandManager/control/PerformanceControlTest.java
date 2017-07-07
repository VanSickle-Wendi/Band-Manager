/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.BandManager;
import byui.cit260.bandManager.exceptions.PerformanceControlException;
import java.io.PrintWriter;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import teacherhelps.RandomMock;

/**
 *
 * @author Wendi
 */
public class PerformanceControlTest {
    
    protected final PrintWriter console = BandManager.getOutFile();    
    
    public PerformanceControlTest() {
    }
    
    /**
     * Test of calcAuditionPoints method, of class PerformanceControl.
     */
    @Test
    public void testCalcAuditionPoints() throws PerformanceControlException {
        double skillLevel = 0;
        double instrumentQuality = 0;
        double issueCost = 0;     
        
        PerformanceControl instance = new PerformanceControl();
        //Assign "random" numbers for test #1 (1 number less than actual test numbers)
        RandomMock testRandom = new RandomMock(2,1);
        
        instance.setRandomGenerator(testRandom);         
        
        console.println("calcAuditionPoints");
        /****************************
         * Test Case #1
         ****************************/
        console.println("\tTest Case #1");
        skillLevel = 250;
        instrumentQuality = 362;
        issueCost = 58;
        double expResult = 653.5;
        double result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test Case #2
         ****************************/
        console.println("\tTest Case #2");
        //Assign "random" numbers for test #2 (1 number less than actual test numbers)
        testRandom.setSequence(3,0);
        
        skillLevel = 300;
        instrumentQuality = 550;
        issueCost = 75;
        expResult = -999;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test Case #3
         ****************************/
        console.println("\tTest Case #3");
        //Assign "random" numbers for test #3 (1 number less than actual test numbers)
        testRandom.setSequence(1,1);
        
        skillLevel = 500;
        instrumentQuality = 502;
        issueCost = 150;
        expResult = -999;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);

        /****************************
         * Test Case #4
         ****************************/
        console.println("\tTest Case #4");
        //Assign "random" numbers for test #4 (1 number less than actual test numbers)
        testRandom.setSequence(2,0);
        
        skillLevel = 750;
        instrumentQuality = 250;
        issueCost = 600;
        expResult = -999;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test Case #5
         ****************************/
        console.println("\tTest Case #5");
        //Assign "random" numbers for test #5 (1 number less than actual test numbers)
        testRandom.setSequence(0,1);
        
        skillLevel = 0;
        instrumentQuality = 0;
        issueCost = -25;
        expResult = -999;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test Case #6
         ****************************/
        console.println("\tTest Case #6");
        //Assign "random" numbers for test #6 (1 number less than actual test numbers)
        testRandom.setSequence(1,0);
        
        skillLevel = 250;
        instrumentQuality = 0;
        issueCost = 75;
        expResult = -999;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);
        
        /****************************
         * Test Case #7
         ****************************/
        console.println("\tTest Case #7");
        //Assign "random" numbers for test #7 (1 number less than actual test numbers)
        testRandom.setSequence(0,0);
        
        skillLevel = 250;
        instrumentQuality = 250;
        issueCost = 1;
        expResult = 249.5;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0); 

        /****************************
         * Test Case #8
         ****************************/
        console.println("\tTest Case #8");
        //Assign "random" numbers for test #8 (1 number less than actual test numbers)
        testRandom.setSequence(3,1);
        
        skillLevel = 1000;
        instrumentQuality = 500;
        issueCost = 500;
        expResult = 1375;
        result = instance.calcAuditionPoints(skillLevel, instrumentQuality, issueCost);
        assertEquals(expResult, result, 0.0);           

    }
    
}
