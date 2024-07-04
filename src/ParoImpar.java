import java.util.Scanner;

public class ParoImpar {
    public static void main(String[] args) {
        Scanner impar = new Scanner(System.in);
        int Numero = 21;
        String resultado = Numero % 2 == 0 ? " es un numero par" : " es un numero impar";
        System.out.println(Numero+""+resultado);

    }
}