package com.jbt;

public class HelloWorld {

    int i;
    int n;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int hitung(){
        return getI()+getN();
    }

    public static void main(String[] args) {

        HelloWorld obj = new HelloWorld();
    }
}

class HelloWorld1 {

    int a;
    int b;

}
