import javax.swing.*; /*nos permite importar los componentes*/
import java.awt.event.*; /*permite controlar los eventos*/

                                       /*atencion a la accion de los eventos*/
public class Formulario extends JFrame implements ActionListener{

  JButton boton1;
  public Formulario(){
   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this); /*agregar un evento al boton*/
   }
                             /*captura de evento*/
   public void actionPerformed(ActionEvent e){
     if(e.getSource() == boton1){
       System.exit(0); /*cierra la interfas grafica*/
     }
   }
  public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,450,350);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null); /*cuando se ejec. deve inic en la mitad de la pantalla*/
 }
}