package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class sisec3x3 extends JFrame implements ActionListener{
    //declaramos objetos
    public double x1, y1, z1, i1, x2, y2, z2, i2, x3, y3, z3, i3, D, Dx, Dy, Dz, Rx, Ry, Rz,G1,G2,G3,G4,G5,G6,G7,G8;
    public JButton button[] = new JButton[3];
    public JLabel label[] = new JLabel[18];
    public JTextField text[] = new JTextField[12];
    
    //public principal
    public sisec3x3()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     label3();
     textec3();
     buttonec3();
    }
    
    //metodo para labels
    public void label3()
    {
     label[0] = new JLabel();//instanciamos
     label[0].setBounds(80, 300, 40, 40);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(label[0]);//añadimos label 
     
     label[1] = new JLabel();
     label[1].setBounds(80, 340, 40, 40);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]); 
     
     label[2] = new JLabel();
     label[2].setBounds(80, 380, 40, 40);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]); 
     
     label[3] = new JLabel("Sistema");
     label[3].setBounds(20, 20, 150, 50);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 20));
     this.add(label[3]);
     
     label[4] = new JLabel("3 x 3");
     label[4].setBounds(100, 20, 80, 50);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[4]);
     
     label[5] = new JLabel("X");
     label[5].setBounds(70, 80, 40, 40);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]);
     
     label[6] = new JLabel("Y");
     label[6].setBounds(150, 80, 40, 40);
     label[6].setForeground(Color.WHITE);
     this.label[6].setOpaque(false);
     label[6].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[6]);
     
     label[7] = new JLabel("Z =");
     label[7].setBounds(230, 80, 40, 40);
     label[7].setForeground(Color.WHITE);
     this.label[7].setOpaque(false);
     label[7].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[7]);
     
     label[8] = new JLabel("X");
     label[8].setBounds(70, 140, 40, 40);
     label[8].setForeground(Color.WHITE);
     this.label[8].setOpaque(false);
     label[8].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[8]);
     
     label[9] = new JLabel("Y");
     label[9].setBounds(150, 140, 40, 40);
     label[9].setForeground(Color.WHITE);
     this.label[9].setOpaque(false);
     label[9].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[9]);
     
     label[10] = new JLabel("Z =");
     label[10].setBounds(230, 140, 40, 40);
     label[10].setForeground(Color.WHITE);
     this.label[10].setOpaque(false);
     label[10].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[10]);
     
     label[11] = new JLabel("X");
     label[11].setBounds(70, 200, 40, 40);
     label[11].setForeground(Color.WHITE);
     this.label[11].setOpaque(false);
     label[11].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[11]);
     
     label[12] = new JLabel("Y");
     label[12].setBounds(150, 200, 40, 40);
     label[12].setForeground(Color.WHITE);
     this.label[12].setOpaque(false);
     label[12].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[12]);
     
     label[13] = new JLabel("Z =");
     label[13].setBounds(230, 200, 40, 40);
     label[13].setForeground(Color.WHITE);
     this.label[13].setOpaque(false);
     label[13].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[13]);
     
     label[14] = new JLabel("Resultados:");
     label[14].setBounds(20, 260, 150, 50);
     label[14].setForeground(Color.WHITE);
     this.label[14].setOpaque(false);
     label[14].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[14]);
     
     label[15] = new JLabel("X =");
     label[15].setBounds(20, 300, 40, 40);
     label[15].setForeground(Color.WHITE);
     this.label[15].setOpaque(false);
     label[15].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[15]); 
     
     label[16] = new JLabel("Y =");
     label[16].setBounds(20, 340, 40, 40);
     label[16].setForeground(Color.WHITE);
     this.label[16].setOpaque(false);
     label[16].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[16]);
     
     label[17] = new JLabel("Z =");
     label[17].setBounds(20, 380, 40, 40);
     label[17].setForeground(Color.WHITE);
     this.label[17].setOpaque(false);
     label[17].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[17]);
    }
    
    //metodo para JTextField
    public void  textec3()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(20, 80, 40, 40);//damos posiscion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos  color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     text[0].setHorizontalAlignment(JTextField.RIGHT);//damos direccion al texto
     this.add(text[0]);//añadimos
     
     text[1] = new JTextField();
     text[1].setBounds(100, 80, 40, 40);
     this.text[1].setBackground(Color.WHITE);
     this.text[1].setOpaque(true);
     text[1].setFont(new Font("Black Cooper", 0, 22));
     text[1].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[1]);    
     
     text[2] = new JTextField();
     text[2].setBounds(180, 80, 40, 40);
     this.text[2].setBackground(Color.WHITE);
     this.text[2].setOpaque(true);
     text[2].setFont(new Font("Black Cooper", 0, 22));
     text[2].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[2]);
     
     text[3] = new JTextField();
     text[3].setBounds(260, 80, 40, 40);
     this.text[3].setBackground(Color.WHITE);
     this.text[3].setOpaque(true);
     text[3].setFont(new Font("Black Cooper", 0, 22));
     text[3].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[3]);
     
     text[4] = new JTextField();
     text[4].setBounds(20, 140, 40, 40);
     this.text[4].setBackground(Color.WHITE);
     this.text[4].setOpaque(true);
     text[4].setFont(new Font("Black Cooper", 0, 22));
     text[4].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[4]);
     
     text[5] = new JTextField();
     text[5].setBounds(100, 140, 40, 40);
     this.text[5].setBackground(Color.WHITE);
     this.text[5].setOpaque(true);
     text[5].setFont(new Font("Black Cooper", 0, 22));
     text[5].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[5]);
     
     text[6] = new JTextField();
     text[6].setBounds(180, 140, 40, 40);
     this.text[6].setBackground(Color.WHITE);
     this.text[6].setOpaque(true);
     text[6].setFont(new Font("Black Cooper", 0, 22));
     text[6].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[6]);
     
     text[7] = new JTextField();
     text[7].setBounds(260, 140, 40, 40);
     this.text[7].setBackground(Color.WHITE);
     this.text[7].setOpaque(true);
     text[7].setFont(new Font("Black Cooper", 0, 22));
     text[7].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[7]);
     
     text[8] = new JTextField();
     text[8].setBounds(20, 200, 40, 40);
     this.text[8].setBackground(Color.WHITE);
     this.text[8].setOpaque(true);
     text[8].setFont(new Font("Black Cooper", 0, 22));
     text[8].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[8]);
     
     text[9] = new JTextField();
     text[9].setBounds(100, 200, 40, 40);
     this.text[9].setBackground(Color.WHITE);
     this.text[9].setOpaque(true);
     text[9].setFont(new Font("Black Cooper", 0, 22));
     text[9].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[9]);
     
     text[10] = new JTextField();
     text[10].setBounds(180, 200, 40, 40);
     this.text[10].setBackground(Color.WHITE);
     this.text[10].setOpaque(true);
     text[10].setFont(new Font("Black Cooper", 0, 22));
     text[10].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[10]);
     
     text[11] = new JTextField();
     text[11].setBounds(260, 200, 40, 40);
     this.text[11].setBackground(Color.WHITE);
     this.text[11].setOpaque(true);
     text[11].setFont(new Font("Black Cooper", 0, 22));
     text[11].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[11]);
    }
    
    //metodo de botones
    public void buttonec3()
    {
     button[0] = new JButton("Calcular");//instanciamos y damos textos
     button[0].setBounds(20, 440, 150, 50);//damos posicion y tamaño
     this.button[0].setBackground(Color.WHITE);//damos color de fondo
     this.button[0].setOpaque(true);//damos opacidad
     button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(button[0]);//añadimos boton    
     button[0].addActionListener(this);//proporcionamos evento
     
     button[1] = new JButton("Limpiar");
     button[1].setBounds(190, 440, 150, 50);
     this.button[1].setBackground(Color.WHITE);
     this.button[1].setOpaque(true);
     button[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[1]);    
     button[1].addActionListener(this);
     
     button[2] = new JButton("Regresar");
     button[2].setBounds(360, 440, 150, 50);
     this.button[2].setBackground(Color.WHITE);
     this.button[2].setOpaque(true);
     button[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[2]);    
     button[2].addActionListener(this);
    }
    
    //metodo de operacion
    public void ec3x3()
    {
      //igualamos variables
      x1 = Double.parseDouble(text[0].getText());
      y1 = Double.parseDouble(text[1].getText());
      z1 = Double.parseDouble(text[2].getText());
      i1 = Double.parseDouble(text[3].getText());
      
      x2 = Double.parseDouble(text[4].getText());
      y2 = Double.parseDouble(text[5].getText());
      z2 = Double.parseDouble(text[6].getText());
      i2 = Double.parseDouble(text[7].getText());
      
      x3 = Double.parseDouble(text[8].getText());
      y3 = Double.parseDouble(text[9].getText());
      z3 = Double.parseDouble(text[10].getText());
      i3 = Double.parseDouble(text[11].getText());
      
      //empieza calculo determinante del sistema
      G1 = (x1*y2*z3) + (x2*y3*z1) + (x3*y1*z2);
      G2 = (z1*y2*x3) + (z2*y3*x1) + (z3*y1*x2);
      D = G1-G2;
      
      //empieza calculo determinante de x
      G3 = (i1*y2*z3) + (i2*y3*z1) + (i3*y1*z2);
      G4 = (z1*y2*i3) + (z2*y3*i1) + (z3*y1*i2);
      Dx = G3-G4;
      
       //empieza calculo determinante de y
      G5 = (x1*i2*z3) + (x2*i3*z1) + (x3*i1*z2);
      G6 = (z1*i2*x3) + (z2*i3*x1) + (z3*i1*x2);
      Dy = G5-G6;
      
      //empieza calculo determinante de z
      G7 = (x1*y2*i3) + (x2*y3*i1) + (x3*y1*i2);
      G8 = (i1*y2*x3) + (i2*y3*x1) + (i3*y1*x2);
      Dz = G7-G8;
      
      //calculamos valores de x, y, z
      Rx = Dx/D;
      Ry = Dy/D;
      Rz = Dz/D;
      
      //llenamos campos
      label[0].setText(label[0].getText()+Rx);
      label[1].setText(label[1].getText()+Ry);
      label[2].setText(label[2].getText()+Rz);
    }
    
    //main para la creacion de la ventana
    public static void main(String[] args) {
        //damos forma a la ventana
        sisec3x3 form4= new sisec3x3();
        form4.setBounds(400, 60, 540, 540);
        form4.setVisible(true);
        form4.setResizable(false);
        form4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }

    //metodo abstracto para el evento de cada boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button[0])
        {
            //llamamos al metodo ec3x3
            ec3x3();
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
         text[7].setText("");
         text[8].setText("");
         text[9].setText("");
         text[10].setText("");
         text[11].setText("");
         label[0].setText("");
         label[1].setText(""); 
         label[2].setText("");
        }
        if(e.getSource() == button[2])
        {
         //redireccionamos a la ventana menu
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.hide();
        }
        
    }
}
