import java.util.Scanner; /*libreria para introducir por teclado*/

public class Suma{
  public static void main(String args[]){

    Scanner in = new Scanner(System.in);  /*dentro de los parentesis siempre la palabra in*/
    String nombre = "";
    int num_uno = 0, num_dos = 0, resultado = 0;

    System.out.println("Cual es tu nombre?");
    nombre = in.nextLine();

    System.out.println("ingrese el primer valor: ");
    num_uno = in.nextInt();

    System.out.println("ingrese el segundo valor: ");
    num_dos = in.nextInt();
 
    resultado = num_uno + num_dos;
    
    System.out.println("hola " + nombre + " el resultado de tu suma es: " + resultado);
 
 }
}