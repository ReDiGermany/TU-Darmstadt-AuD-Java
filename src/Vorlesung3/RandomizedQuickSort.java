package Vorlesung3;

public class RandomizedQuickSort extends QuickSort {
    /**
     * Method implements Randomized QuickSort algorithm as officially defined.
     * @param A the input array
     */
    public RandomizedQuickSort(int[] A,int p,int r){
        super(A,p,r);
        this.A = A;
        quicksort(p,r);
    }

    /**
     * helper method for partitioning the array
     * @param p start index
     * @param r stop index
     * @return middle index
     */
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
}
