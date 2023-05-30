package oop_classes_homework.place;

public class City implements CustomPlase<Boolean> {
    private String name;
    private int population;
    private boolean capital;
    private double area;

    public City(String name, int population, Boolean capital, double area) {

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

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void printInfo(){
        System.out.println("\nName of city: "+ this.name+"\nPopulation: "+this.population+
                "\nIs the capital: "+this.capital+ "\nArea: "+ this.area);
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + capital +
                ", area=" + area +
                '}';
    }


}
