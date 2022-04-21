import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Bienvenida extends JFrame implements ActionListener{

   private JTextField textfield1, textfield2;
   private JLabel label1, label2, label3, label4, label5, label6;
   private JButton boton1, boton2;
   public static String texto = "", texto2 = "";

   public Bienvenida(){
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setTitle("Bienvenido");
     getContentPane().setBackground(new Color(255,0,0));
     setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

     ImageIcon imagen = new ImageIcon("images/logo-coca.png");
     label1 = new JLabel(imagen);
     label1.setBounds(25,15,300,150);
     add(label1);

     label2 = new JLabel("Sistema de Control Vacacional");
     label2.setBounds(35,135,300,30);
     label2.setFont(new Font("Andale Mono", 3, 18));
     label2.setForeground(new Color(255,255,255));
     add(label2);

     label3 = new JLabel("Ingrese su nombre: ");
     label3.setBounds(45,212,200,30);
     label3.setFont(new Font("Andale Mono", 1, 12));
     label3.setForeground(new Color(255,255,255));
     add(label3);

     label4 = new JLabel("©2021 The Coca-Cola Company");
     label4.setBounds(85,410,300,30);
     label4.setFont(new Font("Andale Mono", 1, 12));
     label4.setForeground(new Color(255,255,255));
     add(label4);

     label5 = new JLabel("Ingrese su Password: ");
     label5.setBounds(45,270,200,30);
     label5.setFont(new Font("Andale Mono", 1, 12));
     label5.setForeground(new Color(255,255,255));
     add(label5);

     label6 = new JLabel("Usuario: Admin                 Pass: 1234");
     label6.setBounds(45,330,200,30);
     label6.setFont(new Font("Andale Mono", 1, 12));
     label6.setForeground(new Color(255,255,255));
     add(label6);

     textfield1 = new JTextField ();
     textfield1.setBounds(45,240,250,25);
     textfield1.setBackground(new Color(224,224,224));
     textfield1.setFont(new Font("Andale Mono", 1, 14));
     textfield1.setForeground(new Color(255,0,0));
     add(textfield1);

     textfield2 = new JTextField ();
     textfield2.setBounds(45,298,250,25);
     textfield2.setBackground(new Color(224,224,224));
     textfield2.setFont(new Font("Andale Mono", 1, 14));
     textfield2.setForeground(new Color(255,0,0));
     add(textfield2);

     boton1 = new JButton("Ingresar");
     boton1.setBounds(45,360,100,30);
     boton1.setBackground(new Color(255,255,255));
     boton1.setFont(new Font("Andale Mono", 1, 14));
     boton1.setForeground(new Color(255,0,0));
     boton1.addActionListener(this);
     add(boton1);

     boton2 = new JButton("Salir");
     boton2.setBounds(195,360,100,30);
     boton2.setBackground(new Color(255,255,255));
     boton2.setFont(new Font("Andale Mono", 1, 14));
     boton2.setForeground(new Color(255,0,0));
     boton2.addActionListener(this);
     add(boton2);
  }

   public void actionPerformed(ActionEvent eve){
      if(eve.getSource() == boton1){
        texto = textfield1.getText().trim();
        texto2 = textfield2.getText().trim();
        if(texto.equals("") || texto2.equals("")){
           JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre de usuario y password");
        }
        if(texto.equals("Admin") && texto2.equals("1234")){
             Licencia ventanalicencia = new Licencia();
             ventanalicencia.setBounds(0,0,610,380);
             ventanalicencia.setVisible(true);
             ventanalicencia.setResizable(false);
             ventanalicencia.setLocationRelativeTo(null);
             this.setVisible(false);
        }else{
           JOptionPane.showMessageDialog(null, "Nombre de Usuario o Password incorrecto");
           }
       }
      if(eve.getSource() == boton2){
         System.exit(0);
       }
   }

  public static void main(String args[]){
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,360,495);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);
 }

}