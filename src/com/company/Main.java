package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tablice i Pętle");

        int[] tablica = new int[5]; //0,0,0,0,0

        tablica[0] = 11;
        tablica[1] = 22;
        tablica[2] = 9;
        tablica[3] = 55;
        tablica[4] = 77;

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);

        //System.out.println(tablica[-1]);

        System.out.println("Tablica liczby");

        int[] liczby = { 123, 223, 111 }; //new int[] { 123, 223, 111 };

        System.out.println(liczby[0]);
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);

        double[][] t2w = new double[2][2];

        t2w[0][0] = 1.2;
        t2w[0][1] = 2.3;
        t2w[1][0] = 3.1;
        t2w[1][1] = 4.123;

        //1 2
        //3 4

        System.out.println("wiersz 0: " + t2w[0][0] + " " + t2w[0][1]);
        System.out.println("wiersz 1: " + t2w[1][0] + " " + t2w[1][1]);

        int[][] liczby2w = { {12, 13},
                            {11, 78} };

        System.out.println("Pętla for");

        //i++ - zwieksz o 1 tak samo mozna zapisac i += 1 lub i = i + 1

        for(int i = 1; i <= 3; i++){
            System.out.println("instrukcja " + i);
        }



    }
}
