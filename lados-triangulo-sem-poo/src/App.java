import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("--- Área de um Triangulo ---");

        double [] ladosTrianguloA = new double [3];
        double [] ladosTrianguloB = new double [3];

        
        lados (ladosTrianguloA, ladosTrianguloB);
        AreaMaior (ladosTrianguloA, ladosTrianguloB);
    }

    public static void lados (double [] ladosTrianguloA, double [] ladosTrianguloB) 
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("[Triangulo A]Insira %d: ", i);
            ladosTrianguloA[i] = sc.nextDouble();
        }

        System.out.printf("%n");

        for (int j = 0; j < 3; j++)
        {
            System.out.printf("[Triangulo A]Insira %d: ", j);
            ladosTrianguloB[j] = sc.nextDouble();
        }

        sc.close();
    }

    public static void AreaMaior (double [] ladosTrianguloA, double [] ladosTrianguloB)
    {
        double p1 = 0;
        double p2 = 0;

        for (int i = 0; i < 3; i++)
        {
            p1 += ladosTrianguloA[i];
        }
    
        for (int j = 0; j < 3; j++)
        {
            p2 += ladosTrianguloB[j];
        }

        p1 = p1/2;
        p2 = p2/2;

        double areaTrianguloA = Math.sqrt(p1*(p1-ladosTrianguloA[0])*(p1-ladosTrianguloA[1])*(p1-ladosTrianguloA[2]));
        double areaTrianguloB = Math.sqrt(p2*(p2-ladosTrianguloB[0])*(p2-ladosTrianguloB[1])*(p2-ladosTrianguloB[2]));

        if (areaTrianguloB > areaTrianguloA)
        {
            System.out.println("Area B maior!");
            System.out.printf("Area A: %f %nArea B: %f", areaTrianguloA, areaTrianguloB);
        }
        else
        {
            System.out.println("Area A maior!");
            System.out.printf("Area A: %f %nArea B: %f", areaTrianguloA, areaTrianguloB);
        }
    }
}