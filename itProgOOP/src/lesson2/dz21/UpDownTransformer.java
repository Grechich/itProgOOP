package lesson2.dz21;

public class UpDownTransformer extends TextTransformer{

    @Override
    public String transform(String text){
        char[] chars = text.toCharArray();
        text = "";
        for (int i = 0; i < chars.length; i++) {
            if (i%2 == 0){
                chars[i] = Character.toUpperCase(chars[i]);
            }else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            text += chars[i];
        }
        return text;
    }
}
//3) Создайте класс UpDownTransformer как подкласс TextTransformer. Переопределите метод String
//transform(String text) — Каждая нечетная буква большая, четная маленькая. Пример hello → HeLlO