package ru.geekbrains.lesson_5.home_work;

public abstract class Animal {
    private  int run_distance ;
    private  int swim_distance;
    private  double jump_distance ;
    /* Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина,
 означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
  плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

 При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

 Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/
    Animal(int run_distance, int swim_distance, double jump_distance){
        this.run_distance=run_distance;
        this.swim_distance=swim_distance;
        this.jump_distance=jump_distance;
    }

    public boolean run(int distance){
        return (distance<=run_distance);
    }
    public  boolean jump(int distance){
        return (distance<=jump_distance);
    }
    public  boolean swim(int distance ){
        return (distance<=swim_distance);
    }
}
