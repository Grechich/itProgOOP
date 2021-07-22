package lesson3.dz1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentFromKeyboard extends Student{

    Scanner scanner = new Scanner(System.in);
    private String gender;

    public StudentFromKeyboard(){

        System.out.println("Enter name:");
        this.setName(scanner.nextLine());

        System.out.println("Enter lastname:");
        this.setSurName(scanner.nextLine());


        for (; ; ) {
            try {
                System.out.println("Enter age:");
                this.setAge(scanner.nextInt());
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!");
                scanner.nextLine();
            }
        }

        for (; ; ) {
            System.out.println("Enter gender (MALE or FEMALE):");
            gender = scanner.nextLine();
            if (gender.equals("MALE")){
                this.setGender(Gender.MALE);
                break;
            }
            if (gender.equals("FEMALE")){
                this.setGender(Gender.FEMALE);
                break;
            }
            System.out.println("Incorrect input!");
        }

        System.out.println("Enter group:");
        this.setGroup(scanner.nextLine());

        for (; ; ) {
            try {
                System.out.println("Enter recordBook:");
                this.setRecordBook(scanner.nextLong());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input!");
                scanner.nextLine();
            }
        }
    }
    public void addStudentToGroup(Student student, Group group){
        group.addStudent(student);
    }
}
//2)Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры
//(имя, фамилии и т. д.). Создание и возврат студента на основе считанных данных. Используете
//методы этого класса для считывания и добавления студента в группу.