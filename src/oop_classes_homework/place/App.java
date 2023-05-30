package oop_classes_homework.place;

public class App {
    public static void main(String[] args) {
        City city = new City("Tomsk", 700000, false, 500.0);
        city.printInfo();
        Country country = new Country("Russia", 15000000, "Moscow", 5000000.0);
        country.printInfo();
    }
}
