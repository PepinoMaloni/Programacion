import java.util.Scanner;

public class RPAE4 {
    public static void main (String [] args){

        int tazas,cantGotas;

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Cuantas tazas nesecita?");

            tazas = sc.nextInt();
        }

        cantGotas = tazas*8;

        System.out.print("Para preparar " + tazas );
        System.out.println(" Tazas");
        System.out.print("se nesecita " + cantGotas);
        System.out.println(" gotas de educorante");



    }

    
}
