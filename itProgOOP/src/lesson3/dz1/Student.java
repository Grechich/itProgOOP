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