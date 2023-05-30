package oop_interface_homework.math;

public class Array implements IMath{
    public Array(int[] array) {
        this.array = array;
    }

    private int[] array;
    @Override
    public int max() {
        int max=this.array[0];
        for(int i=0;i<this.array.length;i++){
            if(max<this.array[i]){
                max=this.array[i];
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min=this.array[0];
        for(int i=0;i<this.array.length;i++){
            if(min>this.array[i]){
                min=this.array[i];
            }
        }
        return min;
    }

    @Override
    public float avg() {
        int sum=0;
        for(int i=0;i<this.array.length;i++){
            sum+=array[i];
            }

        return (float) sum /this.array.length;
    }
}

