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

    public int hitung() {
        return getI() + getN();
    }

    public static void main(String[] args) {

        HelloWorld obj = new HelloWorld();
    }
}

class HelloWorld1 {

    int a;
    int b;

}

class Loop {

    int[] numbers = {10, 20, 30, 40, 50};
    String[] names = {"James", "Larry", "Tom", "Lacy"};

    public void looping() {
        for (int x : numbers) {
            if (x == 30) {
                System.out.print(x);
                System.out.print(",");
            }
        }
        System.out.print("\n");

        for (String name : names) {
            if (name.equals("Tom")) {
                System.out.print(name);
                System.out.print(",");
            }
        }
    }

}
