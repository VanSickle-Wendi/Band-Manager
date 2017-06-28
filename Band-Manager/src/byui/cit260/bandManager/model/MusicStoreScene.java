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
public class MusicStoreScene extends Scene implements Serializable {

    private Instrument[] guitar;
    private Instrument[] keyboard;
    private Instrument[] bass;
    private Instrument[] drums;
    private Instrument[] mic;

    public MusicStoreScene() {

        setSceneDescription("Welcome to the Music Store.");

        guitar = new Instrument[4];
        guitar[0] = new Instrument(InstrumentType.Guitar, "Squire Bullet", 149.99, 10);
        guitar[1] = new Instrument(InstrumentType.Guitar, "Sennheiser MD421", 599.99, 20);
        guitar[2] = new Instrument(InstrumentType.Guitar, "Rode NTK", 529.00, 40);
        guitar[3] = new Instrument(InstrumentType.Guitar, "Neuman TLM 102", 699.95, 80);

        keyboard = new Instrument[4];
        keyboard[0] = new Instrument(InstrumentType.Keyboard, "Yamaha YPG 235 76", 235.69, 10);
        keyboard[1] = new Instrument(InstrumentType.Keyboard, "Roland RD 700", 719.99, 20);
        keyboard[2] = new Instrument(InstrumentType.Keyboard, "Korg SV1 73 Stage", 1499.99, 40);
        keyboard[3] = new Instrument(InstrumentType.Keyboard, "Nord Electro 5D", 2199.00, 80);

        bass = new Instrument[4];
        bass[0] = new Instrument(InstrumentType.Bass, "Ibanez GSR20TR", 199.99, 10);
        bass[1] = new Instrument(InstrumentType.Bass, "Fender Precision", 369.99, 20);
        bass[2] = new Instrument(InstrumentType.Bass, "Gibson EB", 749.95, 40);
        bass[3] = new Instrument(InstrumentType.Bass, "Rickenbacker 403", 1499.99, 80);

        drums = new Instrument[4];
        drums[0] = new Instrument(InstrumentType.Drums, "Yamaha Stage", 499.99, 10);
        drums[1] = new Instrument(InstrumentType.Drums, "Pearl Masters", 749.50, 20);
        drums[2] = new Instrument(InstrumentType.Drums, "Tama Silverstar", 1099.99, 40);
        drums[3] = new Instrument(InstrumentType.Drums, "DW Performance", 1665.98, 80);

        mic = new Instrument[4];
        mic[0] = new Instrument(InstrumentType.Mic, "Shure SM58", 99.00, 10);
        mic[1] = new Instrument(InstrumentType.Mic, "Sennheiser", 379.95, 20);
        mic[2] = new Instrument(InstrumentType.Mic, "Rode NTK", 529.00, 40);
        mic[3] = new Instrument(InstrumentType.Mic, "Neuman TLM 102", 699.95, 80);
    }


    public Instrument[] getGuitar() {
        return guitar;
    }

    public void setGuitar(Instrument[] guitar) {
        this.guitar = guitar;
    }

    public Instrument[] getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Instrument[] keyboard) {
        this.keyboard = keyboard;
    }

    public Instrument[] getBass() {
        return bass;
    }

    public void setBass(Instrument[] bass) {
        this.bass = bass;
    }

    public Instrument[] getDrums() {
        return drums;
    }

    public void setDrums(Instrument[] drums) {
        this.drums = drums;
    }

    public Instrument[] getMic() {
        return mic;
    }

    public void setMic(Instrument[] mic) {
        this.mic = mic;
    }

}
