package oop_interface_homework.peoples;

public class Pilot extends Human{
    public Pilot(String name, int age, String profession) {
        super(name, age, profession);
    }
    @Override
    public void exec() {
        System.out.println("\n"+name+" controls an airplane.\n");
    }
}
