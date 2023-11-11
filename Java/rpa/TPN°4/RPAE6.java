
import java.util.Scanner;

public class RPAE6 {
    public static void main (String [] args){

        try (Scanner sc = new Scanner(System.in)){
        double puntoAx, puntoAy, puntoBx, puntoBy, distanciaAB;

        System.out.println("Ingrese los valores del punto A");
        System.out.print("en X: ");
        puntoAx = sc.nextDouble();
        System.out.print("En y: ");
        puntoAy = sc.nextDouble();

        System.out.println("Ingrese los valores del punto B");
        System.out.print("En X: ");
        puntoBx = sc.nextDouble();
        System.out.print("En y: ");
        puntoBy = sc.nextDouble();
        
        distanciaAB = Math.sqrt(Math.pow(puntoAx - puntoBx, 2)) + Math.pow(puntoAy - puntoBy, 2);

        System.out.print("La distancia de los puntos A y B es de: "+ distanciaAB);


        }






    }




}
