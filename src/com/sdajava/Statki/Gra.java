package com.sdajava.Statki;

import java.util.Scanner;

public class Gra extends Statki {

    public void graj(){
        zerowanie();
        czteryMaszty();
        trzyMaszty();
        trzyMaszty();
        dwaMaszty();
        dwaMaszty();
        dwaMaszty();
        jedenMaszt();
        jedenMaszt();
        jedenMaszt();
        jedenMaszt();
        odczytTablicy();
        System.out.println("ZASADY OZNAKOWANIA");
        System.out.println("O - pudło");
        System.out.println("X - trafiony");
        System.out.println("H - trafiony zatopiony");
        strzaly();
    }

    public void strzaly(){

        int zatopione = 0; int iloscStrzalow = 0;
        while (zatopione < 10){

            Scanner sc = new Scanner(System.in);
            System.out.println("Strzelaj");
            System.out.println("Podaj Y od 1 do 10");
            int a = sc.nextInt();
            System.out.println("Podaj X od 1 do 10");
            int b = sc.nextInt();

            if (tab[a][b] == 1 && tab[a-1][b-1] != 1 && tab[a][b-1] != 1 && tab[a+1][b-1] != 1 && tab[a-1][b] != 1
                    && tab[a+1][b] != 1 && tab[a-1][b+1] != 1 && tab[a][b+1] != 1 && tab[a+1][b+1] != 1){
                tab[a][b] = 4;
                zatopione++;
            }
            else if (tab[a][b] == 1){
                tab[a][b] = 3;
            }
            else if (tab[a][b] == 0 || tab[a][b] == 2){
                tab[a][b] = 5;
            }

            for (int i = 1; i < 11; i++) {
                for (int j = 1; j < 11; j++) {
                    if (tab[i][j] == 5) {
                        System.out.print("O");
                    } else if (tab[i][j] == 4) {
                        System.out.print("H");
                    } else if (tab[i][j] == 3) {
                        System.out.print("X");
                    } else {
                        System.out.print("-");
                    }

                }
                System.out.println();
            }
            iloscStrzalow++;
            System.out.println("Ilość strzalów " +  iloscStrzalow);
        }
    }
}

