package lesson1.dz12;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public double getSquare (){
        double p = (this.a + this.b + this.c)/2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
//Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника.
//Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте
//несколько объектов этого класса и протестируйте их.