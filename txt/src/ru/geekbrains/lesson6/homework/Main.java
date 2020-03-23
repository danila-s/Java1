package ru.geekbrains.lesson6.homework;

import java.io.*;
import java.util.Scanner;

public class Main {
    static String TXT = "Hello my friend";
    static String  FINAL;
    static String TWO;


    public static void main(String []args){
    Create(30 ,"one.txt");
    Create(15, "two.txt");
    oneTwo("one.txt" ,"two.txt");

        Search("lala.txt", "Snow");

    }
    public static void  Create(int long1 ,String fileName ) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(fileName ,true));
          for (int i = 0; i<long1 ; i++){
              FINAL+=TXT;
          }
            System.out.println(FINAL);
          ps.println(FINAL);
          ps.flush();
          ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден.");
        }

        FINAL=null;
    }

    public static void oneTwo (String fileName1, String fileName2) {
        try {
            Scanner sc= new Scanner(new FileInputStream(fileName1));
            FINAL= sc.nextLine();
            System.out.println(FINAL);
            sc.close();


            Scanner rx = new Scanner((new FileInputStream(fileName2)));
            TWO=rx.nextLine();
            TWO+=FINAL;
            PrintStream ps = new PrintStream(new FileOutputStream(fileName2));
            ps.println(TWO);
            ps.flush();
            ps.close();
            rx.close();
            FINAL=null;
            TWO=null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }

    public static boolean Search (String fileName, String search) {
        try {
            Scanner sc= new Scanner(new FileInputStream(fileName));

            while(sc.hasNext()){  //hasNext пришлось загуглить , уж больно упрощает жизнь в этом моменте. всю бошку сломал, как цикл построить тут.
                if (sc.next().equals(search)){
                   sc.close();
                   return true;
                }

            }
            sc.close();




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}


