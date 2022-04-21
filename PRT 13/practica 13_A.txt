import java.util.Scanner;

public class Nombres_A{
  public static void main(String args[]){

  String nombre_uno = "", nombre_dos = "";
  Scanner entrada = new Scanner(System.in);

  System.out.print("Ingrese el primer nombre: ");
  nombre_uno = entrada.nextLine();

  System.out.print("Ingrese el segundo nombre: ");
  nombre_dos = entrada.nextLine();

  if(nombre_uno.equalsIgnoreCase(nombre_dos) ){		/*.equalsIgnoreCase ignora las mayusculas y minusculas */
     System.out.println("Los nombres son iguales");
   }else{
     System.out.println("Los nombres son diferentes");
    }

 }
}