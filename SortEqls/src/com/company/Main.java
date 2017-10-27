package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 3, 9, 0};
        System.out.println(Sorteqls(arr));
    }

    static boolean Sorteqls(int[] eqls) {
        int n = eqls.length;
        boolean proverka = false;
        for (int j = 0; j < n; j++) {
            for (int i = j+1 ;i<n;i++){
                if (eqls[j]==eqls[i]){
                    proverka=true;
                }
            }
        }
        return proverka;
    }
}
