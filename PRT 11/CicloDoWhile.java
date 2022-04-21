import java.util.Scanner;

public class CicloDoWhile{
  public static void main(String args[]){
  
  Scanner in = new Scanner(System.in);
  int num_uno = 0, e = 10, i = 1000;

  System.out.println("Ingrese un numero para ver sus 10 consecutivos: ");
  num_uno = in.nextInt();
  System.out.print("Su numero es: " + num_uno + " le siguen: ");

  do{
     num_uno = num_uno + 1;
     System.out.print(num_uno + ", ");
     e--;
   }while(e>0);
  
  System.out.println("");

  do{
     System.out.print(i + ", ");

     i-=200;

   }while(i>=0);

 }
}