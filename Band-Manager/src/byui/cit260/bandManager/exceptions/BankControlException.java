/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.exceptions;

/**
 *
 * @author shaza
 */
public class BankControlException extends Exception {

    public BankControlException() {
    }

    public BankControlException(String message) {
        super(message);
    }

    public BankControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BankControlException(Throwable cause) {
        super(cause);
    }

    public BankControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
