import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");       //criando um formatador para converter de string para data 

        List<OrderItem> listItems = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // Insere os dados do usuário
        System.out.printf("Nome: ");
        String name = sc.nextLine();

        System.out.printf("E-mail: ");
        String email = sc.nextLine();

        System.out.printf("Data de nascimento (dd/mm/aaaa): ");
        String birthDate = sc.nextLine();                        // recebo data em string | poderia ser birthDate = sdf.parse(sc.next())
    
        Client newClient = new Client(name, email, formatter.parse(birthDate));         // converto para Date

        // Insere os dados do pedido
        System.out.println("\nInsira os dados do pedido");
        System.out.printf("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.printf("Quanto itens para esse pedido? ");
        int itemQuantity = sc.nextInt();

        Order order = new Order(new Date(), status, newClient);

        for (int i = 0; i < itemQuantity; i++)
        {
            System.out.printf("\nInsira os dados para o produto %d\n", i+1);
            sc.nextLine();
            System.out.printf("Nome do produto: ");
            String productName = sc.nextLine();

            System.out.printf("Preço do produto: ");
            double productPrice = sc.nextDouble();

            System.out.printf("Quantidade: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            
            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println("\nResumo do pedido:");
        System.out.println(order);


        sc.close();
    }
}
