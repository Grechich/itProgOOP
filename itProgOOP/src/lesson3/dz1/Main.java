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


