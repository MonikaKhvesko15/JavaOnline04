package by.epam.student.khvesko.module04.task4.logic;

import by.epam.student.khvesko.module04.task4.entity.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainLogic {
     public List<Train> sortByNumber(List<Train> trains){
         List<Train> sortTrains=new ArrayList<Train>();
         sortTrains.addAll(trains);

         for (int i = 0; i < sortTrains.size(); i++) {

         }
         return sortTrains;
     }

     public Train findByNumber(int findNumber,List<Train> trains){
         Train train=null;
         for (int i = 0; i < trains.size(); i++) {

         }
         return train;
     }

     public List<Train> sortBy(List<Train> trains){
         List<Train> sortTrains=new ArrayList<Train>();
         sortTrains.addAll(trains);

         for (int i = 0; i < sortTrains.size(); i++) {

         }
         return sortTrains;
     }
}
