package oop_interface_homework.sort;

public class App {
    public static void main(String[] args) {
    int[] array={1,5,7,4,-1,-5,6,1,5,3,0};

    ISort arr=new Array(array);
        arr.show();
    arr.sortAsc();
    arr.show();
    arr.sortDesc();
    arr.show();

}
}
