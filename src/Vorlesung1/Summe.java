package Vorlesung1;

public class Summe {
    private int ret=0;
    public Summe(int inp){
        for(int i=0;i<=inp;i++){
            ret += i;
        }
    }
    public int get(){
        return ret;
    }
    public boolean equals(int inp){
        return inp==ret;
    }
}
