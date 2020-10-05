package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class binomiocuadrado extends JFrame implements ActionListener {
    //declaramos nuestros objetos
    public double a,ab,b,a2,b2,raiz,raiz2,prueba,prueba2,calculo,calculo2;
    public JTextField text[] = new JTextField[5];
    public JButton button[] = new JButton[3];
    public JLabel label[] = new JLabel[10];
    
    //public general
    public binomiocuadrado()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     textbi();
     buttonbi();
     labelbi();
    }
    
    //metodo para labels
    public void labelbi()
    {
     label[0] = new JLabel("Binomio Cuadrado");//Instanciamos y damos texto
     label[0].setBounds(120, 10, 200, 50);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 20));//damos fuente al texto
     this.add(label[0]);//agregamos label
     
     label[1] = new JLabel("A²");
     label[1].setBounds(80, 80, 40, 40);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]);
     
     label[2] = new JLabel("AB");
     label[2].setBounds(155, 80, 40, 40);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]);
     
     label[3] = new JLabel("B²");
     label[3].setBounds(240, 80, 40, 40);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]);
     
     label[4] = new JLabel("A");
     label[4].setBounds(80, 170, 40, 40);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[4]); 
     
     label[5] = new JLabel("B");
     label[5].setBounds(240, 170, 40, 40);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]); 
     
     label[6] = new JLabel();
     label[6].setBounds(110, 170, 50, 40);
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
     
     label[8] = new JLabel(")²");
     label[8].setBounds(250, 170, 40, 40);
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
     
     
    }
    
     //metodo para los JTextField
     public void  textbi()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(30, 80, 40, 40);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     text[0].setHorizontalAlignment(JTextField.RIGHT);//damos direccion al texto
     this.add(text[0]);//añadimos
     
     text[1] = new JTextField();
     text[1].setBounds(110, 80, 40, 40);
     this.text[1].setBackground(Color.WHITE);
     this.text[1].setOpaque(true);
     text[1].setFont(new Font("Black Cooper", 0, 22));
     text[1].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[1]);    
     
     text[2] = new JTextField();
     text[2].setBounds(190, 80, 40, 40);
     this.text[2].setBackground(Color.WHITE);
     this.text[2].setOpaque(true);
     text[2].setFont(new Font("Black Cooper", 0, 22));
     text[2].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[2]);
     
     text[3] = new JTextField();
     text[3].setBounds(30, 170, 40, 40);
     this.text[3].setBackground(Color.WHITE);
     this.text[3].setOpaque(true);
     text[3].setFont(new Font("Black Cooper", 0, 22));
     text[3].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[3]);
     
     text[4] = new JTextField();
     text[4].setBounds(190, 170, 40, 40);
     this.text[4].setBackground(Color.WHITE);
     this.text[4].setOpaque(true);
     text[4].setFont(new Font("Black Cooper", 0, 22));
     text[4].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[4]);
     }
     
     public void buttonbi()
     {
      button[0] = new JButton("Calcular");//instanciamos y damos texto
      button[0].setBounds(60, 240, 150, 30);//damos posicion y tamaño
      this.button[0].setBackground(Color.WHITE);//damos color de fondo
      this.button[0].setOpaque(true);//damos opacidad
      button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
      this.add(button[0]);//añadimos boton    
      button[0].addActionListener(this);//añadimos evento
   
      button[1] = new JButton("Limpiar");
      button[1].setBounds(30, 340, 150, 30);
      this.button[1].setBackground(Color.WHITE);
      this.button[1].setOpaque(true);
      button[1].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[1]);    
      button[1].addActionListener(this);
     
      button[2] = new JButton("Regresar");
      button[2].setBounds(210, 340, 150, 30);
      this.button[2].setBackground(Color.WHITE);
      this.button[2].setOpaque(true);
      button[2].setFont(new Font("Black Cooper", 0, 16));
      this.add(button[2]);    
      button[2].addActionListener(this);  
     }
     
     public void binomio()
     {
      //igualamos variables
      a = Double.parseDouble(text[0].getText());
      ab = Double.parseDouble(text[1].getText());
      b = Double.parseDouble(text[2].getText());
      //sacamos raiz de primer y ultimo termino
      raiz = Math.sqrt(a);
      raiz2 = Math.sqrt(b); 
      //elevamos la raiz al cuadrado
      prueba = Math.pow(raiz,2);
      prueba2 = Math.pow(raiz2,2);
      //verificamos si la multiplicación de 2 por las raices es igual a AB
      calculo = 2*raiz*raiz2;
      calculo2 = -1*calculo;
      /*si la elevación de las raices es igual a los terminos originales Y la multiplicación
        de 2 por las raices es igual a AB*/
      if(prueba == a && prueba2 == b && calculo == ab || calculo2 == ab)
      {
       text[3].setText(text[3].getText()+raiz);
       text[4].setText(text[4].getText()+raiz2);
       //si ab es menor a 0 el signo de del binomio sera negativo
       if(ab < 0)
       {
        label[6].setText(label[6].getText()+"  - ");   
       }
       //si ab es mayor a 0 el signo de del binomio sera positivo
       else
       {
        label[6].setText(label[6].getText()+"  + ");   
       }
      }
      //si la condición principal no se cumple la primera expresión no es un T.C.P.
      else
      {
       JOptionPane.showMessageDialog(this, "Esta expresión no es un Trinomio Cuadrado Perfecto");   
      }
                  
     }
     
    //main para la creacion de la ventana
    public static void main(String[] args) {
        //damos forma a la ventana
        binomiocuadrado form6= new binomiocuadrado();
        form6.setBounds(400, 60, 400, 420);
        form6.setVisible(true);
        form6.setResizable(false);
        form6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //metodo abstracto para la funcionalidad de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        //condicionamos cada boton
        if(e.getSource() == button[0])
        {
         //llamamos al metodo binomio
         binomio();
        }
        if(e.getSource() == button[1])
        {
         //limpiamos campos
         text[0].setText("");
         text[1].setText("");
         text[2].setText("");
         text[3].setText("");
         text[4].setText("");
         label[6].setText("");
        }
        if(e.getSource() == button[2])
        {
         //regresamos a la ventana menu
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.hide();
        }
    }
    
}
