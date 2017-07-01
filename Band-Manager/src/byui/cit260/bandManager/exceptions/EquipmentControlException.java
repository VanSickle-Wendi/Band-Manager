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
public class EquipmentControlException extends Exception {

    public EquipmentControlException() {
    }

    public EquipmentControlException(String message) {
        super(message);
    }

    public EquipmentControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public EquipmentControlException(Throwable cause) {
        super(cause);
    }

    public EquipmentControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
