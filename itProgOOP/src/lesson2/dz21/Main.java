package lesson2.dz21;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String str ="Hello World!";
        TextTransformer tr = new TextTransformer();
        System.out.println(tr.transform(str));
        tr = new InverseTransformer();
        System.out.println(tr.transform(str));
        tr = new UpDownTransformer();
        System.out.println(tr.transform(str));

        String file = "C:/Java/text.txt";
        TextSaver textSaver = new TextSaver(new UpDownTransformer(), new File(file));
        textSaver.saveTextToFile(str);

    }
}

//Продвинутый уровень.
//1) Создайте класс TextTransformer.
//Метод:
//● String transform(String text) — Переводит текст в верхний регистр. Пример hello→ HELLO
//2) Создайте класс InverseTransformer как подкласс TextTransformer. Переопределите метод String
//transform(String text) — Производит реверс текста. Пример hello → olleh
//3) Создайте класс UpDownTransformer как подкласс TextTransformer. Переопределите метод String
//transform(String text) — Каждая нечетная буква большая, четная маленькая. Пример hello → HeLlO
//4) Создайте класс TextSaver.
//Поля:
//● TextTransformer transformer
//● File file
//Методы:
//● void saveTextToFile(String text) — Сначала преобразует одним из трансформеров (поле
//transformer) строку, после чего сохранить ее в файл(поле file).