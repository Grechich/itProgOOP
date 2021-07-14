package lesson2.dz11;

public class Dog extends Animal{
    private String name;

    public Dog() {
        super();
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return null;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + '}' + ", " + super.toString();
    }
}
//2) Создать классы Cat, Dog как подклассы Animal. Добавьте новое поле String name. Переопределите методы
//getVoice(), eat(), sleep().