package by.epam.student.khvesko.module04.task1;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.init(3, 4);
        point.show();
        int max = point.findMax();
        System.out.println("Max = " + max);
        int sum = point.sum();
        System.out.println("Sum = " + sum);
    }
}
