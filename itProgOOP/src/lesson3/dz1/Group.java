package lesson3.dz1;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private String name;
	private Student[] students = new Student[10];

	public void addStudent(Student student) {

	}

	public void delStudent(Student student) {

	}

	public Student getStudent(String surName) {
		return null;
	}

	@Override
	public String toString() {

		return "Group [name=" + name + ", students=" + Arrays.toString(sortByNames(students)) + "]";
	}

	public Student[] sortByNames(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {
			public int compare(Student stud1, Student stud2) {
				return stud1.getName().compareTo(stud2.getName());
			}
		});
		return students;
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