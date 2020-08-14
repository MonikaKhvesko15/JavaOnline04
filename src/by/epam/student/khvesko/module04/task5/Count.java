package by.epam.student.khvesko.module04.task5;

//. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
// значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
// по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий
// все возможности класса.

public class Count {
   private int value;

    Count(){
        this.value=0;
    }

    Count(int value){
        this.value=value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value=value;
    }

    public void addition(int addValue){
        this.value+=addValue;
    }

    public void substraction(int minusValue){
        this.value-=minusValue;
    }

    public void show(){
        System.out.println("Actually value: "+this.value);
    }

}
