package Vorlesung2;

import java.util.Arrays;

public class BubbleSort {
    private int[] A;

    /**
     * Algorithm implementation for BubbleSort as officially defined
     * @param A the input Array
     */
    public BubbleSort(int[] A){
        this.A = A;
        for(int i=0;i<this.A.length-2;i++)
            for(int j=this.A.length-1;j>i;j--)
                if(this.A[j]<this.A[j-1])
                    this.swap(j,j-1);
    }

    /**
     * Method to get the current Array
     * @return the current Array
     */
    public int[] get(){
        return A;
    }

    /**
     * Method to check the current Array with another one
     * @param inp the other Array to check with
     * @return true if its the same Array
     */
    public boolean equals(String inp){
        return Arrays.toString(A).equals(inp);
    }

    /**
     * Method to swap two array elements
     * @param i the first element
     * @param j the second element
     */
    public void swap(int i, int j) {
        A[i] = (A[i] + A[j]) - (A[j] = A[i]);
    }
}
