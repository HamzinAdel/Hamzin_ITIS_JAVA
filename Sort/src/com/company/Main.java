package com.company;

public class Main {

    public static void main(String[] args) {
	        int [] arr = {3,2,1,8,7};
        int [] arr1 = {2,4,5,6,0,9,5};
	        int n=arr1.length;
            Sort(arr1);
            for(int i=0;i<n;i++){
                System.out.print(arr1[i] + " ");
            }

    }
    static void Sort (int [] x) {
        int n=x.length;

        for(int j=0;j<n;j++) {
            int index = j;
            for(int i=j;i<n;i++){
                if (x [index]<x[i]){
                    index=i;
                }
            }
            int buf;
            buf=x[j];
            x[j]=x[index];
            x[index]=buf;
        }

    }

}
