package ru.geekbrains.lesson4.home_work;

public class Main {
    public static void main(String[] args) {
        Worker one = new Worker("Ivanov", 30000, 27, "courier");
        Worker two = new Worker("Petrov", 40000, 25, "singer");
        Worker three = new Worker("Sidorov", 50000, 56, "driver");
        Worker four = new Worker("Maslov", 60000, 48, "manager");
        Worker five = new Worker("Mikhalkov", 100000, 53, "director");
        Worker[] workers = new Worker[5];
        workers[0] = one;
        workers[1] = two;
        workers[2] = three;
        workers[3] = four;
        workers[4] = five;
        fortyPlus(workers);
        salaryPlus(workers);
        System.out.println(four.getSalary());


        System.out.println(one.getFamily());
        System.out.println(one.getPosition());
        Print_arithmetic(workers);
        System.out.println(five.getNumber());
    }

    public static void fortyPlus(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40)
                System.out.println(workers[i].getFamily() + " " + workers[i].getSalary() + " " + workers[i].getAge() + " " + workers[i].getPosition());
        }
    }

    public static void salaryPlus(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 45) workers[i].setSalary( workers[i].getSalary()+5000);

                ;


        }
    }
    public static void Print_arithmetic(Worker[]workers){
    double a = 0;
    double b = 0;
        for (int i = 0; i <workers.length ; i++) {
            a+=workers[i].getSalary();
            b+=workers[i].getAge();
        }
        a=a/workers.length;
        b=b/workers.length;
        System.out.println("Средняя зарплата сотрудников в нашей фирме = "+a);
        System.out.println("Средний возраст сотрудников = "+b);
    }

}
