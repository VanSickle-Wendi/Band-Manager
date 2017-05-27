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
     * Test of calcBandSalary method, of class BankingControl.
     */
    @Test
    public void testCalcBandSalary() {
        System.out.println("calcBandSalary");
         // Test Case 1
        System.out.println("\tTestCase1");
        double venuePayment = 2500.00;
        double equipmentCost = 600.00;
        double hotelCost = 550.00;
        double salaryPercentage = 0.35;
        double bankAccount = 1000.00;
        BankingControl instance = new BankingControl();
        double expResult = 472.50;
        double result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);
        
        // Test Case 2
        System.out.println("\tTestCase2");
        venuePayment = 3500.00;
        equipmentCost = 425.00;
        hotelCost = 969.00;
        salaryPercentage = -.01;
        bankAccount = 1000.00;
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);

        // Test Case 3
        System.out.println("\tTestCase3");
        venuePayment = 4300.00;
        equipmentCost = 1850.00;
        hotelCost = 435.00;
        salaryPercentage = .51;
        bankAccount = 1000.00;
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);
        
        // Test Case 4
        System.out.println("\tTestCase4");
        venuePayment = 2200.00;
        equipmentCost = 1900.00;
        hotelCost = 500.00;
        salaryPercentage = .20;
        bankAccount = 1000.00;
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);    
        
        // Test Case 5
        System.out.println("\tTestCase5");
        venuePayment = 24000.00;
        equipmentCost = 14400.00;
        hotelCost = 2100.00;
        salaryPercentage = .45;
        bankAccount = 2750.00;
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);
        
        // Test Case 6
        System.out.println("\tTestCase6");
        venuePayment = 2300.00;
        equipmentCost = 653.00;
        hotelCost = 497.00;
        salaryPercentage = 1.00;
        bankAccount = 3000.00;
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, hotelCost, salaryPercentage, bankAccount);
        assertEquals(expResult, result, 0.0001);
        
    }
    
}
