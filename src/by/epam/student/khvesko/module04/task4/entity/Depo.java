package by.epam.student.khvesko.module04.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Depo {
    private List<Train> trains;
    {
        trains=new ArrayList<>();
    }

    public Depo(){

    }

    public Depo(int n){

    }

    public List<Train> getTrains(){
        return trains;
    }

    public void addTrain(Train train){
        trains.add(train);
    }
}
