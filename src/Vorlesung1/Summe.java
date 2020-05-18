package Vorlesung1;

public class Summe {
    private int ret=0;

    /**
     * Method to calculate the number of all numbers together
     * @param inp the maximum number we want to calculate
     */
    public Summe(int inp){
        for(int i=0;i<=inp;i++){
            ret += i;
        }
    }

    /**
     * Method to get the current number
     * @return the number
     */
    public int get(){
        return ret;
    }

    /**
     * Method to check if the number equals another one
     * @param inp the number to check with
     * @return true if its the same number
     */
    public boolean equals(int inp){
        return inp==ret;
    }
}
