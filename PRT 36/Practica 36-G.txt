import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Competencia extends JFrame implements ActionListener{

  private JLabel label1, label2;
  private JButton boton1, boton2;

 public Competencia(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  getContentPane().setBackground(new Color(255,255,255));
  setTitle("Bienvenido a la competencia");
  setIconImage(new ImageIcon(getClass().getResource("images/pepsi-icon.png")).getImage());

  ImageIcon imagen1 = new ImageIcon("images/azul-pepsi.png");
  label1 = new JLabel(imagen1);
  label1.setBounds(70,15,300,324);
  add(label1);

  label2 = new JLabel("Usted esta a punto de dirigirse hacia la competencia");
  label2.setBounds(25,340,425,30);
  label2.setFont(new Font("Andale Mono", 3, 15));
  label2.setForeground(new Color(39,81,184));
  add(label2);  

  boton1 = new JButton(" Coca-Cola ");
  boton1.setBounds(25,380,150,30);
  boton1.setBackground(new Color(254,0,26));
  boton1.setFont(new Font("Andale Mono", 1, 14));
  boton1.setForeground(new Color(255,255,255));
  boton1.addActionListener(this);
  add(boton1);

  boton2 = new JButton(" Pep-pesiii!!!!!");
  boton2.setBounds(240,380,150,30);
  boton2.setBackground(new Color(39,81,184));
  boton2.setFont(new Font("Andale Mono", 1, 14));
  boton2.setForeground(new Color(255,255,255));
  boton2.addActionListener(this);
  add(boton2);

 }

 public void actionPerformed(ActionEvent eve){

   if(eve.getSource() == boton1){
     Bienvenida ventanabienvenida = new Bienvenida();
     ventanabienvenida.setBounds(0,0,360,495);
     ventanabienvenida.setVisible(true);
     ventanabienvenida.setResizable(false);
     ventanabienvenida.setLocationRelativeTo(null);
     this.setVisible(false);
   }
   if(eve.getSource() == boton2){
      System.exit(0);
   }
 }

 public static void main(String args[]){
   Competencia ventanacompetencia = new Competencia();
   ventanacompetencia.setBounds(0,0,450,500);
   ventanacompetencia.setVisible(true);
   ventanacompetencia.setResizable(false);
   ventanacompetencia.setLocationRelativeTo(null);


 }
}