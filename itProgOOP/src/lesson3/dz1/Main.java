package lesson3.dz1;

public class Main {

    public static void main(String[] args) {
        Group groupOOP = new Group("OOP");
        Student s1 = new Student("Dimon", "Black", 28, Gender.MALE, "OOP-1", 1280);
        Student s2 = new Student("Jane", "Rude", 35, Gender.FEMALE, "OOP-1", 1275);
        Student s3 = new Student("Alena", "Kuka", 21, Gender.FEMALE, "OOP-1", 1215);
        System.out.println(s2);
        groupOOP.addStudent(s1);
        groupOOP.addStudent(s2);
        groupOOP.addStudent(s2);
        groupOOP.addStudent(s3);

        System.out.println(groupOOP.toString());
        
        System.out.println(groupOOP.getStudent("Rude"));
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
//4) * Нарисуйте UML диагра