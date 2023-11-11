import java.util.Scanner;

public class RPAE19
{
    public static void main (String []args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            double distanciaEnCm, distanciaEnM;
            System.out.println ("expresar la distancia en Cm");
            distanciaEnCm = sc.nextDouble();
            distanciaEnM = pasajeCmAm(distanciaEnCm);
            System.out.print("El equivalente de "+distanciaEnCm+ " cm a metros es de: "+distanciaEnM+ " metros");

        }
    }
    public static double pasajeCmAm (Double distanciaEnCm)
    {
        double resultEnM;
        resultEnM = (distanciaEnCm * 100);
        return resultEnM;
    }
}
