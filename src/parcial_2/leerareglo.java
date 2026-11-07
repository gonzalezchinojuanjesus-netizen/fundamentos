package parcial_2;

import java.util.Scanner;

public class leerareglo
{
    static void main(String[] args)
    {
        String [] canciones = {"The mosteer","Lose Yourself","Me muero","Can'Hold Us"};
        leerArregos(canciones);

    }
    static void leerArregos(String[] canciones)
    {
        for (int i = 0; i< canciones.length; i++)
        {
            System.out.println(canciones[i]);
        }
    }
}
