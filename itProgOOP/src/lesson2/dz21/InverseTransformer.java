package lesson2.dz21;

public class InverseTransformer extends TextTransformer{

    @Override
    public String transform(String text){
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
//2) Создайте класс InverseTransformer как подкласс TextTransformer. Переопределите метод String
//transform(String text) — Производит реверс текста. Пример hello → olleh