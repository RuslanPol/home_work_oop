package oop_interface_homework.sort;

public class Array implements ISort{
    int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public void sortAsc() {
        for (int i =0; i <this.array.length; i++) {
            for(int j=0; j <this.array.length-i-1; j++) {
                if(this.array[j] > this.array[j +1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j +1];
                    this.array[j +1] =temp;
                }
            }
        }

    }

    @Override
    public void sortDesc() {
        for (int i = this.array.length; i >0; i--) {
            for(int j=this.array.length-1; j >0; j--) {
                if(this.array[j] > this.array[j -1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j - 1];
                    this.array[j -1] =temp;
                }
            }
        }
    }

    @Override
    public void show() {
        System.out.println("\n");
        for(int el:this.array){
            System.out.print(el+" ");
        }
    }
}
