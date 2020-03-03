package ru.geekbrains.java_one.lesson_a.homework;

public class lesson1_homework {
    public static void main (String [] args){
     System.out.println(choice_name("Павлуша"));
    }
    public static  double operation(int a , int b, int c, int d){
        return a*(b+(c/d));
    }
    public  static  boolean hit(int a, int b){
        if (a+b>=10 && a+b<=20)return true ;
        else return false;
    }
    public static void contrast(int a){
        if (a>=0)System.out.println(a + " положительное число");
        else System.out.println(a + " отрицательное число");
    }
    public static String choice_name(String name){
        return "Привет," + name + "!";
    }
    public static void year(int a){
        if (a%400==0)System.out.println(a + " високосный год");
        else if (a%100==0)System.out.println(a +  "  не високосный год");
        else if (a%4==0)System.out.println(a + " високосный год");
        else System.out.println(a +  "  не високосный год");
    }
}
