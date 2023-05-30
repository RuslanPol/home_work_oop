package oop_interface_homework.money;

public class App {
    public static void main(String[] args) {
        Money money = new Money(100, 10);
        Money mon = new Money(50, 95);
        (money.increm(mon)).printSum();
        (money.decrem(mon)).printSum();
        (money.markup(20)).printSum();
        (money.discount(20)).printSum();
        (money.multiply(20)).printSum();
        (money.divide(4)).printSum();
        Price money1=new Price(100,50);

        Product product=new Product("food",1.0,money1);
        product.printInfo();
        //Уменьшаем цену на 20%
        Price discount = money1.discount(20);
        product.setPrice(discount);
        System.out.print("\n* Discount 20% * ");
        product.printInfo();
        //Уменьшаем цену на заданную сумму
        product.setPrice(money1.decrem(mon));
        product.printInfo();








    }
}
