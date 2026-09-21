import java.util.Scanner;
public class efit
{
public static void main (String[] args){












    Scanner leer = new Scanner(System.in);
    System.out.println("1 Debito 2 Credito 3 Efectivo");
    int opcion = leer.nextInt();
    if(opcion == 1)
    {
        System.out.println("Guarda dinero y traferencia");
        System.out.println("Clonar tarjeta");
        System.out.println("vaciar dinero");
        System.out.println(" Robar identidad");
        System.out.println("No genere historial crediticio");
    }
    else if (opcion == 2){
        System.out.println("Generar historia credito");
        System.out.println("puntos");
        System.out.println("cashback");
        System.out.println("viajes");
    } else if (opcion ==3){
        System.out.println("no tienes nada");
    }
}


}
