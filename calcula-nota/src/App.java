import entities.Estudante;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Estudante estudante = new Estudante();

        System.out.printf("Nome: ");
        estudante.nome = sc.nextLine();

        estudante.NotaFinal();
        estudante.VerificaAprovacao();
    }
}
