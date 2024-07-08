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

        System.out.printf("Insira os lados dos triângulos");
        System.out.printf("Triângulo B: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        calculaMaiorArea(x, y);

        sc.close();
    }

    public static void calculaMaiorArea (Triangle x, Triangle y)
    {
        double px = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt((px)*(px - x.a) * (px - x.b) * (px - x.c));

        double py = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt((py)*(py - y.a) * (py - y.b) * (py - y.c));
        
        System.out.printf("Triangulo X: %f%n", areaX);
        System.out.printf("Triangulo Y: %f%n", areaY);
    }
}