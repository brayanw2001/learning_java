import java.util.Scanner;
import entities.Employee;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        Employee employee;
        employee = new Employee();

        System.out.printf("Nome: ");
        employee.name = sc.nextLine();

        System.out.printf("Salário: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.printf("Deduções: ");
        employee.tax = sc.nextDouble();

        //observe
        System.out.println("Qual a porcentagem de aumento?");
        employee.IncreaseSalary(sc.nextDouble());
        //

        System.out.println("O novo salário é: " + employee.netSalary());

    }
}