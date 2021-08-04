package lesson3.dz1;

public class Main {

    public static void main(String[] args) {
        Group groupOOP = new Group("OOP");
        Group groupOOP2 = new Group("OOP");
        Student s1 = new Student("Dimon", "Black", 18, Gender.MALE, "OOP-1", 1280);
        Student s2 = new Student("Jane", "Rude", 37, Gender.FEMALE, "OOP-1", 1275);
        Student s3 = new Student("Alena", "Kuka", 28, Gender.FEMALE, "OOP-1", 1215);
        Student s4 = new Student("Alena", "Kuka", 28, Gender.FEMALE, "OOP-1", 1215);
        groupOOP.addStudent(s1);
        groupOOP.addStudent(s2);
        groupOOP.addStudent(s3);
        groupOOP2.addStudent(s1);
        groupOOP2.addStudent(s2);
        groupOOP2.addStudent(s4);
        System.out.println("--------------");
        Container container = new Container();
        container.push(s1);
        container.push(groupOOP);
        container.push(s1);
        container.push(s2);
        container.push("Hello");
        container.push(123);
        System.out.println(container.peek());
        System.out.println(container.pop());
        System.out.println(container.peek());
        System.out.println(container.pop());
        System.out.println(container.peek());

    }
}


