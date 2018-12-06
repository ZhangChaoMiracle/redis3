package com.dome;

import java.util.Scanner;
public class Pass123 {
    public static void main(String[] args) {
        Scanner de=new Scanner(System.in);
        int u=de.nextInt();
        for(int i=3;i<=u;i++){
            for(int n=1;n<20-i;n++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
