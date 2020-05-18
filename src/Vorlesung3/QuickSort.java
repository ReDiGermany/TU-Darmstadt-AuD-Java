package Vorlesung3;

import Basic.ReDiArray;

public class QuickSort extends ReDiArray {
    /**
     * Method implements QuickSort algorithm as officially defined.
     * @param A the input array
     */
    public QuickSort(int[] A,int p,int r){
        this.A = A;
        quicksort(p,r);
    }

    /**
     * recursive quicksort method
     * @param p start index
     * @param r stop index
     */
    private void quicksort(int p,int r){
        if(p<r){
            int q = Partition(p,r);
            quicksort(p,q-1);
            quicksort(q+1,r);
        }
    }

    /**
     * helper method for partitioning the array
     * @param p start index
     * @param r stop index
     * @return middle index
     */
    protected int Partition(int p,int r){
        int x = A[r];
        int i = p-1;
        for(int j=p;j<r;j++){
            if(A[j]<=x){
                i++;
                swap(i,j);
            }
        }
        swap(i+1,r);
        return i+1;
    }
}
