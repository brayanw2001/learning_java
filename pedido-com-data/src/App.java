import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");       //criando um formatador para converter de string para data 

        Scanner sc = new Scanner(System.in);

        System.out.printf("Nome: ");
        String name = sc.nextLine();

        System.out.printf("E-mail: ");
        String email = sc.nextLine();

        System.out.printf("Data de nascimento (dd/mm/aaaa): ");
        String birthDate = sc.nextLine();                                               // recebo data em string
    
        Client newClient = new Client(name, email, formatter.parse(birthDate));         // converto para Date

        System.out.println(newClient.toString());


        sc.close();
    }
}
