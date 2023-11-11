import java.util.Scanner;

public class RPAE5 {
    public static void main(String [] args){
        
        

        try (Scanner sc = new Scanner(System.in)) {
            double tazaGrande, tazaPequena, cucharaPequena, cucharaGrande, grAzucar;

            System.out.println("Cuantos gramos de azucar tiene?");
            grAzucar = sc.nextDouble();

            tazaGrande = grAzucar/120;
            tazaPequena = grAzucar/70;
            cucharaGrande = grAzucar/18;
            cucharaPequena = grAzucar/7;

            System.out.print("Su equivalente en tazas grandes es de: "+ tazaGrande);
        
            System.out.println(" Unidades");
            System.out.print("Su equivalente en tazas pequeñas es de: " + tazaPequena);
            System.out.println(" Unidades");
            System.out.print("Su equivalente en cucharas grandes es de: "+cucharaGrande);
            System.out.println(" Unidades");
            System.out.print("Su en cucharadas pequeñas es de: " +cucharaPequena);
            System.out.println(" Unidades");
            }
        }
        

        
        
    }




