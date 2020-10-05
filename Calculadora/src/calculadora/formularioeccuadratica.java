package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.*;

public class formularioeccuadratica extends JFrame implements ActionListener{
    //declaramos objetos
    public double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, x3 = 0;
    public JButton button[] = new JButton[3];
    public JLabel label[] = new JLabel[9];
    public JTextField text[] = new JTextField[3];
    
    //public general
    public formularioeccuadratica()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     text();
     buttoncua();
     label();
        
    }
    
    //metodo para JText Field
    public void text()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(20, 80, 40, 40);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     text[0].setHorizontalAlignment(JTextField.RIGHT);//damos posicion al texto
     this.add(text[0]);//añadimos
     
     text[1] = new JTextField();
     text[1].setBounds(120, 80, 40, 40);
     this.text[1].setBackground(Color.WHITE);
     this.text[1].setOpaque(true);
     text[1].setFont(new Font("Black Cooper", 0, 22));
     text[1].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[1]);    
     
     text[2] = new JTextField();
     text[2].setBounds(220, 80, 40, 40);
     this.text[2].setBackground(Color.WHITE);
     this.text[2].setOpaque(true);
     text[2].setFont(new Font("Black Cooper", 0, 22));
     text[2].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[2]);   
    }
    
    //metodo para labels
    public void label()
    {
     label[0] = new JLabel();//instanciamos
     label[0].setBounds(90, 200, 150, 50);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(label[0]);//añadimos label
     
     label[1] = new JLabel();
     label[1].setBounds(90, 260, 150, 50);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]);
     
     label[2] = new JLabel("Ecuación Cuadrática");
     label[2].setBounds(20, 20, 150, 50);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]);
     
     label[3] = new JLabel("Resultado");
     label[3].setBounds(20, 140, 70, 50);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]);
     
     label[4] = new JLabel("X²");
     label[4].setBounds(65, 80, 40, 40);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 22));
     this.add(label[4]);
     
     label[5] = new JLabel("X1 =");
     label[5].setBounds(20, 200, 60, 50);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]);
     
     label[6] = new JLabel("X2 =");
     label[6].setBounds(20, 260, 60, 50);
     label[6].setForeground(Color.WHITE);
     this.label[6].setOpaque(false);
     label[6].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[6]);
     
     label[7] = new JLabel("X");
     label[7].setBounds(165, 80, 40, 40);
     label[7].setForeground(Color.WHITE);
     this.label[7].setOpaque(false);
     label[7].setFont(new Font("Black Cooper", 0, 22));
     this.add(label[7]);
     
     label[8] = new JLabel("= 0");
     label[8].setBounds(265, 80, 40, 40);
     label[8].setForeground(Color.WHITE);
     this.label[8].setOpaque(false);
     label[8].setFont(new Font("Black Cooper", 0, 22));
     this.add(label[8]);
    }
    
    //metodo para botones
    public void buttoncua()
    {
     button[0] = new JButton("Calcular");//instanciamos y damos texto
     button[0].setBounds(20, 320, 150, 50);//damos posicion y tamaño
     this.button[0].setBackground(Color.WHITE);//damos color de fondo
     this.button[0].setOpaque(true);//damos opacidad
     button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(button[0]);//añadimos boton    
     button[0].addActionListener(this);//proporcionamos evento
     
     button[1] = new JButton("Limpiar");
     button[1].setBounds(200, 320, 150, 50);
     this.button[1].setBackground(Color.WHITE);
     this.button[1].setOpaque(true);
     button[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[1]);    
     button[1].addActionListener(this);
     
     button[2] = new JButton("Regresar");
     button[2].setBounds(260, 200, 100, 50);
     this.button[2].setBackground(Color.WHITE);
     this.button[2].setOpaque(true);
     button[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[2]);    
     button[2].addActionListener(this);
    }
    
    //metodo de operacion
    public void cuadratica()
    {
     //ax2 + bx + c = 0
        
     //damos formato decimal a 3 variables   
     DecimalFormat i1 = new DecimalFormat("0.00");
     DecimalFormat i2 = new DecimalFormat("0.00");
     DecimalFormat i3 = new DecimalFormat("0.00");
     
     //igualamos variables
     a = Double.parseDouble(text[0].getText()); 
     b = Double.parseDouble(text[1].getText());
     c = Double.parseDouble(text[2].getText());
     
     //variable que hace la primera funcion de la ecuacion cuadratica
     double determinante = Math.pow(b,2)-(4*a*c);
     
     //si esta no tiene termino negativo dentro de la raiz
     if(determinante > 0)
     {
      //rellenamos campos
      x1 = (b*(-1) + Math.sqrt(determinante))/(2*a);
      x2 = (b*(-1) - Math.sqrt(determinante))/(2*a);
      label[0].setText(label[0].getText()+x1);
      label[1].setText(label[1].getText()+x2);
     }
     //si esta tiene termino negativo dentro de la raiz
     else
     {
      //rellenamos campos con numeros complejos   
      x1 = (Math.sqrt((b*b-4*a*c)*-1)/(2*a)); 
      x2 = -(Math.sqrt((b*b-4*a*c)*-1)/(2*a));
      x3 = (-b)/(2*a);
      label[0].setText(label[0].getText()+ i3.format(x3)+"+"+ i1.format(x1)+"i");
      label[1].setText(label[1].getText()+ i3.format(x3)+""+ i2.format(x2)+"i");
     }  
     }
    
    //main para la creacion de la ventana
    public static void main(String[] args) {
        /*damos forma a la venta*/
        formularioeccuadratica form2= new formularioeccuadratica();
        form2.setBounds(400, 60, 400, 410);
        form2.setVisible(true);
        form2.setResizable(false);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
    
    //metodo abstracto para el evento de cada boton
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button[0])
        {
         //llamamos el metodo cuadratica   
         cuadratica();   
        }
        if(e.getSource()==button[1])
        {
         //vaciamos campos
         text[0].setText("");
         text[1].setText("");
         text[2].setText("");
         label[0].setText("");
         label[1].setText("");
        }
        if(e.getSource()==button[2])
        {
         //redirigimos a la clase menu    
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         this.hide();
        }
    }
}
