package lesson1.dz12;

import lesson1.dz11.Item;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 3);
        System.out.println(triangle.getSquare());

    }
}
//Описать класс Треугольник. В качестве свойств возьмите длины сторон треугольника.
//Реализуйте метод, который будет возвращать площадь этого треугольника. Создайте
//несколько объектов этого класса и протестируйте их.