package by.epam.student.khvesko.module04.task3;

public class Main {
    public static void main(String[] args) {
        Student[] array=new Student[10];
        array[0]=new Student("Anna",978300,7,8,8,6,9);
        array[1]=new Student("Alex",978301,9,9,10,10,9);
        array[2]=new Student("Vasya",973300,9,9,9,10,9);
        array[3]=new Student("Katya",978300,7,8,8,7,10);
        array[4]=new Student("Lera",978301,8,9,8,9,9);
        array[5]=new Student("Victor",972304,9,9,10,9,9);
        array[6]=new Student("Ilya",972304,9,10,9,10,9);
        array[7]=new Student("Monika",972304,10,10,10,10,10);
        array[8]=new Student("Marina",972304,9,9,8,9,9);
        array[9]=new Student("Yana",972304,10,9,9,9,10);

        showExellentStudent(array);
    }

    public static void showExellentStudent(Student[] array){
        for (int i = 0; i < array.length; i++) {
            int count=0;
            for (int j = 0; j < array[i].getGrade().length; j++) {
                if(array[i].getGrade()[j]==9||array[i].getGrade()[j]==10){
                    count++;
                }
            }
            if(count==5){
               array[i].show();
            }
        }
    }
}
