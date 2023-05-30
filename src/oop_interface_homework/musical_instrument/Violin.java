package oop_interface_homework.musical_instrument;

public class Violin extends MusicalInstrument {
    public Violin(String name, String sound, String yearOfConstruction) {
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
        System.out.println("Bowed musical instrument with four strings");
    }

    @Override
    public void history() {
        super.history();
    }
}
