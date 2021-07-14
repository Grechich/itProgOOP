package lesson1.dz21;

public class Network {
    private int i;
    private Phone [] registeredPhones = new Phone[100]; //Пусть сеть выдерживает максимум 100 телефонов

    public Network() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Phone[] getRegisteredPhones() {
        return registeredPhones;
    }

    public void setRegisteredPhones(Phone[] registeredPhones) {
        this.registeredPhones = registeredPhones;
    }

    public boolean phoneRegistration(Phone phone){
        if (phone != null & i < 100){
            registeredPhones[i] = phone;
            i++;
            return true;
        }
        return false;
    }

    public Phone getPhoneByNumber(String number){
        for (int j = 0; j < i; j++) {
            if (registeredPhones[j].getPhoneNumber().equals(number)){
                return registeredPhones[j];
            }
        }
        System.out.println("Phone with number " + number + " is not registered in the network");
        return new Phone(number);
    }

    public boolean isPhoneNumberRegistered(String phoneNumber){
        for (int j = 0; j < this.i; j++) {
            if (registeredPhones[j].getPhoneNumber().equals(phoneNumber)){
                return true;
            }
        }
        return false;
    }

    public void call(Phone outgoingPhone, String incomingPhone){
        getPhoneByNumber(incomingPhone).incomingCall(outgoingPhone.getPhoneNumber());
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