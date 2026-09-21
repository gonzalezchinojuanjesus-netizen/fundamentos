import java.util.Scanner;
public class ifAndelado
{
    public static void main (String[] args)
    {
        String tipo = "Asalariado";
      int ganas=400000;
      int cantidadTrabajos = 2;
        if(tipo.equals("Asalariado")){
            System.out.println("Patron");
            if (ganas >= 400000 || cantidadTrabajos >=2){
                System.out.println("Declaraciones anual");
            }
        }
        else {
            System.out.println("obligaciones");
            System.out.println("Declaracion Anual");
            System.out.println("Declaracion Mensual");
        }
    }
}
