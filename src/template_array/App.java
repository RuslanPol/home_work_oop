package template_array;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        IArray<String> array=new Array<>(new ArrayList<>());
//        array.arrayFillScan();
//        array.arrayFillScan();
//        array.arrayFillScan();
//
//        array.printArray();
        IArray<Double> array1;
        array1 = new Array<>(new ArrayList<>());
        array1.arrayFillRandom(5);
        System.out.println("\n");
        array1.printArray();
        System.out.println(array1.minArray());
        System.out.println("\n");
        System.out.println(array1.maxArray());
        System.out.println("\n");
        System.out.println(array1.avgArray());
        System.out.println("\n");
        array1.sortIncrem();
        array1.printArray();
        System.out.println("\n");
        array1.sortDecr();
        array1.printArray();

    }
}
