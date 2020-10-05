package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.*;


public class trigonometria extends JFrame implements ActionListener{
    //declaramos objetos
    public JComboBox[] combo = new JComboBox[1];
    public JTextField text[] = new JTextField[1];
    public JLabel label[] = new JLabel[4];
    public JButton button[] = new JButton[3];
    public DecimalFormat dt = new DecimalFormat("0.000000");
    //public general
    public trigonometria()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     //Jcombobox para la seleccion de funcion trigonometrica
     combo[0] = new JComboBox();//instanciamos
     combo[0].setBounds(20, 80, 80, 30);//damos posicion y tamaño
     this.combo[0].setBackground(Color.WHITE);//damos color de fondo
     this.combo[0].setOpaque(true);//damos opacidad
     combo[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(combo[0]);//añadimos
     //añadimos items
     combo[0].addItem("Seno");
     combo[0].addItem("Coseno");
     combo[0].addItem("Tangente");
     
     //JTextField para el ingreso del dato numerico
     text[0] = new JTextField();//instanciamos
     text[0].setBounds(20, 140, 80, 30);//damos posicion y tamaño
     this.text[0].setBackground(Color.WHITE);//damos color de fondo
     this.text[0].setOpaque(true);//damos opacidad
     text[0].setFont(new Font("Black Cooper", 0, 22));//damos fuente al texto
     this.add(text[0]);//añadimos
     //llamamos metodos
     labeltri();
     buttonstri();
    }
    //metodo para labels
    public void labeltri()
    {
     label[0] = new JLabel();//instanciamos
     label[0].setBounds(100, 180, 150, 40);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(label[0]);//añadimos
      
     label[1] = new JLabel("Trigonometria");
     label[1].setBounds(20, 20, 150, 40);
     label[1].setForeground(Color.WHITE);
     this.label[1].setOpaque(false);
     label[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[1]); 
      
     label[2] = new JLabel("Grados");
     label[2].setBounds(120, 140, 80, 30);
     label[2].setForeground(Color.WHITE);
     this.label[2].setOpaque(false);
     label[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[2]); 
     
     label[3] = new JLabel("Resultado: ");
     label[3].setBounds(20, 180, 150, 40);
     label[3].setForeground(Color.WHITE);
     this.label[3].setOpaque(false);
     label[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(label[3]); 
    }
    //metodo para botones
    public void buttonstri()
    {
      button[0] = new JButton("Calcular");//instanciamos y damos texto
      button[0].setBounds(120, 250, 150, 30);//damos posicion y tamaño
      this.button[0].setBackground(Color.WHITE);//damos color de fondo
      this.button[0].setOpaque(true);//damos opacidad
      button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
      this.add(button[0]);//añadimos    
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
    //metodo operacion
    public void funciones()
    {
     //variable para rellenar Jcombobox   
     String items = (String)combo[0].getSelectedItem();
     //variables para funciones trigonometricas
     double v1,seno,coseno,tangente;
     v1 = Double.parseDouble(text[0].getText());
     double b = Math.toRadians(v1);
     //condicion de seleccion de cada dato
     if(items.equals("Seno"))
     {
      seno = Math.sin(b);
      label[0].setText(dt.format(seno));
     }
     else if(items.equals("Coseno"))
     {
      coseno = Math.cos(b);
      label[0].setText(dt.format(coseno));
     }
     else if(items.equals("Tangente"))
     {
      tangente = Math.tan(b); 
      label[0].setText(dt.format(tangente));
     }           
    }
    //main para la creacion de la ventana
    public static void main(String[] args) {
     /*damos forma a la venta*/
        trigonometria form5= new trigonometria();
        form5.setBounds(400, 60, 400, 380);
        form5.setVisible(true);
        form5.setResizable(false);
        form5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
    
    //metodo abstracto para eventos
    @Override
    public void actionPerformed(ActionEvent e){
     if(e.getSource() == button[0])
     {
         //llamamos metodo funciones
      funciones();   
     }
      if(e.getSource() == button[1])
     { 
         //vaciamos campos
        text[0].setText("");
        label[0].setText("");
     }
     if(e.getSource() == button[2])
     {
         //redireccionamos ventana menu
         menu form= new menu();
         form.setBounds(400, 60, 400, 420);
         form.setVisible(true);
         form.setResizable(false);
         form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.hide();  
     }
    }
    
}
