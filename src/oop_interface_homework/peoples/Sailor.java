package oop_interface_homework.peoples;

public class Sailor extends Human{
    public Sailor(String name, int age, String profession) {
        super(name, age, profession);
    }

    @Override
    public void exec() {
        System.out.println("\n"+name+" sails on a ship.\n");
    }
}
