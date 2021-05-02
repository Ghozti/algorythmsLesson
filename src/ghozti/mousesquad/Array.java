package ghozti.mousesquad;

import java.util.Arrays;

public class Array {

    int size;
    int[] arr = {1,2,3,4,5,6,7,8,9};

    public Array(int size){
        this.size = size;
    }

    public void insert(int item){

    }

    /**
     * [1,2,3,4,5,6,7,8,9]
     *
     * 3 [4]
     *
     * [1,2,3,5,6,7,8,9]
     *
     */

    public void removeAt(int index){
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < size--; i++) {
            if(arr[index] != arr[i]){
                newArr[i] = arr[i];
            }
        }
        arr = newArr;
    }

    /**
     * TODO the array removeAt method does fine until it reaches the index. Afterwards it does not add the numbers.
     */

    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}
