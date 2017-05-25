/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

/**
 *
 * @author Crazian
 */
public class BankingControl {
    
    public double calcLoanPayment(double loanBalance,double extraPrinciple){
      
        if (loanBalance < 0 || loanBalance > 25000){  
            return -999;
        }
  
        if (extraPrinciple < 0 || extraPrinciple > 25000) {
            return -999;
        }
       
        double rate = .10;
        
        double compPeriod = 4;

        double loanPayment = (loanBalance * (rate / compPeriod) + extraPrinciple);
        
	return loanPayment;

    } 
    
    
}
