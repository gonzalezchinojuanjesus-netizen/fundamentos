//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main()
{
  Scanner leer = new Scanner(System.in);
  double saldo = 4000.0,retiro;
  System.out.println("No lo hagas compa: cuanto va a retirar :(");
  retiro = leer.nextDouble();
  if(retiro <= saldo && retiro >0)
  {
      saldo = saldo - retiro ;
      System.out.println("Saldo nuevo pobre es:" +saldo);

  }
  else
  {
  System.out.println("pobre jodido,saldo insufieciente,trabaja");
  }
}
