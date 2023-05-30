package oop_interface_homework.musical_instrument;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class MusicalInstrument implements IMusicalInstrument{
    protected String name;
    protected String sound;
    protected String yearOfConstruction;

    public MusicalInstrument(String name, String sound, String yearOfConstruction) {
        this.name = name;
        this.sound = sound;
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public void show() {
        System.out.println("\n * Musical Instrument * \nInstrument name: "+ this.name+
                "\nOutput sound: "+ this.sound+"\nYear of construction: "+this.yearOfConstruction);
    }

    @Override
    public void sound() {
        System.out.println(this.name+" output sound: "+this.sound);
    }

    @Override
    public void description() {

    }


    @Override
    public void history() {
        System.out.println("Year of construction: " +this.yearOfConstruction);

    }
}
