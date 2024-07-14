package entities;

import java.util.Scanner;

public class Menu 
{

    public void ShowMenu() 
    {
        Product product = new Product();
        int opc;
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("=== Estoque ===");
        
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Mostrar produto");
            System.out.println("3. Adicionar entrada ao estoque de um produto");
            System.out.println("4. Adicionar saída ao estoque de um produto");
            System.out.println("5. Sair");
        

            opc = sc.nextInt();

            switch (opc) 
            {
                case 1:
                    product.CreateProduct();
                    break;
                case 2:
                    product.ShowProduct();
                    break;
                case 3:
                    product.AddProducts();
                    break;
                case 4:
                    product.RemoveProducts();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    ShowMenu();
                    break;
            }           
        }
        while (opc != 5);

        sc.close();
    }
}

