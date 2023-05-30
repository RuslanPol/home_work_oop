package oop_interface_homework.math;

public class App {
    public static void main(String[] args) {
        int[] array={1,5,7,4,6,1,5,3,0};
        IMath arr=new Array(array);
        System.out.println(arr.max());
        System.out.println(arr.min());
        System.out.println(arr.avg());
    }
}
