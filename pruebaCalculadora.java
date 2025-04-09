public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);
        int resultado = calc.realizarOperacion("suma");
        System.out.println("Resultado de la suma: " + resultado);
    }
}
