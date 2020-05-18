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

    private boolean log=false;
    public void debug(){log=true;}

    /**
     * Method to swap two array elements
     * @param i the first element
     * @param j the second element
     */
    public void swap(int i, int j) {
        if(log) {
            System.out.println("Swap called!");
            String[] B = new String[A.length];
            Arrays.fill(B," ");
            B[i]="=";
            B[j]="=";
            System.out.println("<" + Arrays.toString(A));
            System.out.println(" " + Arrays.toString(B).
                    replace(","," ").
                    replace("["," ").
                    replace("]"," "));
        }
        A[i] = (A[i] + A[j]) - (A[j] = A[i]);
        if(log) System.out.println(">"+Arrays.toString(A)+"\n");
    }
}
