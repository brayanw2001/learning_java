package entities;

import java.util.Scanner;

public class Estudante {

    Scanner sc = new Scanner (System.in);

    public String nome;
    public float [] notas = new float [3];
    public float mediaFinal = 0;

    public void NotaFinal ()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("Nota %d: ", i+1);
            notas[i] = sc.nextFloat();

             this.mediaFinal += notas[i];
        }
    } 

    public void VerificaAprovacao ()
    {
        mediaFinal /= 3;

        if (mediaFinal >= 6)
            System.out.println("Aprovado");
        else 
        {
            System.err.println("reprovado");
            mediaFinal = 6 - mediaFinal;
            System.out.printf("Faltaram %.2f pontos", mediaFinal);
        }
    }
}
