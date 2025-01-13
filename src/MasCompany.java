import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MasCompany {
    public static void main(String[] args) {
        // Используем ArrayList для динамического массива
        List<Company> cityCompanies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ввод информации о компаниях
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите информацию о компании " + (i + 1) + ":");
            System.out.print("Название: ");
            String name = scanner.nextLine();
            System.out.print("Количество сотрудников: ");
            int persons = Integer.parseInt(scanner.nextLine());// Считываем количество сотрудников
            System.out.print("Фонд зарплаты: ");
            int money = Integer.parseInt(scanner.nextLine());
            cityCompanies.add(new Company(name, persons, money)); // Добавляем объект в ArrayList
        }

        // Вывод компаний с средней зарплатой выше 10,000
        System.out.println("\nКомпании с средней зарплатой выше 10,000:");
        for (Company company : cityCompanies) {
            if (company.averageSalary() > 10000) {
                company.show();
            }
        }

        scanner.close(); // Закрываем сканер
    }
}
