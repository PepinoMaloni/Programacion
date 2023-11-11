import java.util.Scanner;

public class RPAE7 {
    public static void main (String[] args){
        

        try (Scanner sc = new Scanner(System.in)){
         int primerDigito, segundoDigito, tercerDigito, cuartoDigito, numeroCompleto;
        
         System.out.print("Numero sorteado: ");
         numeroCompleto = sc.nextInt();

         primerDigito = numeroCompleto %10;
         segundoDigito = numeroCompleto %100;
         tercerDigito = numeroCompleto %1000;
         cuartoDigito = numeroCompleto %10000;

         System.out.println("el numero en 1 digito es: "+ primerDigito);
         System.out.println("El numero en 2 digitos es: "+ segundoDigito);
         System.out.println("El numero en 3 digitos es: "+tercerDigito);
         System.out.println("El numero en 4 digitos es: "+cuartoDigito);
        
        }






    }




}
