package by.epam.student.khvesko.module04.task5;

public class Main {
    public static void main(String[] args) {
        Count count=new Count();
        Count count1=new Count(45);
        count.show();
        count1.show();
        System.out.println("========================");
        count.addition(1);
        count1.substraction(13);
        count.show();
        count1.show();
    }
}
