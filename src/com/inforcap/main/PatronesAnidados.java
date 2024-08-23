package com.inforcap.main;

import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos a mostrar: ");
        int n = scanner.nextInt();

        patronO(n);
        patronZ(n);
        patronX(n);
        patronAlgo(n);

    }

    static void patronO(int n) {
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n-2; i++){
            System.out.print("*");
            for (int j = 0; j < n-2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if (n > 1) {
            for (int i = 0; i < n; i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    static void patronZ(int n) {

    }

    static void patronX(int n) {

    }

    static void patronAlgo(int n) {

    }


}
