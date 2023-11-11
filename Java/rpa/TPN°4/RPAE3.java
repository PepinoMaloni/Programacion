import java.util.Scanner;

public class RPAE3 {
    public static void main (String [] args)
    {
        int Porciones, CubosDeCaldo, TazasDeAgua;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("¿Cuantas porciones desea realizar?");
            //Son los datos que ingresa el usuario
            Porciones = sc.nextInt();
        }
        TazasDeAgua = (Porciones*3)/4;
        CubosDeCaldo = (Porciones*2)/4;
        System.out.print("Nesecita " +  TazasDeAgua );
        System.out.println(" Tazas de agua");
        System.out.print("Nesecita " + CubosDeCaldo);
        System.out.println(" Cubos de caldo");
        System.out.print("Por ultimo hay que agregar todo a una taza de polenta y revolver por 1 min.");


    }
}
