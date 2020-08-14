package by.epam.student.khvesko.module04.task6;

//Составьте описание класса для представления времени. Предусмотрте возможности установки
// времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости
// вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.
public class Time {
    private int hour;
    private int minute;
    private int second;

    Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    Time(int hour, int minute, int second) {
        if (hour < 0 || hour >= 12) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }

        if (minute < 0 || minute >= 60) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }

        if (second < 0 || second >= 60) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void show() {
        System.out.println("Time " + this.hour + ":" + this.minute + ":" + this.second);
    }

    public void editHour(int value) {
        this.hour += value;
        if (hour < 0 || hour >= 12) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void editMinute(int value) {
        this.minute += value;
        if (minute < 0 || minute >= 60) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void editSecond(int value) {
        this.second = value;
        if (second < 0 || second >= 60) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }
}
