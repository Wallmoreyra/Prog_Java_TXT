public class MatrizDinamica{
  public static void main(String args[]){
  
  int columnas = 3, filas = 3, cont = 1;
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