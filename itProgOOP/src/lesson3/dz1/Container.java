package lesson3.dz1;

public class Container {

    private String name;
    private Object[] arrayObjects = new Object[0];

    public Container(String name, Object[] arrayObjects) {
        this.name = name;
        this.arrayObjects = arrayObjects;
    }

    public Container() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getArrayObjects() {
        return arrayObjects;
    }

    public void setArrayObjects(Object[] arrayObjects) {
        this.arrayObjects = arrayObjects;
    }

    public void push(Object obj) {
        if (obj != null) {
            Object[] objects = new Object[arrayObjects.length + 1];
            for (int i = 0; i < arrayObjects.length; i++) {
                objects[i] = arrayObjects[i];
            }
            objects[arrayObjects.length] = obj;
            arrayObjects = objects;
        } else {
            System.out.println("Your object is null. You can add only not-null objects");
        }
    }

    public Object pop() {
        Object o = arrayObjects[arrayObjects.length - 1];
        Object[] objects = new Object[arrayObjects.length - 1];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = arrayObjects[i];
        }
        arrayObjects = objects;
        return o;
    }

    public Object peek() {
        return arrayObjects[arrayObjects.length - 1];
    }


}
//        Создайте класс-контейнер типа стек (класс в который можно добавлять и удалять
//        объекты других классов, только в вершину стека), в который можно сохранять объекты
//        произвольного типа. Создайте стек на основе массива Object.
//        Реализуйте методы:
//        ● public void push(Object obj) добавления элемента в стек
//        ● public Object pop() получение с удалением элемента из вершины стека
//        ● public Object peek() получение элемента с вершины стека без удаления.
