/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Wendi
 */
public class BankScene implements Serializable {

    // class instance variables
    private double loan;
    private double bankAccount;
    private double loanPayment;
    private double receivePayment;
    private double bandPayment;

    public BankScene() {
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(double loanPayment) {
        this.loanPayment = loanPayment;
    }

    public double getReceivePayment() {
        return receivePayment;
    }

    public void setReceivePayment(double receivePayment) {
        this.receivePayment = receivePayment;
    }

    public double getBandPayment() {
        return bandPayment;
    }

    public void setBandPayment(double bandPayment) {
        this.bandPayment = bandPayment;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.loan) ^ (Double.doubleToLongBits(this.loan) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.bankAccount) ^ (Double.doubleToLongBits(this.bankAccount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.loanPayment) ^ (Double.doubleToLongBits(this.loanPayment) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.receivePayment) ^ (Double.doubleToLongBits(this.receivePayment) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.bandPayment) ^ (Double.doubleToLongBits(this.bandPayment) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "BankScene{" + "loan=" + loan + ", bankAccount=" + bankAccount + ", loanPayment=" + loanPayment + ", receivePayment=" + receivePayment + ", bandPayment=" + bandPayment + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankScene other = (BankScene) obj;
        if (Double.doubleToLongBits(this.loan) != Double.doubleToLongBits(other.loan)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bankAccount) != Double.doubleToLongBits(other.bankAccount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loanPayment) != Double.doubleToLongBits(other.loanPayment)) {
            return false;
        }
        if (Double.doubleToLongBits(this.receivePayment) != Double.doubleToLongBits(other.receivePayment)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bandPayment) != Double.doubleToLongBits(other.bandPayment)) {
            return false;
        }
        return true;
    }

}
