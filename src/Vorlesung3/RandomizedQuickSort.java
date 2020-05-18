package Vorlesung3;

import Basic.ReDiArray;

public class RandomizedQuickSort extends ReDiArray {
    public RandomizedQuickSort(int[] A,int p,int r){
        this.A = A;
        quicksort(p,r);
    }
    private void quicksort(int p,int r){
        if(p<r){
            int q = randomizedPartition(p,r);
            quicksort(p,q-1);
            quicksort(q+1,r);
        }
    }
    private int randomizedPartition(int p,int r){
        int i = (int)Math.round(Math.random()*(r-p)+p);
        swap(r,i);
        return Partition(p,r);
    }
    private int Partition(int p,int r){
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
