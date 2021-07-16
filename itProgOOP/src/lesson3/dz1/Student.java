package lesson3.dz1;

public class Student extends Person{

    private String group;
    private long recordBook;

    public Student() {
    }

    public Student(String name, String surName, int age, Gender gender, String group, long recordBook) {
        super(name, surName, age, gender);
        this.group = group;
        this.recordBook = recordBook;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public long getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(long recordBook) {
        this.recordBook = recordBook;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", recordBook=" + recordBook +
                '}'+ "; " + super.toString();
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