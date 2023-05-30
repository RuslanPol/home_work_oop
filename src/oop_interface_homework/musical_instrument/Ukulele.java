package oop_interface_homework.musical_instrument;

public class Ukulele extends MusicalInstrument{
    public Ukulele(String name, String sound, String yearOfConstruction) {
        super(name, sound, yearOfConstruction);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public void description() {
        System.out.println("A Hawaiian four-stringed variety of guitar" +
                " used for chordal accompaniment of songs and playing solos.");
    }

    @Override
    public void history() {
        super.history();
    }
}
