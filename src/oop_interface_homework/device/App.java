package oop_interface_homework.device;

public class App {
    public static void main(String[] args) {
        IDevice car = new Car("Car", "BMW", "Dr-Dr-Dr Bi-Bi!!!", "a001aa",
                3000, "Gasoline");
        car.showInfo();
        car.sound();
        car.description();
        IDevice kettle = new Kettle("Kettle", "Moulinex", "Bul-Bul", 1.7, 2.0);
        kettle.showInfo();
        kettle.sound();
        kettle.description();
        IDevice micr = new Microwave("Microwave", "LG", "Pic-Pic!", 35.0, 1.0, true);
        micr.showInfo();
        micr.sound();
        micr.description();
        IDevice steamer=new Steamer("Steamer","Lastochka","Tu-Tu",500,"wheeled");
        steamer.showInfo();
        steamer.sound();
        steamer.description();


    }

}

