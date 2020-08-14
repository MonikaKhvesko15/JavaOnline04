package by.epam.student.khvesko.module04.task2;

public class Main {
    public static void main(String[] args) {
        Point point=new Point();
        point.show();

        Point pointReady=new Point(5,10);
        pointReady.show();

        point.setX(17);
        point.setY(1);
        point.show();
    }
}
