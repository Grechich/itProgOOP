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

        System.out.println(groupOOP.toString());
        
        System.out.println(groupOOP.getStudent("Rude"));
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
//4) * ��������� UML ������