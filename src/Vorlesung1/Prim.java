package Vorlesung1;

import Basic.ReDiArray;

import java.util.Arrays;

public class Prim extends ReDiArray {

    /**
     * Method to calculate the Prim numbers up to the given one
     * @param num the number to calculate up to
     */
    public Prim(int num){
        int[] arr = new int[num];
        Arrays.fill(arr, 1);
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                for(int j=i+1;j<arr.length;j++){
                    if(j % i == 0){
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        A = new int[(int) Arrays.stream(arr).filter(e->e==1).count()];
        int n=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                A[n]=i;
                n++;
            }
        }
        A = Arrays.stream(A).filter(e->e!=0).toArray();
    }

}