package lesson1.dz21;

public class Main {
    public static void main(String[] args) {
    Network network = new Network();
    Phone phone1 = new Phone("80931234567");
    Phone phone2 = new Phone("80501234567");

    phone1.tryToCall(phone2.getPhoneNumber(),network);

    phone1.registrationInNetwork(network);
    phone1.tryToCall(phone2.getPhoneNumber(),network);

    phone2.registrationInNetwork(network);

    phone1.tryToCall(phone2.getPhoneNumber(),network);
    phone2.tryToCall(phone1.getPhoneNumber(),network);

    }
}
//Создайте класс Phone (Телефон) одним из свойств должен быть его номер. Создайте
//класс Network (сеть мобильного оператора). В классе Телефон должны быть описаны
//следующие методы:
//● Регистрация в сети мобильного оператора
//● Метод реализующий исходящий звонок. Данный метод принимает один параметр
//(описывающий номер мобильного телефона). Логика работы этого метода такова:
//если текущий телефон не прошел регистрацию в сети, то закончить работу метода с
//сообщением об этом. Если текущий телефон прошел регистрацию и в сети также
//зарегистрирован телефон на номер которого совершается вызов, то вызвать метод
//входящий звонок у того телефона. Если телефон на номер которого вы совершаете
//вызов в сети не зарегистрирован, то закончить работу метода с сообщением об
//этом.