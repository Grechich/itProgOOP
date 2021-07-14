package lesson2.dz11;

public class Veterinarian {
    private String name;

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }

    public void treatment(Animal animal){
        System.out.println(animal.toString() + " is heeling by " + this.toString());
    }

}
//3) Создайте класс Veterinarian.
// Поля:
//● String name
// Методы:
//● Стандартные
//● void treatment(Animal animal) (Лечение животного. Лечить можно и кошек и собак)
//Java