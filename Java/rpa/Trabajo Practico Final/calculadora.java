import java.util.Scanner;

public class calculadora {
    
    public static void main (String[]argas)
    {
        try (Scanner sc = new Scanner(System.in))
        {
           int numero, resultado, numeroPrimo;
            System.out.println("insertar numero");
            numero = sc.nextInt();
            System.out.println("Insertar el primo divisor");
            numeroPrimo = sc.nextInt();
            resultado = numero % numeroPrimo;
            System.out.println("El resto es de "+resultado);
        }
    }
}
