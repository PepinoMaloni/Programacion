import java.util.Scanner;


public class Projecto1

{
    public static void main (String[]args)
    {
        try (Scanner sc = new Scanner (System.in))
        {
            String operacion;
            int numeroBinario, numeroDecimal;
            System.out.println ("¿Que operacion desea hacer?");
            operacion = sc.nextLine();

            switch (operacion)
            {
                case "decimal a binario":
                System.out.println("¿Que numero decimal tenes?");
                numeroDecimal = sc.nextInt();
                break;


            }
        }
       

    

    }
    public static int decimalABinario (int numeroDecimal)
    {
       int numeroDecimalABinario;
       numeroDecimalABinario = numeroDecimal %2;
       return numeroDecimalABinario;

    }
}
