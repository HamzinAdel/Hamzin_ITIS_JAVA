package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int fact=sc.nextInt();
        System.out.println(Factor(fact));
    }

    static int Factor(int f){
        int proiz=1;
        for(int i=1;i<=f;i++){
            proiz=proiz*i;
        }
        return proiz;
    }
}
