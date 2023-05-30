package oop_classes_homework.human;

public class App {
    public static void main(String[] args) {
        Human human=new Human("Petr","men",25,"student","Moscow");
        human.printInfo();
        human.printInfo("Kuzia",50,"doctor");
    }
}
