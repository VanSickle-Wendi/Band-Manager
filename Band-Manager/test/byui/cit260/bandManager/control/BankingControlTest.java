/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Crazian
 */
public class BankingControlTest {
    
    public BankingControlTest() {
    }

    /**
     * Test of calcLoanPayment method, of class BankingControl.
     */
    @Test
    public void testCalcLoanPayment() {
        System.out.println("calcLoanPayment");
        // Test Case 1
        System.out.println("\tTestCase1");
        
        double loanBalance = 2000;
        double extraPrinciple = 1000;
        BankingControl instance = new BankingControl();
        double expResult = 1050;
        double result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    
        // Test Case 2
        System.out.println("\tTestCase2");
        
        loanBalance = -1;
        extraPrinciple = 0;
        expResult = -999;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
 
        // Test Case 3
        System.out.println("\tTestCase3");
        
        loanBalance = 500000;
        extraPrinciple = 0;
        expResult = -999;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
        
        // Test Case 4
        System.out.println("\tTestCase4");
        
        loanBalance = 10000;
        extraPrinciple = -1;
        expResult = -999;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 5
        System.out.println("\tTestCase5");
        
        loanBalance = 20000;
        extraPrinciple = 30000;
        expResult = -999;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 6
        System.out.println("\tTestCase6");
        
        loanBalance = 0;
        extraPrinciple = 0;
        expResult = 0;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        // Test Case 7
        System.out.println("\tTestCase7");
        
        loanBalance = 25000;
        extraPrinciple = 25000;
        expResult = 25625;
        result = instance.calcLoanPayment(loanBalance, extraPrinciple);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcNewVehicleCost method, of class BankingControl.
     */
    @Test
    public void testCalcNewVehicleCost() {
        System.out.println("CalcNewVehicleCost");
        //Test Case 1
        System.out.println("\tTestCase1");
        
        double originalVehicleCost = 5000;
        double currentPerformancePoints = 1000;
        double newVehiclePrice = 30000;
        BankingControl instance = new BankingControl();
        double expResult = 29850;
        double result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        //Test Case 2
        System.out.println("\tTestCase2");
        
        originalVehicleCost = 10000;
        currentPerformancePoints = 2000;
        newVehiclePrice = 30000;
        expResult = 29400;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        //Test Case 3
        System.out.println("\tTestCase3");
        
        originalVehicleCost = 5000;
        currentPerformancePoints = 3500;
        newVehiclePrice = 30000;
        expResult = 29475;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        //Test Case 4
        System.out.println("\tTestCase4");
        
        originalVehicleCost = 5000;
        currentPerformancePoints = -1;
        newVehiclePrice = 100000;
        expResult = 100000.15;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        //Test Case 5
        System.out.println("\tTestCase5");
        
        originalVehicleCost = 5000;
        currentPerformancePoints = 10000;
        newVehiclePrice = 100000;
        expResult = 98500;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        //Test Case 6
        System.out.println("\tTestCase6");
        
        originalVehicleCost = 30000;
        currentPerformancePoints = 20000;
        newVehiclePrice = 50000;
        expResult = 32000;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
         //Test Case 7
        System.out.println("\tTestCase7");
        
        originalVehicleCost = 5000;
        currentPerformancePoints = 1;
        newVehiclePrice = 30000;
        expResult = 29999.85;
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
         //Test Case 8
        System.out.println("\tTestCase8");
        
        originalVehicleCost = 60000;
        currentPerformancePoints = 500000;
        newVehiclePrice = 100000;
        expResult = -800000;
        //Need to put a cap in the code, if result is negative. Give car for free.
        result = instance.calcNewVehicleCost(originalVehicleCost, currentPerformancePoints, newVehiclePrice);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
  
    }
}
