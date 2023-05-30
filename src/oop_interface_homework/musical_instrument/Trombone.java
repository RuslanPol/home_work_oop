package oop_interface_homework.musical_instrument;

public class Trombone extends MusicalInstrument{
    public Trombone(String name, String sound, String yearOfConstruction) {
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
        System.out.println("The trombone is a close relative of the trumpet," +
                " but it has its own unique personality.");
    }

    @Override
    public void history() {
        super.history();
    }
}
