import java.util.Scanner;

public class RPAE13{

    public static void main (String [] args){
        try (Scanner sc = new Scanner(System.in)){

            double precioArticulo, precioTotal;
            int descuentoAplicado;

            System.out.println("Ingrese el precio del articulo:");
            precioArticulo = sc.nextDouble();
            System.out.println("Ingrese el descuento aplicado al articulo");
            descuentoAplicado = sc.nextInt();
            precioTotal = calculoDescuento(precioArticulo, descuentoAplicado);
            System.out.print("El precio total del articulo con el "+descuentoAplicado+ "% de descuento es de:" +precioTotal+ "$");
            



        }
        


    }
    public static double calculoDescuento (double precioArticulo, int descuentoAplicado)
        {
            double precioDescuento, precioFinal;
            precioDescuento = (precioArticulo*descuentoAplicado)/100;
            precioFinal = precioArticulo -precioDescuento;
            return precioFinal;
    

        }




}

