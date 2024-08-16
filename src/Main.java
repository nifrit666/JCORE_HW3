import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Главный класс программы.
 */
public class Main {

    public static void main(String[] args) {
// Создание списка сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван Иванов", 3000 , 35));
        employees.add(new Manager("Пётр Петров", 5000 , 40));
        employees.add(new Employee("Серик Омаров", 4000 , 45));

        System.out.println("До повышения ЗП:");
        for (Employee employee : employees
        ) {
            System.out.println(employee);
        }
        // Повышение зарплаты всем сотрудникам, кроме руководителей
        Manager.increaseSalary(employees.toArray(new Employee[0]), 2000);
        System.out.println("\nПосле повышения ЗП:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Сортировка списка сотрудников по зарплате
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nПосле сортировки списка сотрудников по ЗП:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Сортировка списка сотрудников по возрасту
        Collections.sort(employees, new AgeComparator());

        System.out.println("\nСортировка по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}