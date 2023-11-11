import java.util.Scanner;

public class RPAE20 
{
    public static void main (String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            double numeroA, numeroB;
            System.out.println("Ingrese el valor del numero a");
            numeroA = sc.nextDouble();
            System.out.println ("Ingresar el valor del numero b");
            numeroB = sc.nextDouble();
            valorNumerico(numeroA, numeroB);
        }
    }
    public static void valorNumerico (double numeroA, double numeroB)
    {
        if (numeroA > numeroB)
        {
        System.out.println("El numero A es mas grande");
        }
        else 
        {
            System.out.println ("El numero B es mas grande");
        }
         

    }

}