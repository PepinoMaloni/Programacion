import java.util.Scanner;

public class RPAE15
{
public static void main (String []args)
{
try(Scanner sc = new Scanner (System.in))
{
double altura, base, profundidad, volumPrisma;
System.out.println("Escribir la medida de la base");
base = sc.nextDouble();
System.out.println("Escribir la medida de la altura");
altura = sc.nextDouble();
System.out.println("Escribir la medida de la profundidad");
profundidad = sc.nextDouble();
volumPrisma = calculoVolumen(base, altura, profundidad);
System.out.println("El volumen del prisma es de: "+volumPrisma+ "m3");
}
}
public static double calculoVolumen (double base, Double altura, Double profundidad)
{
double volumenPrisma;
volumenPrisma = base * altura* profundidad;
return volumenPrisma;

}
}
