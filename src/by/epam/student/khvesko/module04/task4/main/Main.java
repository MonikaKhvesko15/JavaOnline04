package by.epam.student.khvesko.module04.task4.main;

import by.epam.student.khvesko.module04.task4.entity.Depo;
import by.epam.student.khvesko.module04.task4.entity.Train;
import by.epam.student.khvesko.module04.task4.logic.TrainLogic;
import by.epam.student.khvesko.module04.task4.view.TrainView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Depo depo =new Depo();//обьект данных
        TrainLogic logic=new TrainLogic();//обьект логики
        TrainView view =new TrainView();//обьект представления

        depo.addTrain(new Train());
        depo.addTrain(new Train());
        depo.addTrain(new Train());
        depo.addTrain(new Train());

        List<Train> sorted;
        sorted=logic.sortByNumber(depo.getTrains());
        view.print("By number", sorted);

        Train train;
        train=logic.findByNumber(123,depo.getTrains());
        view.print(train);
    }
}
