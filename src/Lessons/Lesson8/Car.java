package Lessons.Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c.engine = "v8";
        h1.c.color = "red";
        System.out.println("engine "+h1.c.engine);
        System.out.println("color "+h1.c.color);
    }
}


