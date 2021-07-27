package lesson4.dz1;

import lesson4.dz1.FilesComparator;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File file = new File(args[0]);
        File file1 = new File(args[1]);

//        File file = new File("D:\\groups\\Java.txt");
//        File file1 = new File("D:\\groups\\Java.txt");
        try {
            System.out.println(FilesComparator.twoFilesComparator(file, file1));
        }catch (IOException e){
            e.printStackTrace();
        }



//        Student s1 = new Student("Dimon", "Black", 28, Gender.MALE, "OOP-1", 1280);
//        Student s2 = new Student("Jane", "Rude", 35, Gender.FEMALE, "OOP-1", 1275);
//        Student s3 = new Student("Alena", "Kuka", 21, Gender.FEMALE, "OOP-1", 1215);
//        Group groupJava = new Group("Java");
//
//        groupJava.addStudent(s1);
//        groupJava.addStudent(s2);
//        groupJava.addStudent(s3);
//        GroupFileStorage.saveGroupToCSV(groupJava);
//        File workFolder = new File("D:\\Группы");
//        File group = GroupFileStorage.findFileByGroupName("Java",workFolder);
//        Group groupFromTxt = GroupFileStorage.loadGroupFromCSV(group);
//        System.out.println(groupFromTxt);



//        try{
//            CopyFilesWithExtension.copyFiles("D:\\Новая папка\\Folder2","D:\\Новая папка\\Folder2","docx");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}


//        1)Напишите программу, которая скопирует все файлы с заранее определенным расширением
//        (например, только doc) из одного каталога в другой.
//        2) Реализуйте отдельный класс GroupFileStorage в котором будут следующие методы:
//        ● void saveGroupToCSV(Group gr) — запись группы в CSV файл
//        ● Group loadGroupFromCSV(File file) — вычитка и возврат группы из файла
//        ● File findFileByGroupName(String groupName, File workFolder) — поиск файла в рабочем каталоге (workFolder).
//        Название файла определяется названием группы в нем сохраненной.
//        1) Реализуйте сервис для сравнения файлов на идентичность. Файлы считаются идентичными если они побайтово равны.
//        Файлы разной длинны, или файлы в которых хотя бы один байт отличен считаются разными.
//        2) Дополните полученный сервис возможностью передачи адресов файлов в ключевом режиме призапуске приложения из командной строки.
