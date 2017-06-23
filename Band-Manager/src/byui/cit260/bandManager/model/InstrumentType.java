/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author shaza
 */
    public enum InstrumentType implements Serializable{
        Guitar,
        Keyboard,
        Bass,
        Drums,
        Mic;
    
    InstrumentType() {
        
    }
        
        public static InstrumentType getGuitar() {
            return Guitar;
        }

        public static InstrumentType getKeyboard() {
            return Keyboard;
        }

        public static InstrumentType getBass() {
            return Bass;
        }

        public static InstrumentType getDrums() {
            return Drums;
        }

        public static InstrumentType getMic() {
            return Mic;
        }
    }
