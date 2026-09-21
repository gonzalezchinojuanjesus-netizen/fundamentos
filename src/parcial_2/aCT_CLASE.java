package parcial_2;

import java.util.Scanner;

public class aCT_CLASE {
    public static void main(String[] args)
    {
        System.out.println("hola git");
        String[] categoriaChida={"hip hop","electronica", "phonk"};
        for(int iterado= 0; iterado<categoriaChida.length; iterado++)
        {
            if (categoriaChida[iterado].equals("hip hop")) {
                System.out.println(categoriaChida[iterado]);
                System.out.println("eminem,2pac,50cent,ice cube");

            }
            if (categoriaChida[iterado].equals("electronica"))
            {
                continue;
            }
            if (categoriaChida[iterado].equals("phonk"))
            {
                System.out.println(categoriaChida[iterado]);
                System.out.println("no pues existen muchos");
                break;
            }



        }


    }

}
