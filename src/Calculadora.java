import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione una operacion ( +, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = (operacion == '+') ? (num1 + num2) :
                (operacion == '-') ? (num1 - num2) :
                        (operacion == '*') ? (num1 * num2) :
                                (operacion == '/') ? (num1 / num2) :
                                        Double.NaN;  //aparece NaN si la operacion no es valida

        if (Double.isNaN(resultado)) {
            System.out.println("Operación no valida.");
        } else {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();

    }
}