
public class Condicion{
  public static void main(String args[]){

   int Mat = 5;
   int Bio = 8;
   int Qui = 7;
   int Pro = 0;

   Pro = (Mat + Bio + Qui ) / 3 ;

   if (Pro >=6){
     System.out.println("El alumno aprobo " + Pro);

   } else { 
     System.out.println("El alumno desaprobo " + Pro);

   }
   Qui = 1;		/* asignamos una nueva nota para comprobar el else */

   Pro = (Mat + Bio + Qui ) / 3 ;

   if (Pro >=6){
     System.out.println("El alumno aprobo " + Pro);

   } else { 
     System.out.println("El alumno desaprobo " + Pro);

   }


 }
}