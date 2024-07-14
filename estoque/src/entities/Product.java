package entities;
import java.util.Scanner;

public class Product 
{
    Scanner sc = new Scanner(System.in);

    public String name;
    public double price;
    public int quantity;    

    public void CreateProduct ()
    {
        System.out.printf("Nome do produto: ");
        name = sc.nextLine();

        System.out.printf("Preço: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Quantidade: ");
        quantity = sc.nextInt();
        sc.nextLine();
    }
    public double TotalValueInStock ()
    {
        return quantity*price;
    }

    public void AddProducts ()
    {
        System.out.printf("Quantos itens deseja adicionar?");    
        int addItem = sc.nextInt();

        if (addItem < 0)
        {
            System.out.println("Forneça um número maior que zero.");
        }
        else 
        {
            quantity += addItem;
        }
    }

    public void RemoveProducts ()
    {
        System.out.printf("Quantos itens deseja remover?");
        int RemoveItem = sc.nextInt();

        if (RemoveItem < 0)
        {
            System.out.println("Forneça um número positivo.");
        }
        else 
        {
            quantity -= RemoveItem;
        }
    }

    public void ShowProduct ()
    {
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Preço: %.2f\n", price);
        System.out.printf("Quantidade: %d\n", quantity);
    }
}
