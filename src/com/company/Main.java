package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	HogerLager nieuwSpel = new HogerLager();

	Scanner scanner = new Scanner(System.in);


	nieuwSpel.init();

    do {
        System.out.printf("Raad een getal: ");

        int getal = Integer.parseInt(scanner.nextLine());

        int resultaatRaad = nieuwSpel.raad(getal);


            if (resultaatRaad == 1)
                System.out.println("Hoger");

            if (resultaatRaad == -1)
                System.out.println("Lager");


    } while (!nieuwSpel.isEindeSpel());

        System.out.printf("Je hebt het getal gevonden in %d beurten.", nieuwSpel.getAantalBeurten());
    }
}
