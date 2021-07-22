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
        Student s4 = new StudentFromKeyboard();
        System.out.println(s4);
        groupOOP.addStudent(s4);
        System.out.println(s4);
        String str = s3.toCSVString();
        System.out.println(str);
        Student s5 = s2.fromCSVString(str);
        System.out.println(s5.toString());
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

//Основной уровень.
//1) Дополните реализацию группы Студентов (задание прошлой лекции) возможностью сортировки
//массива студентов по фамилии. Для этого в класс Группа добавьте метод
//sortStudentsByLastName().
//2)Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры
//(имя, фамилии и т. д.). Создание и возврат студента на основе считанных данных. Используете
//методы этого класса для считывания и добавления студента в группу.

//Продвинутый уровень.
//1) Объявите интерфейс
//public interface CSVConverter{
//public String toCSVString();
//public Student fromCSVString (String str);
//}
//Класс Студент должен реализовывать этот интерфейс. Логика реализации следующая — на
//основе Студента создать строку с его CSV представлением и наоборот на основе этой строки
//создать Студента.