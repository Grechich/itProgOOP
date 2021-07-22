package lesson3.dz1;

import java.util.Comparator;

public class StudentsByNameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        String name1 = student1.getName();
        String name2 = student2.getName();
        return name1.compareTo(name2);
    }
}
