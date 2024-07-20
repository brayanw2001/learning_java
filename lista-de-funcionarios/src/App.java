import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Funcionarios;

public class App {
    public static void main(String[] args)
    {
        String id;
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        Funcionarios funcionarios;

        System.out.printf("Quantos funcionários deseja adicionar? ");
        int numFuncionarios = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numFuncionarios; i++)
        {
            boolean opc = false;
            do
            {
                System.out.printf("ID: ");
                id = sc.nextLine();

                for (Funcionarios funcionario : listaDeFuncionarios) {


                    if (funcionario.GetId().equals(id))
                    {
                        System.out.println("ID repetida");
                        opc = true;
                        break;  // este break permite que a checagem pare na primeira ID repetida
                    }
                    else 
                    {
                        opc = false;
                    }
                } 
            }
            while (opc == true);
            
            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("Salário: ");
            int salario = sc.nextInt();
            sc.nextLine();
            System.out.println();

            listaDeFuncionarios.add(new Funcionarios(id, nome, salario));
        }

        for (Funcionarios pessoas : listaDeFuncionarios) 
        {
            System.out.println(pessoas.ToString());
        }

        System.out.printf("\nSelecione a ID do funcionário que receberá aumento: ");
        String comparaId = sc.nextLine();

        boolean aux = false;
        Funcionarios funcionarioEcontrado = null;                 // funcionarioEncotrado aponta para NULL

        for (Funcionarios funcionario : listaDeFuncionarios) {    // cada funcionario apontara para um funcionario da lista
            if (funcionario.GetId().equals(comparaId))
            {
                aux = true;
                funcionarioEcontrado = funcionario;                // funcionarioEncontrado apontará para o funcionario com a ID encontrada. "funcionarioEcontrado" aponta para onde "funcionario" aponta em "ListaDeFuncionarios"
            }
        }

        if (aux)
        {
            System.out.printf("Qual será a porcentagem do aumento? ");
            double aumento = sc.nextInt();
            funcionarioEcontrado.EfetuarAumento(aumento);
        }
        else 
        {
            System.out.println("ID inexistente. Tenve novamente.\n");
        }

        for (Funcionarios pessoas : listaDeFuncionarios) 
        {
            System.out.println(pessoas.ToString());
        }

        sc.close();
    }
}
