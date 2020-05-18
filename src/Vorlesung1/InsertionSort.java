package Vorlesung1;

import Basic.ReDiArray;

public class InsertionSort extends ReDiArray {
    /**
     * Method for the Insertion Sort algorithm as officially defined
     * @param Ainp Input integer Array
     */
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
}
