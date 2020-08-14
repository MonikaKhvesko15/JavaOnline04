package by.epam.student.khvesko.module04.task2;

// Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию.
// Добавьте set- и get- методы для полей экземпляра класса.

public class Point {
    private int x;
    private int y;

    //конструктор, инициализирующий члены класса по умолчанию
    public Point(){
        this.x=0;
        this.y=0;
    }

    //конструктор с входными параметрами
    public Point(int a, int b){
        this.x=a;
        this.y=b;
    }

    public int getX(){
        return x;
    }

    public void setX(int valueX){
        this.x=valueX;
    }

    public int getY(){
        return y;
    }

    public void setY(int valueY){
        this.y=valueY;
    }

    public void show(){
        System.out.println("x = "+this.x);
        System.out.println("y = "+this.y);
        System.out.println();
    }
}
