package by.epam.student.khvesko.module04.task4.entity;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
// массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
// пользователем. Добавьте возможность сортировки массива по пункту назначения,
// причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.Calendar;

public class Train {
    private String destination;
    private int trainNumber;
    private Calendar calendar;

    public Train(){}

    public Train(int trainNumber){

    }

}
