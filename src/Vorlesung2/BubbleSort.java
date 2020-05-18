package Vorlesung2;

import Basic.ReDiArray;

public class BubbleSort extends ReDiArray {

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
}
