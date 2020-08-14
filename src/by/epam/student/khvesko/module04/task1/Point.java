package by.epam.student.khvesko.module04.task1;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы
// изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных,
// и метод, который находит наибольшее значение из этих двух переменных.

public class Point {
    private int x;
    private int y;

    public void init(int a, int b) {
        x = a;
        y = b;
    }

    public void show() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public int sum() {
        int sum = x + y;
        return sum;
    }

    public int findMax() {
        int max;
        max = (x > y) ? x : y;
        return max;
    }

}
