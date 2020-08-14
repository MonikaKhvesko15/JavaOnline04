package by.epam.student.khvesko.module04.task7;

// Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
// вычисления площади, периметра и точки пересечения медиан.
public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public Triangle(){
        this.a=0;
        this.b=0;
        this.c=0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    public double per(){
        double result;
        result=this.a+this.b+this.c;
        return result;
    }

    public double square(){
        double result;
        double p=per()/2;
        result =Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
    }

    public boolean check(){
        boolean ch=false;
        if(this.a+this.b<this.c||this.a+this.c<this.b||this.c+this.b<this.a){
            System.out.println("Некорректный ввод длин сторон треугольника");
            ch=true;
        }
        return ch;
    }

}
