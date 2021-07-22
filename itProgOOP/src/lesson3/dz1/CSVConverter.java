package lesson3.dz1;

public interface CSVConverter {
        String toCSVString();
        Student fromCSVString (String str);
}
//1) Объявите интерфейс
//public interface CSVConverter{
//public String toCSVString();
//public Student fromCSVString (String str);
//}
//Класс Студент должен реализовывать этот интерфейс. Логика реализации следующая — на
//основе Студента создать строку с его CSV представлением и наоборот на основе этой строки
//создать Студента.