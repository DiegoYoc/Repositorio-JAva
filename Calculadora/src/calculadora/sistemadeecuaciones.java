package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class sistemadeecuaciones extends JFrame implements ActionListener{
    //declaramos objetos
    public double x1, y1, i1, x2, y2, i2, D, Dx, Dy, Rx, Ry;
    public JButton button[] = new JButton[3];
    public JLabel label[] = new JLabel[13];
    public JTextField text[] = new JTextField[6];
    //public principal
    public sistemadeecuaciones()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     carga();
        
    }
    //metodo de carga de componentes
    public void carga()
    {
     buttonec();
     textec();
     labelec();
    }
    //metodo para JTextField
    public void  textec()
    {
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(20, 80, 40, 40);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     text[0].setHorizontalAlignment(JTextField.RIGHT);//damos orientacion al texto
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
     text[3].setBounds(20, 140, 40, 40);
     this.text[3].setBackground(Color.WHITE);
     this.text[3].setOpaque(true);
     text[3].setFont(new Font("Black Cooper", 0, 22));
     text[3].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[3]);
     
     text[4] = new JTextField();
     text[4].setBounds(100, 140, 40, 40);
     this.text[4].setBackground(Color.WHITE);
     this.text[4].setOpaque(true);
     text[4].setFont(new Font("Black Cooper", 0, 22));
     text[4].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[4]);
     
     text[5] = new JTextField();
     text[5].setBounds(180, 140, 40, 40);
     this.text[5].setBackground(Color.WHITE);
     this.text[5].setOpaque(true);
     text[5].setFont(new Font("Black Cooper", 0, 22));
     text[5].setHorizontalAlignment(JTextField.RIGHT);
     this.add(text[5]);
    }
    //metodo para labels
    public void labelec()
    {
     label[0] = new JLabel("Sistema");//instanciamos y damos texto
     label[0].setBounds(20, 20, 150, 50);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 20));//damos fuente al texto
     this.add(label[0]);
     
     label[1] = new JLabel("2 x 2");
     label[1].setBounds(100, 20, 80, 50);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]);
    
     label[2] = new JLabel("X");
     label[2].setBounds(70, 80, 40, 40);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]);
     
     label[3] = new JLabel("Y =");
     label[3].setBounds(150, 80, 40, 40);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]);
     
     label[4] = new JLabel("X");
     label[4].setBounds(70, 140, 40, 40);
     label[4].setForeground(Color.WHITE);
     this.label[4].setOpaque(false);
     label[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[4]);
     
     label[5] = new JLabel("Y =");
     label[5].setBounds(150, 140, 40, 40);
     label[5].setForeground(Color.WHITE);
     this.label[5].setOpaque(false);
     label[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[5]); 
     
     label[6] = new JLabel("Resultados:");
     label[6].setBounds(20, 180, 150, 50);
     label[6].setForeground(Color.WHITE);
     this.label[6].setOpaque(false);
     label[6].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[6]); 
     
     label[7] = new JLabel("X =");
     label[7].setBounds(20, 220, 40, 40);
     label[7].setForeground(Color.WHITE);
     this.label[7].setOpaque(false);
     label[7].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[7]); 
     
     label[8] = new JLabel("Y =");
     label[8].setBounds(20, 260, 40, 40);
     label[8].setForeground(Color.WHITE);
     this.label[8].setOpaque(false);
     label[8].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[8]); 
     
     label[9] = new JLabel();
     label[9].setBounds(60, 220, 100, 40);
     label[9].setForeground(Color.WHITE);
     this.label[9].setOpaque(false);
     label[9].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[9]); 
     
     label[10] = new JLabel();
     label[10].setBounds(60, 260, 100, 40);
     label[10].setForeground(Color.WHITE);
     this.label[10].setOpaque(false);
     label[10].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[10]); 
    }
    
    //metodo para botones 
    public void buttonec()
    {
     button[0] = new JButton("Calcular");//instanciamos y damos texto
     button[0].setBounds(20, 320, 150, 50);//damos posicion y tamaño
     this.button[0].setBackground(Color.WHITE);//damos color de fondo
     this.button[0].setOpaque(true);//damos opacidad
     button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(button[0]);//añadimos    
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
    //metodo operacion
    public void ec2x2()
    {
      //igualamos variables
      x1 = Double.parseDouble(text[0].getText());
      y1 = Double.parseDouble(text[1].getText());
      i1 = Double.parseDouble(text[2].getText());
      
      x2 = Double.parseDouble(text[3].getText());
      y2 = Double.parseDouble(text[4].getText());
      i2 = Double.parseDouble(text[5].getText());
      
      //calculamos determinantes
      D = (x1*y2)-(y1*x2);
      Dx = (i1*y2)-(y1*i2);
      Dy = (x1*i2)-(i1*x2);
      //obtenemos valores de x, y
      Rx = Dx/D;
      Ry = Dy/D;
      //llenamos campos
      label[9].setText(label[9].getText()+Rx);
      label[10].setText(label[10].getText()+Ry);
    }
    //main para la creacion de la ventana
    public static void main(String[] args) 
    {
     /*damos forma a la venta*/
        sistemadeecuaciones form3= new sistemadeecuaciones();
        form3.setBounds(400, 60, 400, 410);
        form3.setVisible(true);
        form3.setResizable(false);
        form3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }

    //metodo abstracto para eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button[0])
        {
         //llamamos metodo ec2x2
         ec2x2();   
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
         label[9].setText("");
         label[10].setText(""); 
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
