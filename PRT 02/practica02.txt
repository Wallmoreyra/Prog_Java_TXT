public class Suma{
  public static void main(String args[]){
   
   int num_uno = 7;
   int num_dos = 3;
   int res_01 = 0;
   int res_02 = 0;
   int res_03 = 0;
   int res_04 = 0;

   res_01 = num_uno + num_dos;
   res_02 = num_uno - num_dos;
   res_03 = num_dos - num_uno;
   res_04 = num_uno * num_dos;

   System.out.println("El valor de tu suma es: " + res_01 );
   System.out.println("El valor de la resta de " + num_uno + " - " + num_dos + " " + "es: " + res_02);
   System.out.println("El valor de la resta de " + num_dos + " - " + num_uno + " " + "es: " + res_03);
   System.out.println("El valor de tu multi. es: " + res_04);

 }
}