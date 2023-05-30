package oop_interface_homework.animals;

public class App {
    public static void main(String[] args) {
        Animal crocodile = new Crocodile("reptile", "predator", "river",
                false, 20);
        crocodile.printInfo();
        crocodile.behavior();
        Animal tiger = new Tiger("mammal", "predator", "forest", true, "R-R-R!");
        tiger.printInfo();
        tiger.behavior();

        Animal kanga= new Kangaroo("mammal","herbivore","plains",true,12);
        kanga.printInfo();
        kanga.behavior();
    }
}
