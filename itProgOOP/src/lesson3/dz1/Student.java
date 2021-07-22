package lesson3.dz1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Student extends Person implements CSVConverter{

    private String group;
    private long recordBook;

    public Student() {
    }

    public Student(String name, String surName, int age, Gender gender, String group, long recordBook) {
        super(name, surName, age, gender);
        this.group = group;
        this.recordBook = recordBook;
    }


    //�� ������ �������� ������� ������ � ��� CSV �������������� � �������� �� ������ ���� ������
    //������� ��������.
    @Override
    public String toCSVString() {
        String stud;
        File file = new File("D:\\Student.txt");
        stud = this.group + ";" + this.recordBook + ";" + this.getName() + ";" + this.getSurName() +
                ";" + this.getAge() + ";" + this.getGender();
         try (PrintWriter pw = new PrintWriter(file)){
            pw.println(stud);
        }catch (IOException e){
            e.printStackTrace();
        }
        return stud;
    }

    @Override
    public Student fromCSVString(String str) {
        String[] fields = str.split(";");
        Arrays.toString(fields);

        String group = fields[0];
        try {
            long recordBook = Integer.parseInt(fields[1]);
        }catch(Exception e){
            e.printStackTrace();
        }

        String name = fields[2];
        String surName = fields[3];
        int age = 0;
        try {
            age = Integer.parseInt(fields[4]);
        }catch (Exception e){
            e.printStackTrace();
        }
        Gender gender;
        if (fields[5].equals("MALE")){
            gender = Gender.MALE;
        }else if (fields[5].equals("FEMALE")){
            gender = Gender.FEMALE;
        }else {
            gender = null;
        }
        Student student = new Student(name, surName, age, gender, group, recordBook);
        return student;
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
