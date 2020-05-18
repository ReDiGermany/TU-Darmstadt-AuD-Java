package Vorlesung3;

import Basic.ReDiArray;

import java.util.Arrays;

public class MergeSort extends ReDiArray {
    /**
     * Algorithm implementation for Merge Sort as officially defined.
     * @param A the input array
     * @param p the start to sort
     * @param r the end to sort
     */
    public MergeSort(int[] A,int p, int r){
        this.A = A;
        sort(p,r);
    }

    /**
     * Short handle for Merge Sort implementation as officially defined
     * @param A
     */
    public MergeSort(int[] A){
        new MergeSort(A,0,A.length-1);
    }

    /**
     * Method to sort the current array part
     * @param p start index
     * @param r last index
     * @return the Array
     */
    public int[] sort(int p, int r){
        if(p<r){
            int q = (int) Math.floor((p+r)/2);
            sort(p,q);
            sort(q+1,r);
            merge(p,q,r);
        }
        return A;
    }

    /**
     * Method to merge the current array parts together
     * @param p start index
     * @param q middle index
     * @param r last index
     */
    public void merge(int p,int q,int r){
        int n1 = q-p+1;
        int n2 = r-q;
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        Arrays.fill(L,0);
        Arrays.fill(R,0);

        for(int i=0;i<n1;i++) L[i] = A[p + i];
        for(int j=0;j<n2;j++) R[j] = A[q + j + 1];
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        for(int k=p;k<(r+1);k++)
            if (L[i] <= R[j]) A[k] = L[i++];
            else A[k] = R[j++];
    }
}
