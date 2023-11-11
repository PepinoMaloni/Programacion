import java.util.Scanner;

public class RPAE12{
public static void main(String[] args){
try(Scanner sc = new Scanner(System.in)){
    double precioProductoUno, precioProductoDos, cantidadProductoUno, cantidadProductoDos, precioTotalproductoUno, precioTotalProductoDos;

    System.out.println("Cuanto sale el producto 1?");
    precioProductoUno =sc.nextDouble();
    System.out.println("Cuantas cantidades desea comprar?");
    cantidadProductoUno = sc.nextDouble();
    System.out.println("Cuanto sale el producto 2?");
    precioProductoDos = sc.nextDouble();
    System.out.println("Cuantas cantidades desea comprar?");
    cantidadProductoDos = sc.nextDouble();

    precioTotalproductoUno = cantidadProductoUno * precioProductoUno;
    precioTotalProductoDos = cantidadProductoDos * precioProductoDos;


    boolean PreferenciaProductoUno = precioTotalproductoUno < precioTotalProductoDos;
    boolean preferenciaproductoDos = precioTotalProductoDos < precioProductoUno;

    if (PreferenciaProductoUno){
        System.out.println ("Te conviene comprar el producto 1");

    }

    if (preferenciaproductoDos){
        System.out.println("Te conviene comprar el producto 2");

    }


     








}



}

}