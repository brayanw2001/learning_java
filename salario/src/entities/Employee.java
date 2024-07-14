package entities;
import java.util.Scanner;

public class Employee {

    public String name;
    public double grossSalary;
    //public double netSalary;
    public double tax;

    Scanner sc = new Scanner (System.in);
    
    //observe
    public void IncreaseSalary (double percentage)
    {
        //int increase;
        //System.out.printf("Qual a porcentagem de aumento? ");
        //sc.nextInt(increase);
        //System.out.printf("Novo salário: %.2f", grossSalary*percentage);

        this.grossSalary = ((this.grossSalary * percentage)/100) + this.grossSalary;
        System.out.println(grossSalary);
    }//

    public double netSalary ()
    {
        return grossSalary -= tax;
    }

}
