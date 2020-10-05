package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class syrdecubos extends JFrame implements ActionListener {
    //declaramos objetos
    public JTextField text[] = new JTextField[7];
    public JComboBox[] combo = new JComboBox[1];
    public JLabel label[] = new JLabel[16];
    public JButton button[] = new JButton[3];
    public double A1,B1,raiz, raiz2,prueba,prueba2,a,ab,b;
    
    //public general
    public syrdecubos()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     textsyr();
     buttonsyr();
     labelbi();
     //Jcombobox para eleccion de signo
     combo[0] = new JComboBox();//instanciamos
     combo[0].setBounds(120, 90, 40, 20);//damos posicion y tamaño
     this.combo[0].setBackground(Color.WHITE);//damos color de fondo
     this.combo[0].setOpaque(true);//damos opacidad
     combo[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(combo[0]);//añadimos
     //añadimos items
     combo[0].addItem("+");
     combo[0].addItem("-");
    }
    //metodo para JTextField
    public void textsyr()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(30, 80, 45, 40);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     text[0].setHorizontalAlignment(JTextField.RIGHT);//damos orientacion al texto
     this.add(text[0]);//añadimos
     
     text[1] = new JTextField();
     text[1].setBounds(190, 80, 45, 40);
     this.text[1].setBackground(Color.WHITE);
     this.text[1].setOpaque(true);
     text[1].setFont(new Font("Black Cooper", 0, 16));
     text[1].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[1]);    
     
     text[2] = new JTextField();
     text[2].setBounds(30, 170, 45, 40);
     this.text[2].setBackground(Color.WHITE);
     this.text[2].setOpaque(true);
     text[2].setFont(new Font("Black Cooper", 0, 16));
     text[2].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[2]);
     
     text[3] = new JTextField();
     text[3].setBounds(155, 170, 45, 40);
     this.text[3].setBackground(Color.WHITE);
     this.text[3].setOpaque(true);
     text[3].setFont(new Font("Black Cooper", 0, 16));
     text[3].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[3]);
     
     text[4] = new JTextField();
     text[4].setBounds(270, 170, 45, 40);
     this.text[4].setBackground(Color.WHITE);
     this.text[4].setOpaque(true);
     text[4].setFont(new Font("Black Cooper", 0, 16));
     text[4].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[4]);  
     
     text[5] = new JTextField();
     text[5].setBounds(390, 170, 45, 40);
     this.text[5].setBackground(Color.WHITE);
     this.text[5].setOpaque(true);
     text[5].setFont(new Font("Black Cooper", 0, 16));
     text[5].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[5]);
     
     text[6] = new JTextField();
     text[6].setBounds(510, 170, 45, 40);
     this.text[6].setBackground(Color.WHITE);
     this.text[6].setOpaque(true);
     text[6].setFont(new Font("Black Cooper", 0, 16));
     text[6].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[6]);
    }
    //metodo para botones
     public void buttonsyr()
    {
      button[0] = new JButton("Calcular");//instanciamos y damos texto
      button[0].setBounds(40, 240, 150, 30);//damos posicion y tamaño
      this.button[0].setBackground(Color.WHITE);//damos color de fondo
      this.button[0].setOpaque(true);//damos opacidad
      button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
      this.add(button[0]);//añadimos    
      button[0].addActionListener(this);//proporcionamos evento
      
      button[1] = new JButton("Limpiar");
      button[1].setBounds(220, 240, 150, 30);
      this.button[1].setBackground(Color.WHITE);
      this.button[1].setOpaque(true);
      button[1].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[1]);    
      button[1].addActionListener(this);
     
      button[2] = new JButton("Regresar");
      button[2].setBounds(400, 240, 150, 30);
      this.button[2].setBackground(Color.WHITE);
      this.button[2].setOpaque(true);
      button[2].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[2]);    
      button[2].addActionListener(this);
    }
     //metodo para labels
     public void labelbi()
    {
     label[0] = new JLabel();//instanciamos
     label[0].setBounds(100, 170, 40, 40);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(true);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 20));//damos fuente al texto
     label[0].setHorizontalAlignment(JLabel.CENTER);//damos orientacion al texto
     this.add(label[0]);//añadimos    
        
     label[1] = new JLabel("Suma y diferencia de cubos");
     label[1].setBounds(170, 10, 250, 50);
     label[1].setForeground(Color.WHITE);
     this.label[0].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 20));
     label[1].setHorizontalAlignment(JLabel.CENTER);
     this.add(label[1]);
     
     label[2] = new JLabel("A³");
     label[2].setBounds(80, 80, 40, 40);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]);
     
     label[3] = new JLabel("AB");
     label[3].setBounds(440, 170, 40, 40);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]);
     
     label[4] = new JLabel("B³");
     label[4].setBounds(240, 80, 40, 40);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[4]);
     
     label[5] = new JLabel("A");
     label[5].setBounds(80, 170, 40, 40);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]); 
     
     label[6] = new JLabel("B");
     label[6].setBounds(205, 170, 40, 40);
     label[6].setForeground(Color.WHITE);
     this.label[6].setOpaque(false);
     label[6].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[6]); 
     
     label[7] = new JLabel("A²");
     label[7].setBounds(320, 170, 50, 40);
     label[7].setForeground(Color.WHITE);
     this.label[7].setOpaque(false);
     label[7].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[7]); 
     
     label[8] = new JLabel("B²");
     label[8].setBounds(560, 170, 40, 40);
     label[8].setForeground(Color.WHITE);
     this.label[8].setOpaque(false);
     label[8].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[8]);
     
     label[9] = new JLabel("(");
     label[9].setBounds(15, 170, 40, 40);
     label[9].setForeground(Color.WHITE);
     this.label[9].setOpaque(false);
     label[9].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[9]);
     
     label[10] = new JLabel(")");
     label[10].setBounds(220, 170, 40, 40);
     label[10].setForeground(Color.WHITE);
     this.label[10].setOpaque(false);
     label[10].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[10]);
     
     label[11] = new JLabel("(");
     label[11].setBounds(250, 170, 40, 40);
     label[11].setForeground(Color.WHITE);
     this.label[11].setOpaque(false);
     label[11].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[11]);
     
     label[12] = new JLabel(")");
     label[12].setBounds(575, 170, 150, 40);
     label[12].setForeground(Color.WHITE);
     this.label[12].setOpaque(false);
     label[12].setFont(new Font("Black Cooper", 0, 32));
     this.add(label[12]);
     
     label[13] = new JLabel("Resultado");
     label[13].setBounds(30, 130, 150, 40);
     label[13].setForeground(Color.WHITE);
     this.label[13].setOpaque(false);
     label[13].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[13]);
     
     label[14] = new JLabel();
     label[14].setBounds(342, 170, 40, 40);
     label[14].setForeground(Color.WHITE);
     this.label[14].setOpaque(false);
     label[14].setFont(new Font("Black Cooper", 0, 20));
     label[14].setHorizontalAlignment(JLabel.CENTER);
     this.add(label[14]);
     
     label[15] = new JLabel("+");
     label[15].setBounds(464, 170, 40, 40);
     label[15].setForeground(Color.WHITE);
     this.label[15].setOpaque(false);
     label[15].setFont(new Font("Black Cooper", 0, 20));
     label[15].setHorizontalAlignment(JLabel.CENTER);
     this.add(label[15]);
    } 
    
    public void operacion()
    { 
     //variable para campos del combobox   
     String items = (String)combo[0].getSelectedItem(); 
     //igualamos variables
     A1 = Double.parseDouble(text[0].getText());
     B1 = Double.parseDouble(text[1].getText());
     //sacamos raices
     raiz = Math.cbrt(A1);
     raiz2 = Math.cbrt(B1);
     //verificamos si la raiz elevada al cubo es igual al numero original
     prueba = Math.pow(raiz, 3);
     prueba2 = Math.pow(raiz2, 3);
     //si esto se culple
     if(prueba == A1 && prueba2 == B1)
     {
         //si el campo seleccionado es el signo suma
         if(items.equals("+"))
         {
          //se llenan campos segun la formula //a3 + b3 = (a + b)(a2 - ab + b2)
          text[2].setText(text[2].getText()+raiz);
          label[0].setText(label[0].getText()+"+");
          label[14].setText(label[14].getText()+"-");
          text[3].setText(text[3].getText()+raiz2);
          a = Math.pow(raiz, 2);
          ab = raiz*raiz2;
          b = Math.pow(raiz2, 2);
          text[4].setText(text[4].getText()+a);
          text[5].setText(text[5].getText()+ab);
          text[6].setText(text[6].getText()+b);
         }
          //si el campo seleccionado es el signo resta
         else if(items.equals("-"))
         {
          //se llenan campos segun la formula //a3 - b3 = (a - b)(a2 + ab + b2)
          text[2].setText(text[2].getText()+raiz);
          label[0].setText(label[0].getText()+"-");
          label[14].setText(label[14].getText()+"+");
          text[3].setText(text[3].getText()+raiz2);
          a = Math.pow(raiz, 2);
          ab = raiz*raiz2;
          b = Math.pow(raiz2, 2);
          text[4].setText(text[4].getText()+a);
          text[5].setText(text[5].getText()+ab);
          text[6].setText(text[6].getText()+b);
         } 
     }
     //si la condicion principal no se cumple mostrara mensaje de error
     else
     {
      JOptionPane.showMessageDialog(this, "Alguno de los terminos no tiene raiz cubica exacta");   
     }   
    }
    //main para la creacion de la ventana
    public static void main(String[] args) 
    {
     //damos forma a la ventana
        syrdecubos form7= new syrdecubos();
        form7.setBounds(400, 60, 610, 320);
        form7.setVisible(true);
        form7.setResizable(false);
        form7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    //metodo abstracto para eventos
    @Override
    public void actionPerformed(ActionEvent e) 
    {
     if(e.getSource() == button[0])
     {
         //lamamos metodo operacion
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
        text[6].setText("");
        label[0].setText("");
        label[14].setText("");
     }
     if(e.getSource() == button[2])
     {
         //redireccionamos a ventana menu
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.hide();  
     }
    }
    
}
