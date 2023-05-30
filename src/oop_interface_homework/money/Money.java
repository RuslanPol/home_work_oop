package oop_interface_homework.money;

public class Money  implements CustomMoney{
    protected int rub;
    protected int kop;


    public Money(int rub, int kop) {
        if (kop > 100) {
            this.rub = rub + kop / 100;
            this.kop = kop % 100;
        }
        if (kop < 0) {
            this.rub = rub - 1 + (kop / 100);
            this.kop = 100 + kop % 100;

        }
        if(0<kop&&kop<100) {
            this.rub = rub;
            this.kop = kop;
        }
    }
    public Money increm(Money m){
       int resRub=this.rub+m.rub;
       int resKop=this.kop+m.kop;
        Money res=new Money(resRub,resKop);
        //res.printSum();
        return res;

    }

    public Money decrem(Money m){
        int resRub=this.rub-m.rub;
        int resKop=this.kop-m.kop;
        Money res=new Money(resRub,resKop);
        //res.printSum();
        return res;

    }
    public Money markup(double m){
        double resRub=this.rub*(1+m/100);
        double resKop=this.kop*(1+m/100);
        Money res=new Money((int)resRub,(int)resKop);
        //res.printSum();
        return res;

    }
    public Money discount(double m){
        double resRub=this.rub*(1-m/100);
        double resKop=this.kop*(1-m/100);
        Money res=new Money((int)resRub,(int)resKop);
        //res.printSum();
        return res;

    }

    public Money multiply(double count){
        double resRub=this.rub*count;
        double resKop=this.kop*count;
        Money res=new Money((int)resRub,(int)resKop);
        //res.printSum();
        return res;

    }
    public Money divide(double count){
        double resRub=this.rub/count;
        double resKop=this.kop/count;
        Money res=new Money((int)resRub,(int)resKop);
        //res.printSum();
        return res;

    }
    public int getRub() {
        return rub;
    }

    public void setRub(int rub) {
        this.rub = rub;
    }

    public int getKop() {
        return kop;
    }

    public void setKop(int kop) {
        this.kop = kop;
    }

    @Override
    public void printSum() {


            System.out.print(this.rub+" rub "+this.kop+" kop"+"\n");


    }



    @Override
    public String toString() {
        return "Money{" +
                "rub=" + rub +
                ", kop=" + kop +
                '}';
    }
}

