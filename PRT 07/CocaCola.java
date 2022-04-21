import java.util.Scanner;
 
public class CocaCola{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int Clave = 0, Years = 0;

   System.out.println("*******************************************************");
   System.out.println("*Bienvenido al sistema vacacional de Coca-Cola company*");
   System.out.println("*******************************************************");
   System.out.println("");
   System.out.println("");
   System.out.println("Ingrese su nombre:");
   nombre = in.nextLine();

   System.out.println("Ingrese la clave del departamento: ");
   System.out.println("1 Atencion al cliente 2 Logistica y 3 Gerencia");
   Clave = in.nextInt();

   System.out.println("Ingrese la cantidad de years trabajandos:");
   Years = in.nextInt();

   if(Clave == 1){
         if(Years == 1){
       System.out.println(nombre + " por " + Years + " years te corresponden 6 dias de vacaciones. ");

      }  else if(Years >= 2 && Years <= 6){
       System.out.println(nombre + " por " + Years + " years te corresponden 14 dias de vacaciones. ");

      }  else if(Years >= 7){
       System.out.println(nombre + " por " + Years + " years te corresponden 20 dias de vacaciones. ");

      }  else {
       System.out.println(nombre + " no te corresponden vacaciones");

      }

   } else if(Clave == 2){
         if(Years == 1){
       System.out.println(nombre + " por " + Years + " years te corresponden 7 dias de vacaciones. ");

      }  else if(Years >= 2 && Years <= 6){
       System.out.println(nombre + " por " + Years + " years te corresponden 15 dias de vacaciones. ");

      }  else if(Years >= 7){
       System.out.println(nombre + " por " + Years + " years te corresponden 22 dias de vacaciones. ");

      }  else {
       System.out.println(nombre + " no te corresponden vacaciones");

      }

   } else if(Clave == 3){
         if(Years == 1){
       System.out.println(nombre + " por " + Years + " years te corresponden 10 dias de vacaciones. ");

      }  else if(Years >= 2 && Years <= 6){
       System.out.println(nombre + " por " + Years + " years te corresponden 20 dias de vacaciones. ");

      }  else if(Years >= 7){
       System.out.println(nombre + " por " + Years + " years te corresponden 30 dias de vacaciones. ");

      }  else {
       System.out.println(nombre + " no te corresponden vacaciones");
      }

   } else {
       System.out.println(nombre + " La clave que ingresaste es incorrecta");
      }

 }
}