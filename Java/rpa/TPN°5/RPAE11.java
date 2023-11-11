import java.util.Scanner;

public class RPAE11 {
    public static void main (String[] args){
    try (Scanner sc = new Scanner(System.in)){
        int votosPositivos, votosNegativos, votosAbstinencia;
         

        System.out.println("Cuantos votos positivos hubo?");
        votosPositivos = sc.nextInt();
        System.out.println("Cuantos votos negativos hubo?");
        votosNegativos = sc.nextInt();
        System.out.println("Cuantas personas se abstuvieron a los  votos?");
        votosAbstinencia = sc.nextInt();
        
        
        boolean votoAprobado = votosPositivos > votosNegativos && votosPositivos > votosAbstinencia;
        boolean votoDesaprobado = votosNegativos > votosPositivos && votosNegativos > votosAbstinencia;
        boolean votoSinDefinir = votosAbstinencia > votosPositivos && votosAbstinencia > votosNegativos || votosPositivos == votosNegativos || votosAbstinencia == votosPositivos || votosAbstinencia == votosNegativos;

        if (votoAprobado){
            System.out.println("La ordenanza fue aprobada.");
        }

        if (votoDesaprobado){
            System.out.println("La ordenanza fue rechazada.");
        }

        if (votoSinDefinir){
            System.out.println("La votacion no fue definida");
        }






    }



    }

}
