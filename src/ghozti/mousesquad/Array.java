package ghozti.mousesquad;

import java.util.Arrays;

public class Array {

    int size;
    int currentMax = 0;
    int[] arr;

    public Array(int size){
        this.size = size;
        arr = new int[size];
    }

    public void insert(int item){
        arr[currentMax] = item;
        currentMax++;
    }

    public void removeAt(int index){
        int[] newArr = new int[index];
        int[] newArr2 = new int[size - newArr.length-1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        int o = 0;
        for (int i = index+1; i < arr.length; i++) {
            newArr2[o] = arr[i];
            o++;
        }

        int[] finalArray = new int[newArr.length + newArr2.length];

        for (int i = 0; i < newArr.length; i++){
            finalArray[i] = newArr[i];
        }

        int oo = 0;
        for (int i = newArr.length; i < newArr2.length + newArr.length; i++) {
            finalArray[i] = newArr2[oo];
            oo++;
        }

        arr = finalArray;
    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}
