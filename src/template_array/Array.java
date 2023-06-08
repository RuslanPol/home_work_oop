package template_array;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;


public class Array<T> implements IArray<Double> {
    ArrayList<T> array;

    public Array(ArrayList<T> array) {
        this.array = array;
    }


    @Override
    public void printArray() {
        for (T el : this.array) {
            System.out.println(el);
        }

    }

    @Override
    public void arrayFillScan() {
        System.out.println("Enter element of array: ");
        Scanner scan = new Scanner(System.in);
        T elem = (T) scan.next();
        this.array.add(elem);

    }

    @Override
    public void arrayFillRandom(int a) {
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            T e = (T) Double.valueOf(random.nextInt(100));
            this.array.add(i, e);
        }
    }

    @Override

    public Double minArray() {
        int i;
        double min = (Double) (array.get(0));
        for (i = 0; i < this.array.size(); i++) {
            if (min > (Double) (this.array.get(i))) {
                min = (Double) this.array.get(i);
            }
        }
        return min;
    }

    @Override
    public Double maxArray() {
        int i;
        double max = (Double) (array.get(0));
        for (i = 0; i < this.array.size(); i++) {
            if (max < (Double) (this.array.get(i))) {
                max = (Double) this.array.get(i);
            }
        }
        return max;
    }

    @Override
    public Double avgArray() {
        double avg = 0.0;
        for (int i = 0; i < this.array.size(); i++) {
            avg = avg + ((Double) (this.array.get(i)));
        }
        double v = avg / this.array.size();
        return v;
    }

    @Override
    public void sortIncrem() {
        for (int i = 0; i < this.array.size() - 1; i++) {
            for (int j = 0; j < this.array.size() - i - 1; j++) {
                if ((Double) this.array.get(j + 1) < (Double) this.array.get(j)) {
                    T swap = this.array.get(j);
                    this.array.set(j, this.array.get(j + 1));
                     this.array.set(j + 1, swap);

                }
            }
        }

    }

    @Override
    public void sortDecr() {
        for (int i = this.array.size()-1; i >0; i--) {
            for(int j=this.array.size()-1; j >0; j--) {
                if((Double) this.array.get(j) > (Double) this.array.get(j-1)) {
                    T temp = (T) this.array.get(j);
                    this.array.set(j, this.array.get(j - 1));
                    this.array.set(j -1, temp);

                }
            }
        }
    }
}


                

