public class Calculadora {
    private int num1, num2;

    public Calculadora(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public int realizarOperacion(String operacion) {
        if (operacion.equals("suma")) return suma();
        if (operacion.equals("dividir")) return dividir();
        return 0;
    }

    public int suma() {
        return num1 + num2;
    }

    public int dividir() {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }
    
}
