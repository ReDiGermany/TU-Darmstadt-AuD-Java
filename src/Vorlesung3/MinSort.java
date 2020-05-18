package Vorlesung3;

import Basic.ReDiArray;

public class MinSort extends ReDiArray {
    /**
     * Method implements MinSort algorithm as officially defined.
     * @param A the input array
     */
    public MinSort(int[] A){
        this.A = A;
        int pos = 0;
        int minimum = this.A[0];
        for(int i=0;i<this.A.length;i++){
            for(int j=i;j<this.A.length;j++)
                if (this.A[j] <= minimum)
                    minimum = this.A[pos = j];
            swap(pos,i);
            if((i + 1) < this.A.length) minimum = this.A[i + 1];
        }
    }
}
