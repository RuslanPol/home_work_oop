package oop_classes_homework.place;

public class Country implements CustomPlase<String> {
    private String name;
    private int population;
    private String  capital;
    private double area;


    public Country(String name, int population, String capital, double area) {

        this.name = name;
        this.population = population;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void printInfo() {
        System.out.println("\nName of country: "+ this.name+"\nPopulation: "+this.population+
                "\nCapital: "+this.capital+ "\nArea: "+ this.area);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                '}';
    }
}
