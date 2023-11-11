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
                decimalABinario(numeroDecimal);
                break;


            }
        }
       

    

    }
    public static String decimalABinario(int numeroDecimal) {
        StringBuilder binario = new StringBuilder();
    
        while (numeroDecimal > 0) {
            int residuo = numeroDecimal % 2;
            binario.insert(0, residuo);
            numeroDecimal = numeroDecimal / 2;
            
        }
    
        return binario.toString();
    }
}
