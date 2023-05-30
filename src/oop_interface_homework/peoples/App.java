package oop_interface_homework.peoples;

public class App {
    public static void main(String[] args) {
        Human builder=new Builder("Ivan",30,"builder");
        System.out.println(builder);
        System.out.println(builder.getName());
        builder.printInfo();
        builder.exec();
        Human pilot=new Pilot("Feodor",35,"pilot");
        pilot.printInfo();
        pilot.exec();
        Human sailor=new Sailor("Petr",40,"sailor");
        sailor.printInfo();
        sailor.exec();
    }
}
