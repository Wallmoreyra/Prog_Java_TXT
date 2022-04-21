import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener{

   private JMenuBar menubar;
   private JMenu menu1, menu2,menu3;
   private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
   private JButton boton1;

 public Formulario(){
   setLayout(null);
   menubar = new JMenuBar();
   setJMenuBar(menubar);
   
   menu1 = new JMenu("Opciones");
   menubar.add(menu1);

   menu2 = new JMenu("Tamaño de la ventana");
   menu1.add(menu2);
  
   menu3 = new JMenu("Color de fondo");
   menu1.add(menu3);

   menuitem1 = new JMenuItem("300*200");
   menu2.add(menuitem1);
   menuitem1.addActionListener(this);

   menuitem2 = new JMenuItem("640*480");
   menu2.add(menuitem2);
   menuitem2.addActionListener(this);

   menuitem3 = new JMenuItem("Rojo");
   menu3.add(menuitem3);
   menuitem3.addActionListener(this);

   menuitem4 = new JMenuItem("Verde");
   menu3.add(menuitem4);
   menuitem4.addActionListener(this);

   menuitem5 = new JMenuItem("Azul");
   menu3.add(menuitem5);
   menuitem5.addActionListener(this);

   menuitem6 = new JMenuItem("Blanco");
   menu3.add(menuitem6);
   menuitem6.addActionListener(this);

   boton1 = new JButton("Salir");
   boton1.setBounds(10,10,100,30);
   boton1.addActionListener(this);
   add(boton1);


 }

  public void actionPerformed(ActionEvent eve){
   if(eve.getSource () == menuitem1){
     setSize(300,200);
   }
   if(eve.getSource () == menuitem2){
     setSize(640,480);
   }
   if(eve.getSource () == menuitem3){
     getContentPane().setBackground(new Color(255,0,0));
   }
   if(eve.getSource () == menuitem4){
     getContentPane().setBackground(new Color(0,255,0));
   }
   if(eve.getSource () == menuitem5){
     getContentPane().setBackground(new Color(0,0,255));
   }
   if(eve.getSource () == menuitem6){
     getContentPane().setBackground(new Color(255,255,255));
   }
   if(eve.getSource () == boton1){
     System.exit(0);
   }
 }

  public static void main(String args[]){
   Formulario formulario1 = new Formulario();
   formulario1.setBounds(0,0,300,200);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);

 }
}