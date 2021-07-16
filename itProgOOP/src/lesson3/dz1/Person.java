package lesson3.dz1;

public class Person {

    private String name;
    private String surName;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(String name, String surName, int age, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

//1) Создайте класс, описывающий человека (создайте метод,
//выводящий информацию о человеке).
//2) На его основе создайте класс студент (переопределите
//метод вывода информации).
//3) Создайте класс Группа, который содержит массив из 10
//объектов класса Студент. Реализуйте методы добавления,
//удаления студента и метод поиска студента по фамилии. В
//случае попытки добавления 11 студента, создайте
//собственное исключение и обработайте его. Определите
//метод toString() для группы так, что бы он выводил список
//студентов в алфавитном порядке.
//4) * Нарисуйте UML диаграмму проекта.