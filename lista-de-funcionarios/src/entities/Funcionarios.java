package entities;

public class Funcionarios 
{

    private String id;
    private String nome;
    private double salario;

    public Funcionarios (String id, String nome, int salario) 
    {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public String GetId ()
    {
        return id;
    }

    public double GetSalario ()
    {
        return salario;
    }

    public String GetNome ()
    {
        return nome;
    }

    public void SetNome (String NomeAtualizado)
    {
        this.nome = NomeAtualizado;
    }

    public void EfetuarAumento (double aumento)
    {
        salario += salario*(aumento/100);
    }

    public String ToString ()
    {
        return "ID: " 
               + id
               + ", Nome: " 
               + nome
               + ", Salário: " 
               + salario;
    }
}
