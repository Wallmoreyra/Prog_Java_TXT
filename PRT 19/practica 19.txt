import javax.swing.*;  /*libreria grafica*/

public class Formulario extends JFrame{
   private JLabel label1;	/*etiqueta, mostrar datos sin system.out*/

   public Formulario(){		/*constructor*/
    setLayout(null);	/*nos permite indicar cordenadas para los elementos*/
    label1 = new JLabel("La Geekipedia");
    label1.setBounds(10,20,200,300);	/*eje x, eje y, ancho, alto*/
    add(label1);
   }

  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);	/*para que se vea la interfas*/
   formulario1.setLocationRelativeTo(null);	/*cuando se ejecuque aparece en el centro.*/


 }
}