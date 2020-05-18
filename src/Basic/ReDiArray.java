package Basic;

import java.util.Arrays;

public class ReDiArray {
    public int[] A;
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
