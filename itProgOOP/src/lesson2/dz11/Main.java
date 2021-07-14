package lesson2.dz11;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Meat", "Black", 7,"Tuzik");
        Cat cat = new Cat("Fish", "White", 3,"Barsik");
        Veterinarian v1 = new Veterinarian("Petr");
        Veterinarian v2 = new Veterinarian("Karl");
        v1.treatment(dog);
        v2.treatment(cat);
    }
}
//Основной уровень.
//1) Создать класс Animal.
//У него должны быть поля:
//● String ration (чем питается животное)
//● String color (какого оно цвета)
//● int weight (вес)
// Методы:
//● Стандартные (методы получения и установки, toString() и т. д.)
//● String getVoice() (подать голос)
//● void eat() (есть)
//● void sleep() (спать)
//2) Создать классы Cat, Dog как подклассы Animal. Добавьте новое поле String name. Переопределите методы
//getVoice(), eat(), sleep().
//3) Создайте класс Veterinarian.
// Поля:
//● String name
// Методы:
//● Стандартные
//● void treatment(Animal animal) (Лечение животного. Лечить можно и кошек и собак)
//Java
