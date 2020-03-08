package ru.geekbrains.lesson2.homework;

import java.util.Arrays;

public class HomeWork2 {
    public static void  main (String[] args){
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        change(arr);

        //2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] array= new int[8];
        complete(array);
        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] a={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        six(a);
        //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        int[]b={3, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 200};
        System.out.println(max(b));
        System.out.println(min(b));
        // 5* Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
        int [][] c = new int [13][13];
        diagonal(c);
        print(c);





       //** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.  Абстрактная граница показана символами ||, эти символы в массив не входят.
        int[] x = {13,32,13,4,2,1,3,4,111,21,204};
        System.out.println("Такое место " + sum(x));

    }


    public static boolean sum(int[]x){
        int sum_left =0;
        int sum_right=0;
     for (int i=0; i<x.length; i++){
         sum_left+=x[i];
         for(int j=x.length-1; j>0+i; j--) {
             sum_right += x[j];
         }
          if (sum_right==sum_left)return true;
          else sum_right=0;
         }
     return false;
     }


    public static void print (int[][]a){
        for(int i=0 ; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }





    public static  void change (int[] arr){
        for (int i=0; i<arr.length; i++){
            switch (arr[i]){
                case 1:
                    arr[i]=0;
                    break;
                case 0:
                    arr[i]=1;
                    break;
            }
        }
    }
    public static void complete(int[]array){
        int a = 1;
        for(int i=0; i<array.length; i++){
            array[i]=a;
            a+=3;
        }
    }
    public static void six(int[]a){
        for(int i=0; i<a.length;i++){
            if(a[i]<6)a[i]*=2;
        }
    }

    public static int max(int[]b){
        int max=b[0];
        for(int i=1; i<b.length;i++){
            if(b[i]>max)max=b[i];
        }
        return max;
    }
    public static int min(int[]b){
        int min=b[0];
        for(int i=1; i<b.length;i++){
            if(b[i]<min)min=b[i];
        }
        return min;
    }
    public static void diagonal(int[][]c){
        int b=0;
        int i =0;
        for(i = 0 , b=c.length-1;i<c.length; i++,b--){
            c[i][b]=1;
            c[i][i]=1;

        }

    }
    public static void push(int[]h, int a){
        int[]z=new int[h.length];

    }

    }

