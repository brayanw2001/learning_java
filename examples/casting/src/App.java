public class App {
    public static void main(String[] args) {
        
        int a = 5, b = 2;
        double resultado;
        double resultadoCasting;

        resultado = a/b;
        resultadoCasting = (double) a/b;

        System.out.println(resultado);
        System.out.println(resultadoCasting);
    }
}
