public class Main {
    public static void main(String[] args) {
        CalculadoraBasica calculadora = new CalculadoraBasica();

        int resultadoSuma = CalculadoraBasica.sumar(5, 4);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        int resultadoResta = calculadora.restar(3, 1);
        System.out.println("El resultado de la resta es:" + resultadoResta);

        int resultadoMultiplicacion = calculadora.multiplicar(10, 2);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(10, 0);
        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
}
