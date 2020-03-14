package ru.geekbrains.lesson4.home_work;

public class Worker {
    private  String family;
    private  int salary ;
    private  int age;
    private  String position ;
    private int number ;
    private static int a = 1;

    Worker (String family, int salary, int age,String position){
        this.family=family;
        this.salary=salary;
        this.age=age;
        this.position=position;
        this.number=a++;
    }
    public String getFamily(){
        return family;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public String getPosition() {
        return position;
    }
    public int getNumber(){
        return number;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }





}
