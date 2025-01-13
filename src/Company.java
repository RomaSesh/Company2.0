import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    // ОПИСАНИЯ ПОЛЕЙ И МЕТОДОВ
    public String name; // название
    public int persons; // количество сотрудников
    public int money;   // месячный фонд зарплаты

    // конструктор
    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }

    public void show() {
        System.out.println("В компании " + name + " трудятся " + persons + " сотрудников");
        System.out.println("Фонд зарплаты: " + money);
    }

    public int averageSalary() {
        return persons > 0 ? money / persons : 0;
    }
}



