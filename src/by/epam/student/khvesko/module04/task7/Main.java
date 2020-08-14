package by.epam.student.khvesko.module04.task7;

import by.epam.student.khvesko.module04.task6.CorrectEnterFromConsole;

public class Main {
    public static void main(String[] args) {
        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int a;
        int b;
        int c;
        boolean fl=true;
        Triangle triangle=new Triangle();
        while(fl) {
            a = cons.enterIntFromConsole("a >> ");
            b = cons.enterIntFromConsole("b >> ");
            c = cons.enterIntFromConsole("c >> ");
            triangle=new Triangle(a,b,c);
            fl= triangle.check();
        }

        System.out.println("Периметр треугольника: "+triangle.per());
        System.out.println("Площадь треугольника: "+triangle.square());
    }


}
