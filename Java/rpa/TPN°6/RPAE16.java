import java.text.DecimalFormat;
import java.util.Scanner;

public class RPAE16
{
    public static void main (String []args)
    {
        try (Scanner sc = new Scanner (System.in))
        {
            double ladoA, ladoB, resultpotenciaLadoA, resultpotenciaLadoB, resultadoSuma, resultFinalHipotenusa;

            System.out.println ("Escribir el valor del lado A");
            ladoA = sc.nextDouble();
            System.out.println ("Escribir el valor del lado B");
            ladoB = sc.nextDouble();
            resultadoP resultadosPotencia = calcPotencia(ladoA, ladoB);
            resultpotenciaLadoA = resultadosPotencia.potenciaLadoA;
            resultpotenciaLadoB = resultadosPotencia.potenciaLadoB;
            resultadoSuma = sumaPotencias(resultpotenciaLadoA, resultpotenciaLadoB);
            resultFinalHipotenusa = raizSuma(resultadoSuma);
            DecimalFormat df = new DecimalFormat("#,##");
            df.setMaximumFractionDigits(2);
            System.out.print ("El valor de la hipotenusa es de: "+df.format (resultFinalHipotenusa)+" metros");





        }
    }
        public static resultadoP calcPotencia (double ladoA, double ladoB)
        {
            double potenciaLadoA;
            double potenciaLadoB;
            potenciaLadoA = Math.pow(ladoA, 2);
            potenciaLadoB = Math.pow(ladoB, 2);
            resultadoP resultadosPotencia = new resultadoP(potenciaLadoA, potenciaLadoB);
            
            return resultadosPotencia;
        }
        public static class resultadoP
        {
            public double potenciaLadoA;
            public double potenciaLadoB;
        
        public resultadoP(double potenciaLadoA, double potenciaLadoB)
        {

            this.potenciaLadoA = potenciaLadoA;
            this.potenciaLadoB = potenciaLadoB;

        }
        }
        public static double sumaPotencias (double resultpotenciaLadoA, double resultpotenciaLadoB)
        {
            double resultSuma;
            resultSuma = resultpotenciaLadoA + resultpotenciaLadoB;
            return resultSuma;
        }
        public static double raizSuma (double resultadoSuma)
        {
            double resulRaiz;
            resulRaiz = Math.sqrt(resultadoSuma);
            return resulRaiz;

        }

        
}
