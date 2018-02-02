package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite kiek norite eiluciu");
        int a = sc.nextInt();
        System.out.println("iveskite kiek norite stulpeliu");
        int b = sc.nextInt();

        for (int i = 0; i <b; i++){
            for (int k =0; k < a; k++)
                if ((i+k) % 2 ==0){
                    System.out.print("#");
                }else {
                    System.out.print("0");
                }
            System.out.println();
        }
        int [][] m1 = new int[2][2];
        int [][] m2 = { { 4, 5, 6}, {1, 2, 3} };
    }}
