import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    // Ejercicio 1: Función para calcular el área de un rectángulo.
    //Este método publico significa que puede ser accedido desde cualquier parte pero no va a estar devolviendo datos
    public static double calcularAreaRectangulo(double longitud, double ancho) {
        return longitud * ancho;
    }

    // Ejercicio 2: Función para verificar si un número es positivo, negativo o cero.
    public static String verificarSigno(int numero) {
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }

    // Ejercicio 3: Función para calcular la potencia de un número.
    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1.0;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // Ejercicio 4: Función para obtener el máximo de tres números enteros.
    public static int obtenerMaximo(int a, int b, int c) {
        int maximo = a;
        if (b > maximo) {
            maximo = b;
        }
        if (c > maximo) {
            maximo = c;
        }
        return maximo;
    }

    // Ejercicio 5: Función para calcular el factorial de un número.
    public static int calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    //Función para calcular el área de un círculo.
    public static double calcularAreaCirculo(double radio) {
        // Fórmula del área del círculo: π * radio^2
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        // Ejemplos de uso de las funciones
        double area = calcularAreaRectangulo(5.0, 3.0);
        System.out.println("El área del rectángulo es: " + area);

        int numero = -7;
        String resultadoSigno = verificarSigno(numero);
        System.out.println("El número " + numero + " es " + resultadoSigno);

        double base = 2.0;
        int exponente = 3;
        double potencia = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + potencia);

        int maximo = obtenerMaximo(10, 7, 15);
        System.out.println("El máximo de los tres números es: " + maximo);

        // Llamada a la función calcularAreaCirculo
        double resultado = calcularAreaCirculo(5.0);
        // Impresión del resultado
        System.out.println("El área del círculo es: " + resultado);
    }
}

