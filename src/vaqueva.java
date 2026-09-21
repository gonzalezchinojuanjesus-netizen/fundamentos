import java.util.Scanner;

public class vaqueva
{
  public static void main(String[] args)
  {
      Scanner leer = new Scanner(System.in);
      System.out.println("¿Cuanta aura tienes?");
      int aura = leer.nextInt();
      boolean tienesMemorias = leer.nextBoolean();
      if(aura>= 100 && tienesMemorias == false)
      {
          System.out.println("Bienvenidos a tu primer  start up");
      }
  }
}
