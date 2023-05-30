package oop_interface_homework.peoples;

public class Builder extends Human {

    public Builder(String name, int age, String profession) {
        super(name, age, profession);
    }

    @Override
    public void exec() {
        System.out.println("\n"+name+" builds a house.\n");
    }
}
