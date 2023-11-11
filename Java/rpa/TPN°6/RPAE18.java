import java.util.Scanner;

public class RPAE18
{
public static void main (String[]args)
{
    try (Scanner sc = new Scanner(System.in))
    {
        double radio, perimetro;
        System.out.println("¿De cuanto es el radio?");
        radio = sc.nextDouble();
        perimetro = calcPerimetro(radio);
        System.out.print("El perimetro del area circular tomando en cuenta el radio es de: "+perimetro);


    }
}
public static Double calcPerimetro (double radio)
{
    double resulPerimetro;
    double pi;
    pi = Math.PI;
    resulPerimetro = 2*pi*radio;
    return resulPerimetro;
}


}