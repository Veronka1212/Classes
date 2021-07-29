package by.epam.prog_with_class.task8;

public class Customer {

    //Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
    //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

    int id;
    String secondName;
    String name;
    String patronymic;
    String address;
    long сreditCardNumber;
    long bankAccountNumber;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", сreditCardNumber=" + сreditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    public Customer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getСreditCardNumber() {
        return сreditCardNumber;
    }

    public void setСreditCardNumber(long сreditCardNumber) {
        this.сreditCardNumber = сreditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Customer(int id, String secondName, String name, String patronymic, String address, long сreditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.сreditCardNumber = сreditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }
}
