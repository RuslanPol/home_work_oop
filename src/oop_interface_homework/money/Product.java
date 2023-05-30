package oop_interface_homework.money;

public class Product{
    private String name;
    private double amount;
    private Price price;


    public Product(String name, double amount, Price price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
    public void printInfo(){
        System.out.print("\nProduct: "+ this.name+"\nAmount: "+ this.amount+"\nPrice: ");
        this.price.printSum();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

}
