package lesson3.dz1;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private String name;
    private Student[] students = new Student[10];

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getRecordBook() == student.getRecordBook()){
                    System.out.println("Student with recordBook #" + student.getRecordBook() + " is already in this group");
                    return;
                }
            }
        }

        try {
            for (int i = 0; i < students.length; i++) {

                if (students[i] == null){
                    students[i] = student;
                    student.setGroup(this.name);
                    System.out.println("Student " + student.getSurName() + " " + student.getName() + " added to group");
                    return;
                }
            }
            throw new GroupIsFullException();
        }catch (GroupIsFullException e){
            System.out.println(e.getMessage());
        }

    }

    public void delStudent(long recordBook) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getRecordBook() == recordBook){
                    System.out.println("Student " + students[i].getSurName()  + students[i].getName() + " deleted" );
                    students[i] = null;
                    return;
                }
            }
            System.out.println("Student with record book #" + recordBook + " is absent");
        }
    }

    public Student getStudent(String surName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                if (students[i].getSurName().equals(surName)){
                    return students[i];
                }
            }
        }
        System.out.println("Student with surname" + surName + " is absent");
        return null;
    }

    @Override
    public String toString() {
        return "Group [name= " + name + ", students: " + "\n" + Arrays.toString(sortByNames(students)) + "]";
    }

    public Student[] sortByNames(Student[] students) {
        Arrays.sort(students, Comparator.nullsLast(new StudentsByNameComparator()));
        return students;
    }

    public Student[] sortByLastNames(Student[] students) {
        Arrays.sort(students, Comparator.nullsLast(new StudentsByLastNameComparator()));
        return students;
    }

}