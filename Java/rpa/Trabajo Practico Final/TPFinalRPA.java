
import java.util.Scanner;

public class TPFinalRPA
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        {
            String nombreJugadorUno, nombreJugadorDos;
            System.out.println ("Ingrese el nombre del jugador 1");
            nombreJugadorUno = sc.nextLine();
            System.out.println ("Ingrese el nombre del jugador 2");
            nombreJugadorDos = sc.nextLine();
            asignacionDePuntosYColores(nombreJugadorUno, nombreJugadorDos);
            
        }
        
    }
    
    public static int generadorDePuntos()
    {
        int puntosJugador;
        puntosJugador = Aleatorio.intAleatorio(0,10);
        return puntosJugador;
    }

    public static String repartidorDeColor()
    {
        int colorAplicado;
        colorAplicado = (int) (Math.random() * 2);
        
        if (colorAplicado == 0)
        {
            return "Rojo";
        } 
        else 
        {
            return "Azul";
        }
    }
   
    public static void asignacionDePuntosYColores(String nombreJugadorUno,String nombreJugadorDos)
    {
        String primeraBolaJugadorUno, primeraBolaJugadorDos, segundaBolaJugadorUno, segundaBolaJugadorDos;
        primeraBolaJugadorUno = repartidorDeColor();
        segundaBolaJugadorUno = repartidorDeColor();
        primeraBolaJugadorDos = repartidorDeColor();
        segundaBolaJugadorDos = repartidorDeColor();
        int puntajePrimeraBolaJugadorUno, puntajeSegundaBolaJugadorUno, puntajePrimeraBolaJugadorDos, puntajeSegundaBolaJugadorDos;
        puntajePrimeraBolaJugadorUno = generadorDePuntos();
        puntajeSegundaBolaJugadorUno = generadorDePuntos();
        puntajePrimeraBolaJugadorDos = generadorDePuntos();
        puntajeSegundaBolaJugadorDos = generadorDePuntos();

        System.out.println(nombreJugadorUno+ " obtuvo su primera bola de color "+primeraBolaJugadorUno+ " con un puntaje de "+puntajePrimeraBolaJugadorUno+ " su segunda bola fue de color "+ segundaBolaJugadorUno + " con un puntaje de "+puntajeSegundaBolaJugadorUno);
        System.out.println (nombreJugadorDos+" obtuvo su primera bola de color "+primeraBolaJugadorDos+" con un puntaje de "+puntajePrimeraBolaJugadorDos+ " su segunda bola fue de color "+segundaBolaJugadorDos+ " con un puntaje de "+puntajeSegundaBolaJugadorDos);
        resultadoDePartida(nombreJugadorUno, nombreJugadorDos, primeraBolaJugadorUno, segundaBolaJugadorUno, primeraBolaJugadorDos, segundaBolaJugadorDos, puntajePrimeraBolaJugadorUno, puntajeSegundaBolaJugadorUno, puntajePrimeraBolaJugadorDos, puntajeSegundaBolaJugadorDos);
    }   

    public static void resultadoDePartida(String nombreJugadorUno, String nombreJugadorDos, String primeraBolaJugadorUno, String segundaBolaJugadorUno, String primeraBolaJugadorDos, String segundaBolaJugadorDos, int puntajePrimeraBolaJugadorUno, int puntajeSegundaBolaJugadorUno, int puntajePrimeraBolaJugadorDos, int puntajeSegundaBolaJugadorDos)
    {
        int SumaDePuntosJugadorUno, sumaDePuntosJugadorDos;

        if (primeraBolaJugadorUno == segundaBolaJugadorUno)
        {
            
            if (puntajePrimeraBolaJugadorUno == puntajeSegundaBolaJugadorUno)
            {
                SumaDePuntosJugadorUno = (puntajePrimeraBolaJugadorUno + puntajeSegundaBolaJugadorUno)*2;
                System.out.println(nombreJugadorUno+" saco dos bolas del mismo puntaje por lo que ¡¡Hizo el doble de puntos!! ahora su puntaje es de "+SumaDePuntosJugadorUno+" puntos ");
            }
            else
            {
                SumaDePuntosJugadorUno = puntajePrimeraBolaJugadorUno + puntajeSegundaBolaJugadorUno;
                System.out.println(nombreJugadorUno+" hizo un puntaje de "+SumaDePuntosJugadorUno+ " puntos");
            }
            
        }
        
        else 
        {
            SumaDePuntosJugadorUno = 0;
            System.out.println(nombreJugadorUno+" no hizo ningun punto");
            
        }
        if (primeraBolaJugadorDos == segundaBolaJugadorDos)
        {
            if (puntajePrimeraBolaJugadorDos == puntajeSegundaBolaJugadorDos)
            {
                sumaDePuntosJugadorDos = (puntajePrimeraBolaJugadorDos + puntajeSegundaBolaJugadorDos)*2;
                System.out.println(nombreJugadorDos+" saco dos bolas del mismo puntaje por lo que ¡¡Hizo el doble de puntos!! ahora su puntaje es de "+sumaDePuntosJugadorDos+" puntos ");

            }
            else
            {
                sumaDePuntosJugadorDos = puntajePrimeraBolaJugadorDos + puntajeSegundaBolaJugadorDos;
                System.out.println(nombreJugadorDos+" hizo un puntaje de "+sumaDePuntosJugadorDos+ " puntos");
            }
            
        }

        else 
        {
            sumaDePuntosJugadorDos = 0;
            System.out.println(nombreJugadorDos+" no hizo ningun punto");
           
        } 
        desiciionDeGanador(SumaDePuntosJugadorUno, sumaDePuntosJugadorDos, nombreJugadorUno, nombreJugadorDos);
    }

    public static void desiciionDeGanador(int SumaDePuntosJugadorUno, int sumaDePuntosJugadorDos, String nombreJugadorUno, String nombreJugadorDos)
    {
        if ( SumaDePuntosJugadorUno == sumaDePuntosJugadorDos)
        {
            System.out.println("Hubo un empate");
        }
        else 
        {
            if (SumaDePuntosJugadorUno > sumaDePuntosJugadorDos)
            {
                System.out.println(nombreJugadorUno+" gana la partida");
            }
            else 
            {
                System.out.println(nombreJugadorDos+" gana la partida");
            }
        }
    }
}
