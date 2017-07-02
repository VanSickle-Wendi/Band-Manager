/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.exceptions;

/**
 *
 * @author Wendi
 */
public class PerformanceControlException extends Exception {

    public PerformanceControlException() {
    }

    public PerformanceControlException(String message) {
        super(message);
    }

    public PerformanceControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerformanceControlException(Throwable cause) {
        super(cause);
    }

    public PerformanceControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
