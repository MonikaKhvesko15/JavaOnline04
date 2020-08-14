package by.epam.student.khvesko.module04.task6;

public class Main {
    public static void main(String[] args) {
        Time time=new Time(3,66,15);
        time.show();

        CorrectEnterFromConsole cons=new CorrectEnterFromConsole();
        int hour=cons.enterIntFromConsole("hour >> ");
        int minute=cons.enterIntFromConsole("minute >> ");
        int second= cons.enterIntFromConsole("second >> ");

        time.editHour(hour);
        time.editMinute(minute);
        time.editSecond(second);

        time.show();
    }
}
