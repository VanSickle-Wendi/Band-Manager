/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.exceptions.BankControlException;

/**
 *
 * @author Crazian
 */
public class BankingControl {

    public double calcLoanPayment(double loanBalance, double extraPrinciple) throws BankControlException {

        if (loanBalance < 0 || loanBalance > 25000) {
            
            throw new BankControlException("Loan balance must be more than 0 and less than"
                    + " 25000. Try again.");
        }

        if (extraPrinciple < 0 || extraPrinciple > 25000) {
            
            throw new BankControlException("Extra Principle must be greater than 0 or "
                    + "less than 25000. "
                    + "\nTry again, starting with loan balance.");
        }

        double rate = .10;

        double compPeriod = 4;

        double loanPayment = (loanBalance * (rate / compPeriod) + extraPrinciple);

        return loanPayment;

    }

    public double calcBandSalary(double venuePayment, double equipmentCost,
            double hotelCost, double salaryPercentage, double bankAccount) throws BankControlException {

        if (salaryPercentage < .20 || salaryPercentage > .50) {

            throw new BankControlException("\nSalaryPercentage must be greater than"
                    + " .20 and less than .50" + "\nCheck your numbers and try again.");
        }

        if (venuePayment < (equipmentCost + hotelCost)) {

            throw new BankControlException("\nYour equipment and hotel cost more than "
                    + "you made for the gig." + "\nCheck your numbers and try again.");
        }

        double netIncome = (venuePayment) - (equipmentCost + hotelCost);
        double bandSalary = netIncome * salaryPercentage;

        if (bandSalary > bankAccount) {

            throw new BankControlException("\nYou don't have enough in your bank account"
                    + " to pay the band." + "\nAre you sure your numbers are correct?");
        } else {
            return bandSalary;
        }

    }

    public double calcNewVehicleCost(double originalVehicleCost, double currentPerformancePoints, double newVehiclePrice) throws BankControlException {

        if (originalVehicleCost != 5000 && originalVehicleCost != 30000 && originalVehicleCost != 60000 && originalVehicleCost != 100000) {
            throw new BankControlException ("\n Your orignial vehicle's worth must be 5000, 30000, 60000 or 100000");
        };

        if (currentPerformancePoints < 0) {
            throw new BankControlException ("\n You don't have any performance points yet");
        };

        if (newVehiclePrice != 5000 && newVehiclePrice != 30000 && newVehiclePrice != 60000 && newVehiclePrice != 100000) {
            throw new BankControlException ("\n Please check the cost again. Your new vehicle should cost 5000, 30000, 60000 or 100000");
        };

        double ppDiscounts = .00003;

        double discount = originalVehicleCost * (currentPerformancePoints * ppDiscounts);

        double newVehicleCost = newVehiclePrice - discount;

        return newVehicleCost;
    }

    public double calcHotelCost(double roomCharge, double bankAccount, double quantity) throws BankControlException {

        if (roomCharge != 200 && roomCharge != 500 && roomCharge != 800 && roomCharge != 1000) {
        }

        if (roomCharge * quantity > bankAccount) {

            throw new BankControlException("Room charge must be less than your bank account balance. Try again ");

        }
        double newAccountBalance = (bankAccount) - (quantity * roomCharge);
        return newAccountBalance;

    }

}
