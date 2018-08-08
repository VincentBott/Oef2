package com.company;

import java.util.Random;

public class HogerLager{

    private Random rnd = new Random();
    private int teRaden;

    public int getAantalBeurten() {
        return aantalBeurten;
    }

    public boolean isEindeSpel() {
        return isEindeSpel;
    }

    private int aantalBeurten;
    private boolean isEindeSpel;

    /**
     * Initialiseert het spel
     */
    public void init(){
        teRaden = rnd.nextInt(100) + 1;
        isEindeSpel = false;
        aantalBeurten = 0;
    }

    /**
     *
     * @param getal Waarde die geraden wordt door de gebruiker
     * @return +1 als het te zoeken getal hoger ligt, -1 als het lager ligt, 0 als het gevonden is
     */
    public int raad(int getal){
        aantalBeurten++;
        if (getal < teRaden){
            return +1;
        } else if (getal > teRaden){
            return -1;
        } else {
            isEindeSpel = true;
            return 0;
        }
    }
}
