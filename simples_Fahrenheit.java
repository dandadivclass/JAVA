public class Main {
    public static void main(String[] args) {
        System.out.println("CONVERSÃO DE FAHRENHEIT");
        System.out.println("Hoje está 34 graus Celsius");

        int temperatura = 35;
        double conversao = (temperatura * 1.8) + 32;
        System.out.println(String.format("Então, se eu estivesse na Inglaterra, estaria %s Fahrenheits!", conversao));
    }
}
