package Vorlesung1;

import java.util.Arrays;

public class InsertionSort {
    int[] A;

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

    /**
     * Method to get the current Array
     * @return the current Array
     */
    public int[] get(){
        return A;
    }

    /**
     * Method to compare the current Array with a String Array
     * @param inp the Array to compare to
     * @return true if its the same
     */
    public boolean equals(String inp){
        return Arrays.toString(A).equals(inp);
    }
}
