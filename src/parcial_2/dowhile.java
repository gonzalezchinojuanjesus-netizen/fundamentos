package parcial_2;

public class dowhile {
    static boolean sinConexion(int estado) {
        return estado == 0;
    }
    public static void main(String[] args)
    {
        /*int vidasPorCamapanaDelGears =0;
        do {
         vidasPorCamapanaDelGears++;
        }while (vidasPorCamapanaDelGears <4);

        int intentos =0 ;
         do{
            intentos++;
         } while(intentos<3);
         int intentoss =0;
         boolean conectado = false;
         do{
             intentoss++;
             if(intentoss == 2) conectado = true;
             System.out.println("Intento" + intentoss);
         }while (!conectado && intentoss <3);*/
    int estado = 0, intentos = 0 ;
     do {
         intentos++;
         if(intentos == 2) estado = 1;
         System.out.println("Intentos" + intentos);
     }while (sinConexion(estado));
    }
}
