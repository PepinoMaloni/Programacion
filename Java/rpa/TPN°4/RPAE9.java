import java.util.Scanner;

public class RPAE9{
     public static void main(String [] args)
     {
        int horas, minutos, segundos;
        try(Scanner sc = new Scanner (System.in))
        {

        System.out.println("Colocar segundos: ");
            segundos = sc.nextInt();

            horas = segundos/3600;
            
            minutos = (segundos%3600)/60;

            segundos = (segundos%60);
            
            
            


            

            System.out.print("Su equivalencia es de: ");
            System.out.print(+horas);
            System.out.print(" horas ");
            System.out.print(+minutos);
            System.out.print(" minutos ");
            System.out.print(+segundos);
            System.out.print(" Segundos ");

        }

     }

}