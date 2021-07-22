package lesson3.dz1;

import java.util.Comparator;

public class StudentsByLastNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        String lastName1 = student1.getSurName();
        String lastName2 = student2.getSurName();
        return lastName1.compareTo(lastName2);
    }
}
