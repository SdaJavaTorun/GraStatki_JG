package com.sdajava.Statki;

import java.util.Random;

public class Statki {

    int [] [] tab = new int [12] [12];

    public void zerowanie(){
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                tab[i][j] = 0;
            }
        }
    }
    public void czteryMaszty(){
        Random ran = new Random();
        int ksztaltStatku = ran.nextInt(5);   // jest 5 możliwości kształtu 4ro masztowca

        switch (ksztaltStatku){
            case 0 :
                int a = ran.nextInt(6)+1; int b = ran.nextInt(9)+1;
                tab[a][b] = 1; tab[a+1][b] = 1; tab[a+2][b] = 1; tab[a+3][b] = 1;
                tab[a-1][b-1] = 2; tab[a][b-1] = 2; tab[a+1][b-1] = 2; tab[a+2][b-1] = 2; tab[a+3][b-1] = 2; tab[a+4][b-1] = 2;
                tab[a-1][b+1] = 2; tab[a][b+1] = 2; tab[a+1][b+1] = 2; tab[a+2][b+1] = 2; tab[a+3][b+1] = 2; tab[a+4][b+1] = 2;
                tab[a-1][b] = 2; tab[a+4][b] = 2;
                break;
            case 1 :
                int c = ran.nextInt(9)+1; int d = ran.nextInt(6)+1;
                tab[c][d] = 1; tab[c][d+1] = 1; tab[c][d+2] = 1; tab[c][d+3] = 1;
                tab[c-1][d-1] = 2; tab[c-1][d] = 2; tab[c-1][d+1] = 2; tab[c-1][d+2] = 2; tab[c-1][d+3] = 2; tab[c-1][d+4] = 2;
                tab[c+1][d-1] = 2; tab[c+1][d] = 2; tab[c+1][d+1] = 2; tab[c+1][d+2] = 2; tab[c+1][d+3] = 2; tab[c+1][d+4] = 2;
                tab[c][d-1] = 2; tab[c][d+4] = 2;
                break;
            case 2 :
                int e = ran.nextInt(8)+1; int f = ran.nextInt(8)+1;
                tab[e][f] = 1; tab[e+1][f] = 1; tab[e][f+1] = 1; tab[e+1][f+1] = 1;
                tab[e-1][f-1] = 2; tab[e-1][f] = 2; tab[e-1][f+1] = 2; tab[e-1][f+2] = 2;
                tab[e+2][f-1] = 2; tab[e+2][f] = 2; tab[e+2][f+1] = 2; tab[e+2][f+2] = 2;
                tab[e][f-1] = 2; tab[e][f+2] = 2; tab[e+1][f-1] = 2; tab[e+1][f+2] = 2;
                break;
            case 3 :
                int g = ran.nextInt(7)+2; int h = ran.nextInt(8)+2;
                tab[g][h] = 1; tab[g-1][h-1] = 1; tab[g][h-1] = 1; tab[g+1][h-1] = 1;
                tab[g-2][h-2] = 2; tab[g-1][h-2] = 2; tab[g][h-2] = 2; tab[g+1][h-2] = 2; tab[g+2][h-2] = 2;
                tab[g-2][h-1] = 2; tab[g+2][h-1] = 2; tab[g-2][h] = 2; tab[g-1][h] = 2; tab[g+1][h] = 2; tab[g+2][h] = 2;
                tab[g-1][h+1] = 2; tab[g][h+1] = 2; tab[g+1][h+1] = 2;
                break;

            case 4 :
                int i = ran.nextInt(7)+2; int j = ran.nextInt(8)+1;
                tab[i][j] = 1; tab[i+1][j+1] = 1; tab[i][j+1] = 1; tab[i-1][j+1] = 1;
                tab[i-1][j-1] = 2; tab[i][j-1] = 2; tab[i-1][j-1] = 2; tab[i-1][j] = 2; tab[i+1][j] = 2; tab[i+2][j] = 2;
                tab[i-2][j] = 2; tab[i-2][j+1] = 2; tab[i+2][j+1] = 2; tab[i-2][j+2] = 2; tab[i-1][j+2] = 2; tab[i][j+2] = 2;
                tab[i+1][j+2] = 2; tab[i+2][j+2] = 2;
                break;
        }
    }
    public void trzyMaszty(){
        Random ran = new Random();
        int ksztaltStatku = ran.nextInt(2);   // sa 2 możlwości kształtu 3y masztowca

        switch (ksztaltStatku){
            case 0 :
                boolean flag = true;
                while (flag) {
                    int a = ran.nextInt(7)+1; int b = ran.nextInt(9)+1;
                    if ( tab[a][b] == 0 && tab[a+1][b] == 0 && tab[a+2][b] == 0){
                        tab[a][b] = 1; tab[a+1][b] = 1; tab[a+2][b] = 1;
                        tab[a-1][b-1] = 2; tab[a][b-1] = 2; tab[a+1][b-1] = 2; tab[a+2][b-1] = 2; tab[a+3][b-1] = 2;
                        tab[a-1][b+1] = 2; tab[a][b+1] = 2; tab[a+1][b+1] = 2; tab[a+2][b+1] = 2; tab[a+3][b+1] = 2;
                        tab[a-1][b] = 2; tab[a+3][b] = 2;
                        flag = false;
                    }
                }
                break;

            case 1 :
                boolean flag2 = true;
                while (flag2) {
                    int c = ran.nextInt(9)+1; int d = ran.nextInt(7)+1;
                    if ( tab[c][d] == 0 && tab[c][d+1] == 0 && tab[c][d+2] == 0){
                        tab[c][d] = 1; tab[c][d+1] = 1; tab[c][d+2] = 1;
                        tab[c-1][d-1] = 2; tab[c-1][d] = 2; tab[c-1][d+1] = 2; tab[c-1][d+2] = 2; tab[c-1][d+2] = 2;
                        tab[c+1][d-1] = 2; tab[c+1][d] = 2; tab[c+1][d+1] = 2; tab[c+1][d+2] = 2; tab[c+1][d+2] = 2;
                        tab[c][d-1] = 2; tab[c][d+3] = 2;
                        flag2 = false;
                    }
                }
                break;
        }
    }

    public void dwaMaszty() {
        Random ran = new Random();
        int ksztaltStatku = ran.nextInt(2);   // sa 2 możlwości kształtu 2wa masztowca

        switch (ksztaltStatku) {
            case 0:
                boolean flag = true;
                while (flag) {
                    int a = ran.nextInt(8) + 1;
                    int b = ran.nextInt(9) + 1;
                    if (tab[a][b] == 0 && tab[a + 1][b] == 0) {
                        tab[a][b] = 1;
                        tab[a + 1][b] = 1;
                        tab[a - 1][b - 1] = 2;
                        tab[a][b - 1] = 2;
                        tab[a + 1][b - 1] = 2;
                        tab[a + 2][b - 1] = 2;
                        tab[a - 1][b + 1] = 2;
                        tab[a][b + 1] = 2;
                        tab[a + 1][b + 1] = 2;
                        tab[a + 2][b + 1] = 2;
                        tab[a - 1][b] = 2;
                        tab[a + 2][b] = 2;
                        flag = false;
                    }
                }
                break;
            case 1:
                boolean flag2 = true;
                while (flag2) {
                    int c = ran.nextInt(9) + 1;
                    int d = ran.nextInt(8) + 1;
                    if (tab[c][d] == 0 && tab[c][d + 1] == 0) {
                        tab[c][d] = 1;
                        tab[c][d + 1] = 1;
                        tab[c - 1][d - 1] = 2;
                        tab[c - 1][d] = 2;
                        tab[c - 1][d + 1] = 2;
                        tab[c - 1][d + 2] = 2;
                        tab[c + 1][d - 1] = 2;
                        tab[c + 1][d] = 2;
                        tab[c + 1][d + 1] = 2;
                        tab[c + 1][d + 2] = 2;
                        tab[c][d - 1] = 2;
                        tab[c][d + 2] = 2;
                        flag2 = false;
                    }
                }
                break;
        }
    }
    public void jedenMaszt() {
        Random ran = new Random();
        boolean flag = true;
        while (flag) {
            int a = ran.nextInt(9) + 1;
            int b = ran.nextInt(9) + 1;
            if (tab[a][b] == 0) {
                tab[a][b] = 1;
                tab[a - 1][b - 1] = 2;
                tab[a][b - 1] = 2;
                tab[a + 1][b - 1] = 2;
                tab[a - 1][b + 1] = 2;
                tab[a][b + 1] = 2;
                tab[a + 1][b + 1] = 2;
                tab[a - 1][b] = 2;
                tab[a + 1][b] = 2;
                flag = false;
            }

        }
    }
    public void odczytTablicy(){
        for (int i = 1; i < 11; i++){
            for (int j = 1; j < 11; j++){
                if (tab[i][j] == 1){
                    System.out.print("x");
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}