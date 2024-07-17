import java.util.Scanner;
import entities.Conta;

public class App {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        char opc;

        Conta conta = new Conta();

        System.out.printf("Insira o número da conta: ");
        conta.SetNumeroDaConta(sc.nextLine());
        //String numeroDaConta = sc.nextLine();

        System.out.printf("Insira o nome do titular da conta: ");
        conta.nomeDoTitular = sc.nextLine();
        //Conta conta = new Conta(nomeDoTitular);

        do
        {
            System.out.printf("Há um depósito inicial? (s/n): ");
            opc = sc.next().charAt(0);
            System.out.println(opc);

            switch (opc) {
                case 's':
                    System.out.printf("Insira o valor: ");
                    int deposito = sc.nextInt();
                    conta.SetDepositoInicial(deposito);
                    break;

                case 'n':
                    conta.SetDepositoInicial(0);
                    break;

                default:
                System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }
        while (opc != 's' && opc != 'n');
        conta.MostrarConta();

        System.out.printf("\nInsira o valor a ser depositado: ");
        conta.NovoDeposito(sc.nextDouble());
        conta.MostrarConta();

        System.out.printf("\nInsira o valor a ser sacado: ");
        conta.Saque(sc.nextDouble());
        conta.MostrarConta();

        sc.close();
    }
}

