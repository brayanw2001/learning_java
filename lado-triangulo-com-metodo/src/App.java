import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x  = new Triangle();
        y = new Triangle();

        System.out.printf("Insira os lados dos triângulos%n");
        System.out.printf("Triângulo A: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Triângulo B: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        if (areaX > areaY)
        {
            System.out.printf("Area X é maior e mede %f", areaX);
        }
        else
        {
            System.out.printf("Area Y é maior e mede %f", areaY);
        }

        sc.close();
    }

}