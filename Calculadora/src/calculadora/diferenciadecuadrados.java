package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class diferenciadecuadrados extends JFrame implements ActionListener {
    //declaramos objetos
    public JTextField text[] = new JTextField[6];
    public double A1,B1,raiz, raiz2,prueba,prueba2;
    public JButton button[] = new JButton[3];
     public JLabel label[] = new JLabel[13];
    
    //public principal
    public diferenciadecuadrados()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     textdif();
     buttondif();
     labeldif();
    }
    
    //metodo para JTextField
    public void  textdif()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(30, 80, 40, 40);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     this.add(text[0]);//añadimos JTextField
     
     text[1] = new JTextField();
     text[1].setBounds(145, 80, 40, 40);
     this.text[1].setBackground(Color.WHITE);
     this.text[1].setOpaque(true);
     text[1].setFont(new Font("Black Cooper", 0, 22));
     this.add(text[1]);    
     
     text[2] = new JTextField();
     text[2].setBounds(30, 170, 40, 40);
     this.text[2].setBackground(Color.WHITE);
     this.text[2].setOpaque(true);
     text[2].setFont(new Font("Black Cooper", 0, 22));
     this.add(text[2]);
     
     text[3] = new JTextField();
     text[3].setBounds(110, 170, 40, 40);
     this.text[3].setBackground(Color.WHITE);
     this.text[3].setOpaque(true);
     text[3].setFont(new Font("Black Cooper", 0, 22));
     this.add(text[3]);
     
     text[4] = new JTextField();
     text[4].setBounds(205, 170, 40, 40);
     this.text[4].setBackground(Color.WHITE);
     this.text[4].setOpaque(true);
     text[4].setFont(new Font("Black Cooper", 0, 22));
     this.add(text[4]);
     
     text[5] = new JTextField();
     text[5].setBounds(280, 170, 40, 40);
     this.text[5].setBackground(Color.WHITE);
     this.text[5].setOpaque(true);
     text[5].setFont(new Font("Black Cooper", 0, 22));
     this.add(text[5]);
    }
    
    //metodo para labels
    public void labeldif()
    {
     label[0] = new JLabel("Diferencia de cuadrados");//instanciamos y añadimos texto
     label[0].setBounds(80, 10, 250, 50);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 20));//damos fuente al texto
     this.add(label[0]);//añadimos label
     
     label[1] = new JLabel("A²");
     label[1].setBounds(75, 80, 40, 40);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]);
     
     label[2] = new JLabel("(");
     label[2].setBounds(190, 170, 40, 40);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[2]);
     
     label[3] = new JLabel("B²");
     label[3].setBounds(190, 80, 40, 40);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]);
     
     label[4] = new JLabel("A +");
     label[4].setBounds(75, 170, 40, 40);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[4]); 
     
     label[5] = new JLabel("B");
     label[5].setBounds(155, 170, 40, 40);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]); 
     
     label[6] = new JLabel("-");
     label[6].setBounds(110, 80, 40, 40);
     label[6].setForeground(Color.WHITE);
     this.label[6].setOpaque(false);
     label[6].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[6]); 
     
     label[7] = new JLabel("(");
     label[7].setBounds(15, 170, 40, 40);
     label[7].setForeground(Color.WHITE);
     this.label[7].setOpaque(false);
     label[7].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[7]);
     
     label[8] = new JLabel(")");
     label[8].setBounds(165, 170, 40, 40);
     label[8].setForeground(Color.WHITE);
     this.label[8].setOpaque(false);
     label[8].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[8]);
     
     label[9] = new JLabel("Resultado");
     label[9].setBounds(30, 130, 150, 40);
     label[9].setForeground(Color.WHITE);
     this.label[9].setOpaque(false);
     label[9].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[9]);
     
     label[10] = new JLabel("A -");
     label[10].setBounds(250, 170, 40, 40);
     label[10].setForeground(Color.WHITE);
     this.label[10].setOpaque(false);
     label[10].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[10]); 
     
     label[11] = new JLabel("B");
     label[11].setBounds(325, 170, 40, 40);
     label[11].setForeground(Color.WHITE);
     this.label[11].setOpaque(false);
     label[11].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[11]); 
     
     label[12] = new JLabel(")");
     label[12].setBounds(335, 170, 40, 40);
     label[12].setForeground(Color.WHITE);
     this.label[12].setOpaque(false);
     label[12].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[12]);
    }
    
    //metodo para botones
    public void buttondif()
    {
      button[0] = new JButton("Calcular");//instanciamos y damos texto
      button[0].setBounds(30, 230, 150, 30);//damos posiscion y tamaño
      this.button[0].setBackground(Color.WHITE);//damos color de fondo
      this.button[0].setOpaque(true);//damos opacidad
      button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
      this.add(button[0]);//añadimos boton    
      button[0].addActionListener(this);//proporcionamos evento
      
      button[1] = new JButton("Limpiar");
      button[1].setBounds(30, 300, 150, 30);
      this.button[1].setBackground(Color.WHITE);
      this.button[1].setOpaque(true);
      button[1].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[1]);    
      button[1].addActionListener(this);
     
      button[2] = new JButton("Regresar");
      button[2].setBounds(200, 300, 150, 30);
      this.button[2].setBackground(Color.WHITE);
      this.button[2].setOpaque(true);
      button[2].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[2]);    
      button[2].addActionListener(this);
    }
    
    //metodo para operacion
    public void operacion()
    {
    //igualamos variables
     A1 = Double.parseDouble(text[0].getText());
     B1 = Double.parseDouble(text[1].getText());
     
     //sacamos raiz cuadrada
     raiz = Math.sqrt(A1);
     raiz2 = Math.sqrt(B1);
     //verificamos si la raiz elevada al cuadrado es igual al numero origial
     prueba = Math.pow(raiz, 2);
     prueba2 = Math.pow(raiz2, 2);
     //si esto se cumple
     if(prueba == A1 && prueba2 == B1)
     {
      //rellenamos campos
      text[2].setText(text[2].getText()+raiz);   
      text[3].setText(text[3].getText()+raiz2);
      text[4].setText(text[4].getText()+raiz);
      text[5].setText(text[5].getText()+raiz2);
     }
     else 
     {
      //si no se cumple muestra mensaje de error
      JOptionPane.showMessageDialog(this, "Alguno de los terminos no tiene raiz cuadrada exacta");   
     }
     
    }
    
    //main para la creacion de la ventana
    public static void main(String[] args) 
    {
      /*damos forma a la venta*/
        diferenciadecuadrados form7= new diferenciadecuadrados();
        form7.setBounds(400, 60, 400, 380);
        form7.setVisible(true);
        form7.setResizable(false);
        form7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    //metodo abstracto para el evento de cada boton
    @Override
    public void actionPerformed(ActionEvent e) 
    {
     if(e.getSource() == button[0])
     {
      //llamamos al metodo operacion
      operacion();   
     }
      if(e.getSource() == button[1])
     {
         //vaciamos campos
        text[0].setText("");
        text[1].setText("");
        text[2].setText("");
        text[3].setText("");
        text[4].setText("");
        text[5].setText("");
     }
     if(e.getSource() == button[2])
     {
         //redirecionamos al menu
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.hide();  
     }
    }
    
}
