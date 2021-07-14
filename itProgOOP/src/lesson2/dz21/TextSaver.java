package lesson2.dz21;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {

    private TextTransformer transformer;
    private File file;

    public TextSaver() {
    }

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public void saveTextToFile(String text){
        text = transformer.transform(text);
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
//4) Создайте класс TextSaver.
//Поля:
//● TextTransformer transformer
//● File file
//Методы:
//● void saveTextToFile(String text) — Сначала преобразует одним из трансформеров (поле
//transformer) строку, после чего сохранить ее в файл(поле file).