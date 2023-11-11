import java.util.Scanner;

public class RPAE21 
{
    public static void main (String []args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            int dniSospechoso;
            System.out.println("Ingrse el dni del sospechoso. El dni debe contener 8 digitos como minimo");
            dniSospechoso = sc.nextInt();
            IdentificadorSospechoso(dniSospechoso);

        }      
    }
    public static void IdentificadorSospechoso(int dniSospechoso)
    {
        if (dniSospechoso == 28361924)
        {
            System.out.println ("Sospechoso identificado");
        }
        else 
        {
            identificadorDeDNI(dniSospechoso);
        }
    }

    public static void identificadorDeDNI (int dniSospechoso)
    {
        if (dniSospechoso < 01000000 || dniSospechoso > 99999999)
        {
            System.out.println("D.N.I INVALIDO");
        }
        else 
        {
            System.out.println("Este D.N.I no tiene antecedentes penales internacionales");
        }
    }
    
}

