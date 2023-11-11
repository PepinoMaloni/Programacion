import java.util.Scanner;

public class RPAE10{

    public static void main (String[]args){
        try(Scanner sc = new Scanner(System.in)){
            double mCuadrado, mCubico, largo, ancho, alto, frigoria;
            System.out.println("Cual es el largo?");
            largo = sc.nextDouble();
            System.out.println("Cual es el alto?");
            alto = sc.nextDouble();
            System.out.println("Cual es el ancho lateral?");
            ancho = sc.nextDouble();


            mCuadrado = largo*alto;
            mCubico = mCuadrado*ancho;
            frigoria = mCubico*50;

            System.out.println("Su espacio es de: "+mCuadrado+" Metros cuadrados");

            System.out.println("Su espacio en metros cubicos es de: "+mCubico+ " Metros cubicos");

            System.out.println("Haciendo todos los calculos del espacio tenemos que se requiere un aire acondicionado de: "+frigoria+" Frigorias");
            



        }



    }


}
