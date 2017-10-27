package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String [] letter = {"b","i","k","e"};
        Scanner sc = new  Scanner (System.in);
        String word = sc.next();
        System.out.println(exists(letter,word));

    }

    static boolean exists(String[] arr, String str) {
        boolean proverka=false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i].equals(str)) {
                proverka=true;

            }
        }

        return proverka;
    }
    }
