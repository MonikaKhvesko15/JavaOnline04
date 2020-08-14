package by.epam.student.khvesko.module04.task8;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
// set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer,
// с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:  a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
    private int id;
    private String name;
    private Address address;
    private String creditCard;
    private String bankAccount;

    public Customer(){
        this.id=0;
        this.name=null;
        this.address=null;
        this.creditCard=null;
        this.bankAccount=null;
    }

    public Customer(int id,String name,Address address,String creditCard,String bankAccount){
        this.id=id;
        this.name=name;
        this.address=address;
        this.creditCard=creditCard;
        this.bankAccount=bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void show(){
        System.out.println("ID: "+this.id+" Name: "+this.name);
       this.address.show();
        System.out.println("Credit card: "+this.creditCard);
        System.out.println("Bank account: "+this.bankAccount);
        System.out.println();
    }
}
