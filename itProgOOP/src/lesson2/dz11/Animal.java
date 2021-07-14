package lesson2.dz11;

public abstract class Animal {

    private String ration;
    private String color;
    private int weight;

    public Animal() {
    }

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" + "ration='" + ration + '\'' + ", color='" + color + '\'' + ", weight=" + weight + '}';
    }

    public abstract String getVoice();
    public abstract void eat();
    public abstract void sleep();

}
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