import java.util.Scanner;

public class RPAE17
{
    public static void main (String [] args)
    {
        try (Scanner sc = new Scanner (System.in))
        {
            int horas, minutos, segundos, resulPasajeHoraASeg, resulPasajeMinutosASegundos, sumaTotalSegundos;
            System.out.println("Cuantas horas son?");
            horas = sc.nextInt();
            System.out.println("Cuantos minutos son?");
            minutos = sc.nextInt();
            System.out.println("Cuantos segundos son?");
            segundos = sc.nextInt();
            resulPasajeHoraASeg = pasajeHorasSegundos(horas);
            resulPasajeMinutosASegundos = pasajeminutosASegundos(minutos);
            sumaTotalSegundos = sumaDeSegundos(resulPasajeHoraASeg, resulPasajeMinutosASegundos, segundos);
            System.out.print ("Los segundos  totales que representa"+horas+ " Horas "+ minutos+ " minutos "+segundos+ " Segundos es de "+sumaTotalSegundos+ " segundos");

        }
    }
    public static int pasajeHorasSegundos (int horas)
    {
        int horasASegundo;
        horasASegundo = (horas * 3600);
        return horasASegundo;
    }
    public static int pasajeminutosASegundos (int minutos)
    {
        int minutosASegundos;
        minutosASegundos = (minutos * 60);
        return minutosASegundos;
    }
    public static int sumaDeSegundos (int resulPasajeHoraASeg,int resulPasajeMinutosASegundos, int segundos)
    {
        int sumaSeg;
        sumaSeg = resulPasajeHoraASeg + resulPasajeMinutosASegundos + segundos;
        return sumaSeg;
    }
}
