package com.company;

public class Main {

    public static void main(String[] args) {
	int b=sum(7,9,5,7,1,2,12,55);
        System.out.println(b);
    }
    public static int sum(int... params){
        int sum=0;
        for (int i = 0; i <params.length ; i++) {
            sum=sum+params[i];
        }
        return sum;
    }
}
