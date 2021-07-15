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
//1) �������� �����, ����������� �������� (�������� �����,
//��������� ���������� � ��������).
//2) �� ��� ������ �������� ����� ������� (��������������
//����� ������ ����������).
//3) �������� ����� ������, ������� �������� ������ �� 10
//�������� ������ �������. ���������� ������ ����������,
//�������� �������� � ����� ������ �������� �� �������. �
//������ ������� ���������� 11 ��������, ��������
//����������� ���������� � ����������� ���. ����������
//����� toString() ��� ������ ���, ��� �� �� ������� ������
//��������� � ���������� �������.
//4) * ��������� UML ��������� �������.