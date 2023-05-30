package oop_interface_homework.money;

public class Price extends Money{

    public Price(int rub, int kop) {
        super(rub, kop);
    }

    @Override
    public Money increm(Money m) {
        return super.increm(m);
    }



    @Override
    public Price decrem(Money m){
        int resRub=this.rub-m.rub;
        int resKop=this.kop-m.kop;
        Money res=new Price(resRub,resKop);
        //res.printSum();
        return (Price) res;

    }
    @Override
    public Money markup(double m) {
        return super.markup(m);
    }

    @Override
    public Price discount(double m) {
        double resRub=this.rub*(1-m/100);
        double resKop=this.kop*(1-m/100);
        Price res=new Price((int)resRub,(int)resKop);
        //res.printSum();
        return res;
    }

    @Override
    public Money multiply(double count) {
        return super.multiply(count);
    }

    @Override
    public Money divide(double count) {
        return super.divide(count);
    }

    @Override
    public int getRub() {
        return super.getRub();
    }

    @Override
    public void setRub(int rub) {
        super.setRub(rub);
    }

    @Override
    public int getKop() {
        return super.getKop();
    }

    @Override
    public void setKop(int kop) {
        super.setKop(kop);
    }

    @Override
    public void printSum() {
        super.printSum();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
