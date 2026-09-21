package parcial_2;

public class acti_clase
{
    public static void main(String[] args)
    {

        String[] categoriaChidaMusica = {"Hip hop", "Rock and roll", "Phonk", "Cumbia"};
        System.out.println(categoriaChidaMusica[0]);
        System.out.println(categoriaChidaMusica[2]);
        categoriaChidaMusica[2] = "Hip hop";
        System.out.println(categoriaChidaMusica[2]);
        System.out.println(categoriaChidaMusica.length);
        for (int iterador = 0; iterador < categoriaChidaMusica.length ; iterador++){
            System.out.println(iterador);
            System.out.println(categoriaChidaMusica[iterador]);
        }
        System.exit(0);

        System.exit(0);
        // Forma de crear un arreglo agregando datos directo
        String[] categoriaMusica = {"Pop", "Rock and roll", "Bolero", "Jazz"};
        System.out.println(categoriaMusica[0]);
        //Actualizar el dato o cambiar dato o agregarñp
        categoriaMusica[2] =  "Metal";
        System.out.println(categoriaMusica[2]);
        System.out.println(categoriaMusica[3]);
        // No puedes poner 4 porque el tamaño involuntariamente lo pusiste arriba
        //categoriaMusica[4] = "Hip hop";

    }
}
