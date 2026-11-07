package parcial_2;

import java.util.Scanner;

public class ysisi {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int respuesta;

        do{
           System.out.println("¿Quieres ser mi novia?");
           System.out.println("1. Si 2. No");
           respuesta = entrada.nextInt();
           if (respuesta == 2) {
               System.out.println("Error 404: No se acepta un NO por respuesta");
           }
        }while (respuesta !=1);
        System.out.println("Comit del amor aprobado <3");
        entrada.close();
    }
}
