package Vorlesung3;

import Basic.ReDiArray;

public class MaxSort extends ReDiArray {
    /**
     * Method implements MaxSort algorithm as officially defined.
     * @param A the input array
     */
    public MaxSort(int[] A){
        this.A = A;
        int pos = 0;
        int len = this.A.length;
        int lenn = this.A.length-1;
        for(int i=0;i<len;i++){
            int maximum = 0;
            for(int j=0;j<len-i;j++){
                if(this.A[j]>maximum){
                    maximum = this.A[j];
                    pos = j;
                }
            }
            swap(pos,lenn-i);
        }
    }
}
