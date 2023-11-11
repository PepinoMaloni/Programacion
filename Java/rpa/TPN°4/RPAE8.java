import java.util.Scanner;

public class RPAE8{
    public static void main(String[] args){
        int a, b, c;

    try (Scanner sc = new Scanner(System.in)){

    System.out.println("Colocar el numero a");
    a = sc.nextInt();
    System.out.println("Colocar numero b");
    b = sc.nextInt();
    System.out.println("Colocar el numero c: ");
    c = sc.nextInt();

    a = a + b + c;
    b = a - b - c;
    c = a - b - c;
    a = a - b - c;
    

    
    

    
    
    

    System.out.println("El valor de a es: " + a);
    System.out.println("El valor de b es: "+ b);
    System.out.println("El valor de c es: "+ c);

    }



    }


}