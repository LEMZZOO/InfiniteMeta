public class CalculadoraBasica {
    public static void main(String[] args) {

    }

    public static int sumar(int num1, int num2){
        int resultado = num1 +  num2;
        return resultado;
    }

    public static int restar(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }

    public static double dividir(double num1, double num2){
        double resultado = 0;
        if (num2 >= 1) {
            resultado = num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero");
        }
        return resultado;
    }


}
