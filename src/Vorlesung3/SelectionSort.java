package Vorlesung3;

import Basic.ReDiArray;

public class SelectionSort extends ReDiArray {
    /**
     * Method to show selection sort. What it does? dunno, lol
     * @param A input array
     */
    public SelectionSort(int[] A){
        this.A = A;
//        debug();
        for(int i=0;i<this.A.length-1;i++){
            int k=i;
            for(int j=(i+1);j<this.A.length-1;j++)
                if(this.A[i]<this.A[k])
                    k=j;
            swap(i,k);
        }
    }
}
