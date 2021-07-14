package lesson1.dz21;

public class Phone {
    private String phoneNumber;
    private boolean isRegisteredInNetwork;

    public Phone() {
    }
    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRegistredInNetwork() {
        return isRegisteredInNetwork;
    }

    public void setRegistredInNetwork(boolean registeredInNetwork) {
        isRegisteredInNetwork = registeredInNetwork;
    }


    public void registrationInNetwork(Network network){
        isRegisteredInNetwork = network.phoneRegistration(this);
    }

    public void tryToCall(String phoneNumber, Network network){
        if (!isRegisteredInNetwork){
            System.out.println("Tne phone number " + this.getPhoneNumber() + " you calling from is not registered in the network");
        }else if (!network.isPhoneNumberRegistered(phoneNumber)){
            System.out.println("Tne phone number " + phoneNumber + " you calling to is not registered in the network");
        }else {
            network.call(this, phoneNumber);
        }
    }

    public void incomingCall(String phoneNumber){
        System.out.println("Incoming call from " + phoneNumber + " to " + this.getPhoneNumber());
    }

    public void outgoingCall(String phoneNumber){
        System.out.println("Outgoing call from " + this.getPhoneNumber() + " to " + phoneNumber);
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