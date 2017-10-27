package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr ={1 ,2 ,3 ,0 ,-1 ,0 ,2 };
        WZero(arr);

    }
    static void WZero (int [] Wit){
            int n = Wit.length;
            for(int i=0;i<n;i++){
                if (Wit[i]==0){
                    Wit[i]=Wit[i-1]*(-1);
                }
                System.out.print(Wit[i] + " ");

            }
        }
    }

