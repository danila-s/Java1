package ru.geekbrains.home_work3;

import java.util.Random;
import java.util.Scanner;

public class Tic {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '_';

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField() {
        fieldSizeY = 5;
        fieldSizeX = 5;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("------");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >=0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }



    private static void aiTurn() {
        int x;
        int y;
        for(int i = 0; i<field.length; i++){
            for (int j=0;j<field.length; j++){
                char a ;
                a=field[i][j];
                field[i][j]=DOT_HUMAN;
                if (checkWin(DOT_HUMAN)){
                    field[i][j]=DOT_AI;
                }
                else field[i][j]=a;
            }

        }


        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;

    }

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    /*
        private static boolean checkWin(char c) {
            int timer1 = 0;
            int timer2 = 0;
         for(int i =0 ; i<field.length; i++) {
             if (field[i][i] == c) timer1++;
             else timer1 = 0;
         }
             if (timer1==3) return true;
             else {
                 timer1=0;
                 for (int i =0 ; i<field.length;i++){
                     for(int j =0 ; j<field.length;j++){
                         if (field[i][j]==c) timer1++;
                         else timer1 = 0;
                         if(field[j][i]==c)timer2++;
                         else timer2=0;

                         if(timer1==3||timer2==3)return true;



                     }
                     timer1=0;
                     timer2=0;
                 }
             }

            return false;
        }

     */
    private static boolean checkWin(char c) {
        int timer1 = 0;
        int timer2 = 0;
        for(int i =0 ; i<field.length; i++) {
            if (field[i][i] == c) timer1++;
            else timer1 = 0;
        }
        if (timer1==4) return true;
        else {
            timer1=0;
            for(int i=0,j=3; j<field.length; i++ ,j++){
                for(int z =0 ; z<field.length-1; z++) {
                    if (field[i + z][j - z] == c) timer1++;
                    else timer1 = 0;
                    if (timer1 == 4) return true;
                }
            }

        }


        for (int i =0 ; i<field.length;i++){
            for(int j =0 ; j<field.length;j++){
                if (field[i][j]==c) timer1++;
                else timer1 = 0;
                if(field[j][i]==c)timer2++;
                else timer2=0;

                if(timer1==4||timer2==4)return true;



            }
            timer1=0;
            timer2=0;
        }


        return false;
    }

    public static void main(String[] args) {
        while (true) {
            playOneRound();
            System.out.println("Play again?");
            if (SCANNER.next().equals("no"))
                break;
        }
    }

    private static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Вы выйграли");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Компьютер победил !");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

}

