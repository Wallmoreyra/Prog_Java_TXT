import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener, ChangeListener{

   private JLabel label1;
   private JCheckBox check1;
   private JButton boton1, boton2;

 public Formulario(){
    setLayout(null);
    label1 = new JLabel("Aceptar terminos y condiciones");
    label1.setBounds(10,10,400,30);
    add(label1);

    check1 = new JCheckBox("Acepto");
    check1.setBounds(10,50,100,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,100,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("Salir");
    boton2.setBounds(250,100,70,30);
    boton2.addActionListener(this);
    add(boton2);
 }

   public void stateChanged(ChangeEvent eve){

     if(check1.isSelected() == true){
        boton1.setEnabled(true);
      } else{
        boton1.setEnabled(false);
      }
   }

    public void actionPerformed(ActionEvent eve){
      if(eve.getSource() == boton1){
       System.exit(0);
      }
      if(eve.getSource() == boton2){
       System.exit(0);
      }
   }

 public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,350,200);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);


 }
}
