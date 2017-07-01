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
        guitar[0] = new Instrument(InstrumentType.Guitar, "Squire Bullet", 400, 10);
        guitar[1] = new Instrument(InstrumentType.Guitar, "Sennheiser MD421", 900, 20);
        guitar[2] = new Instrument(InstrumentType.Guitar, "Rode NTK", 1600, 40);
        guitar[3] = new Instrument(InstrumentType.Guitar, "Neuman TLM 102", 2000, 80);

        keyboard = new Instrument[4];
        keyboard[0] = new Instrument(InstrumentType.Keyboard, "Yamaha YPG 235 76", 400, 10);
        keyboard[1] = new Instrument(InstrumentType.Keyboard, "Roland RD 700", 900, 20);
        keyboard[2] = new Instrument(InstrumentType.Keyboard, "Korg SV1 73 Stage", 1600, 40);
        keyboard[3] = new Instrument(InstrumentType.Keyboard, "Nord Electro 5D", 2000, 80);

        bass = new Instrument[4];
        bass[0] = new Instrument(InstrumentType.Bass, "Ibanez GSR20TR", 400, 10);
        bass[1] = new Instrument(InstrumentType.Bass, "Fender Precision", 900, 20);
        bass[2] = new Instrument(InstrumentType.Bass, "Gibson EB", 1600, 40);
        bass[3] = new Instrument(InstrumentType.Bass, "Rickenbacker 403", 2000, 80);

        drums = new Instrument[4];
        drums[0] = new Instrument(InstrumentType.Drums, "Yamaha Stage", 400, 10);
        drums[1] = new Instrument(InstrumentType.Drums, "Pearl Masters", 900, 20);
        drums[2] = new Instrument(InstrumentType.Drums, "Tama Silverstar", 1600, 40);
        drums[3] = new Instrument(InstrumentType.Drums, "DW Performance", 2000, 80);

        mic = new Instrument[4];
        mic[0] = new Instrument(InstrumentType.Mic, "Shure SM58", 400, 10);
        mic[1] = new Instrument(InstrumentType.Mic, "Sennheiser", 900, 20);
        mic[2] = new Instrument(InstrumentType.Mic, "Rode NTK", 1600, 40);
        mic[3] = new Instrument(InstrumentType.Mic, "Neuman TLM 102", 2000, 80);
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
