package oop_interface_homework.musical_instrument;

public class App {
    public static void main(String[] args) {
        IMusicalInstrument violin= new Violin("Violin","La-La","1550");
        violin.show();
        violin.description();
        violin.history();
        IMusicalInstrument cello=new Cello("Cello","Lu-Lu","1520");
        cello.show();
        cello.description();
        cello.description();
        IMusicalInstrument trombone=new Trombone("Trombone","Tu-Tu","1450");
        trombone.show();
        trombone.description();
        trombone.history();
        IMusicalInstrument ukulele=new Ukulele("Ukulele","Tren-Tren","1880");
        ukulele.show();
        ukulele.description();
        ukulele.sound();
    }
}
