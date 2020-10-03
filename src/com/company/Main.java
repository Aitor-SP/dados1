package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int dado1;
        int dado2;
        int resultado;
        int lanzamientos;

        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;
        int d7 = 0;
        int d8 = 0;
        int d9 = 0;
        int d10 = 0;
        int d11 = 0;
        int d12 = 0;

        System.out.print("Cuantas veces vas a lanzar los dados? ");
        lanzamientos = input.nextInt();

        System.out.println("Lanzas los dados "+ lanzamientos+" veces.");

        for (int i= 0; i<lanzamientos; i++){

            dado1 = random.nextInt(6)+1;
            dado2 = random.nextInt(6)+1;

            resultado = dado1 + dado2;

            if (resultado==2) d2++;
            if (resultado==3) d3++;
            if (resultado==4) d4++;
            if (resultado==5) d5++;
            if (resultado==6) d6++;
            if (resultado==7) d7++;
            if (resultado==8) d8++;
            if (resultado==9) d9++;
            if (resultado==10) d10++;
            if (resultado==11) d11++;
            if (resultado==12) d12++;

        }

        System.out.println("RESULTADOS:");
        System.out.println("2: "+d2+" veces");
        System.out.println("3: "+d3+" veces");
        System.out.println("4: "+d4+" veces");
        System.out.println("5: "+d5+" veces");
        System.out.println("6: "+d6+" veces");
        System.out.println("7: "+d7+" veces");
        System.out.println("8: "+d8+" veces");
        System.out.println("9: "+d9+" veces");
        System.out.println("10: "+d10+" veces");
        System.out.println("11: "+d11+" veces");
        System.out.println("12: "+d12+" veces");

    }
}
