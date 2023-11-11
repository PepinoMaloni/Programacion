import java.util.Scanner;

public class RPAE14{
    


    
    public static void main (String[] args)
    {
        try (Scanner sc = new Scanner(System.in)){
            double velocidadKMh, tiempoHoras, tiempoEnsegundos, velocidadEnMs, distanciaEnkm, distanciaEnM;
            
            System.out.println("Ingrese la velocidad recorrida en Km/h");
            velocidadKMh = sc.nextDouble();
            System.out.println("Ingrese el tiempo en horas");
            tiempoHoras = sc.nextDouble();
            tiempoEnsegundos = pasajeHorasASegundos(tiempoHoras);
            velocidadEnMs = kmHaMS(velocidadKMh);
            distanciaEnM = calculoDistancia(tiempoEnsegundos, velocidadEnMs);
            distanciaEnkm = pasajeKmAm(distanciaEnM);
            System.out.print("La distancia recorrida uniformemente sera de "+distanciaEnkm+ " Kilometros");



        }





    }
    //Modulo 1 pasaje km/h a M/s
    public static double pasajeHorasASegundos (double tiempoHoras)
    {
        double tiempoSegundos;
        tiempoSegundos = tiempoHoras*3600;
        return tiempoSegundos;
    }
    //Modulo 2 pasaje Km a m
    public static double kmHaMS (double velocidadKMh)
    {
        double velocidadMS;
        velocidadMS = velocidadKMh / 3.6;
        return velocidadMS;
    }
    //Modulo 3 calculo de distancia basado en los pasajes de Km a M y de Km/h a M/s
    public static double calculoDistancia (double tiempoEnsegundos, double velocidadEnMs)
    {
    double distanciaRecorrida;
    distanciaRecorrida = velocidadEnMs* tiempoEnsegundos;
    return distanciaRecorrida;
    }
    public static double pasajeKmAm (double distanciaEnM)
    {
        double distanciaEnKilometros;
        distanciaEnKilometros = distanciaEnM/1000;
        return distanciaEnKilometros;

    }


}

