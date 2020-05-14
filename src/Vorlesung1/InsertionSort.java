package Vorlesung1;

import java.util.Arrays;

public class InsertionSort {
    int[] A;
    public InsertionSort(int[] Ainp){
        A = Ainp;
        for(int j=1;j<A.length;j++){
            int key = A[j];
            int i = j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
    }
    public int[] get(){
        return A;
    }
    public boolean equals(String inp){
        return Arrays.toString(A).equals(inp);
    }
}
