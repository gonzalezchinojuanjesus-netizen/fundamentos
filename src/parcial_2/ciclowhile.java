package parcial_2;

public class ciclowhile
{
    static void main(String[] args)
    {System.exit(0);
        int archivos = 0;
        while (archivos < 3)
        {
            archivos++;
            System.out.println("Archivos" + archivos);
        }

        int peticiones = 0;
        boolean activo = true;
        while (activo && peticiones <3)
        {
            peticiones++;
            System.out.println("Peticiones" + peticiones);
        }






        int carga = 20;
        while (carga < 100)
        {
            carga +=20;
        }
        System.out.println(carga);
    }
}

