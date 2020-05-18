package Vorlesung1;

import java.util.Arrays;

public class Prim {
    private int[] retArr;

    /**
     * Method to calculate the Prim numbers up to the given one
     * @param num the number to calculate up to
     */
    public Prim(int num){
        int[] arr = new int[num];
        Arrays.fill(arr, 1);
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                for(int j=i+1;j<arr.length;j++){
                    if(j % i == 0){
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
        retArr = new int[(int) Arrays.stream(arr).filter(e->e==1).count()];
        int n=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==1){
                retArr[n]=i;
                n++;
            }
        }
        retArr = Arrays.stream(retArr).filter(e->e!=0).toArray();
    }

    /**
     * Method to return the prim number array
     * @return
     */
    public int[] get(){
        return retArr;
    }

    /**
     * Method to compare the current prim number array to another one
     * @param inp
     * @return
     */
    public boolean equals(String inp){
        return Arrays.toString(retArr).equals(inp);
    }
}