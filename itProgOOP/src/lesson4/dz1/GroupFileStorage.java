package lesson4.dz1;

import lesson3.dz1.Group;
import lesson3.dz1.Student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class GroupFileStorage {

    public static void saveGroupToCSV(Group gr){

        String students = "";
        File file = new File("D:\\Группы",  gr.getName() + ".txt");
        for (Student stud: gr.getStudents()) {
            if (stud != null) {
                students += stud.toCSVString();
            }else {
                students += "null";
            }
            students += "-";
        }
//        System.out.println(students);
            try (PrintWriter pw = new PrintWriter(file)){
                pw.println(students);
            }catch (IOException e){
                e.printStackTrace();
            }
    }

    public static Group loadGroupFromCSV(File file){

        String strFromTxt = "";
        Group group = new Group();
        Student student = new Student();
        String groupName[];
        try (FileReader fr = new FileReader(file); Scanner sc = new Scanner(fr)){
            strFromTxt = sc.nextLine();
            System.out.println(strFromTxt);
        }catch (IOException e){
            e.printStackTrace();
        }
        String[] students = strFromTxt.split("-");
        groupName = students[0].split(";");
        group.setName(groupName[0]);
        for (int i = 0; i < 9; i++) {
            if (!students[i].equals("null")) {
                group.addStudent(student.fromCSVString(students[i]));
            }
        }
        return group;
    }

    public static File findFileByGroupName (String groupName, File workFolder){
        if (!workFolder.exists()){
            throw new IllegalArgumentException();
        }

        File[] files = workFolder.listFiles();
        for (File file: files) {
            if (file.getName().equals(groupName + ".txt")){
                return file;
            }
        }
        System.out.println("File not found");
        return null;
    }

}
//        Реализуйте отдельный класс GroupFileStorage в котором будут следующие методы:
//        ● void saveGroupToCSV(Group gr) — запись группы в CSV файл
//        ● Group loadGroupFromCSV(File file) — вычитка и возврат группы из файла
//        ● File findFileByGroupName(String groupName, File workFolder) — поиск файла в рабочем каталоге (workFolder).
//        Название файла определяется названием группы в нем сохраненной.