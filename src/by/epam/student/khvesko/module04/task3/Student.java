package by.epam.student.khvesko.module04.task3;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
    private String name;
    private int group;
    private int[] grade;

    public Student(String name,int group,int... grade)
    {
        this.name=name;
        this.group=group;
        this.grade=grade;
    }

   public void setName(String name){
        this.name=name;
   }

   public String getName(){
        return this.name;
   }

   public void setGroup(int group){
        this.group=group;
   }

   public int getGroup(){
        return this.group;
   }

   public void setGrade(int[] grade){
        this.grade=grade;
   }

   public int[] getGrade(){
        return this.grade;
   }

   public void show(){
       System.out.println("Student name: "+this.getName());
       System.out.println(("Group number: "+this.getGroup()));
       System.out.println();
   }
}

