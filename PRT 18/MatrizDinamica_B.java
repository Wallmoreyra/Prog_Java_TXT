import java.util.Scanner;

public class MatrizDinamica_B{
  public static void main(String args[]){
  
  int columnas = 0, filas = 0, cont = 1;
  Scanner entrada = new Scanner(System.in);

  System.out.println("Cuantas filas deseas?");
  filas = entrada.nextInt();
  System.out.println("Cuantas columnas deseas?");
  columnas = entrada.nextInt();

  int numeros[][] = new int[filas][columnas];

   for(int j = 0; j < filas; j++){
      for(int i = 0; i < columnas; i++){
       numeros[j][i] = cont;
       cont++;
       System.out.print("[" + numeros[j][i] +"]");
       }
     System.out.println("");
    }

 }
}