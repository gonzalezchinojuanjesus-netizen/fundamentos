package Parcial3;

import java.util.Scanner;

public class pruebaconexion {
    public static boolean sinConexion(int estado) {
        return  estado == 0;
    }
        static void main (String[] args) {
            Scanner entrada = new  Scanner(System.in);

            int estado =0;
            int opcion;
            int nuevoEstado;

            do{
                System.out.println("1. Probar conexion");
                System.out.println("2. Ver estado");
                System.out.println("3. Cancelar");
                System.out.println("Elegir opcion: ");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo estado (0= Desconectado, 1 = Conectado");
                        nuevoEstado = entrada.nextInt();
                        if (nuevoEstado == 0 || nuevoEstado == 1) {
                            estado = nuevoEstado;
                            System.out.println("Estado Actualizado");
                        } else {

                            System.out.println("Estado no valido");
                        }
                        break;
                    case 2:
                        if (estado == 0) {
                            System.out.println("Estado actual: Desconectado");
                        } else {
                            System.out.println("Estado actual: Conectado");
                        }
                        continue;
                    case 3:
                        System.out.println("Prieba cancelada");
                        break;
                    default:
                        System.out.println("Opcion no valida ");
                        break;
                }


            } while (opcion != 3 && sinConexion(estado));
                 if (estado ==1) {
                     System.out.println("Servidor conectado");
                 }
        }

}