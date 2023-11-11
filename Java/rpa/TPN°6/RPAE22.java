import java.util.Scanner;

public class RPAE22
{
    public static void main (String []args)
    {
        try (Scanner sc = new Scanner (System.in))
        {
            int añoVehiculoUno, añoVehiculoDos;

            System.out.println ("Ingresar el año de antiguedad del vehiculo 1");
            añoVehiculoUno = sc.nextInt();
            System.out.println ("Ingresar el año de antiguedad del vehiculo 2");
            añoVehiculoDos = sc.nextInt();
            verificadorAntiguedad(añoVehiculoUno, añoVehiculoDos);
        }
    }
   public static void verificadorAntiguedad (int añoVehiculoUno,int añoVehiculoDos)
   {
    if (añoVehiculoUno < 1886 || añoVehiculoDos < 1886)
    {
        System.out.print("No existian esos modelos en esa epoca");
    }
    else 
    {
        verificadorAntiguedad2(añoVehiculoDos, añoVehiculoUno);
    }
   }
   
   public static void verificadorAntiguedad2 (int añoVehiculoDos, int añoVehiculoUno)
   {
    if (añoVehiculoUno > 2023 || añoVehiculoDos > 2023)
    {
        System.out.print("Solo se admiten modelos menores a 2023");
    }
    else 
    {
        comparadorAntiguedad(añoVehiculoUno, añoVehiculoDos);
    }
   }

   public static void comparadorAntiguedad (int añoVehiculoUno, int añoVehiculoDos)
   {
    if (añoVehiculoUno < añoVehiculoDos)
    {
        System.out.print("El vehiculo 2 es mas antiguo");
    }
    else 
    {
        comparadorAntiguedad2(añoVehiculoUno, añoVehiculoDos);
    }
   }

   public static void comparadorantiguedad3 (int añoVehiculoUno, int añoVehiculoDos)
   {
    if (añoVehiculoUno > añoVehiculoDos)
    {
        System.out.print("El vehiculo 1 es mas antiguo");
    }
    else
    {
        comparadorAntiguedad2(añoVehiculoUno, añoVehiculoDos);
    }
   }

   public static void comparadorAntiguedad2 (int añoVehiculoUno, int añoVehiculoDos)
   {
    if (añoVehiculoUno == añoVehiculoDos && añoVehiculoDos == añoVehiculoUno)
    {
        System.out.print("Los dos vehiculos tienen el mismo año de modelos");
    }
    else 
    {
        comparadorAntiguedad(añoVehiculoUno, añoVehiculoDos);
    }
   }

}
