package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class menu extends JFrame implements ActionListener{
    //declaramos objetos
    public JButton button[] = new JButton[5];
    public JLabel label[] = new JLabel[1];
    
    //public general
    public menu()
    {
     this.getContentPane().setBackground(Color.DARK_GRAY);
     setLayout(null);
     carga();   
    }
    
    //metodo para la carga de componentes
    public void carga()
    {
     buttonmen();
     labelbienvenida();
    }
    
    //metodo para botones
    public void buttonmen()
    {
     button[0] = new JButton("Sistema de ecuaciones");//instanciamos y damos texto
     button[0].setBounds(90, 140, 200, 50);//damos posicion y tamaño
     this.button[0].setBackground(Color.WHITE);//damos color de fondo
     this.button[0].setOpaque(true);//damos opacidad
     button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(button[0]);//añadimos boton    
     button[0].addActionListener(this);// proporcionamos evento
     
     button[1] = new JButton("Factorización");
     button[1].setBounds(90, 200, 200, 50);
     this.button[1].setBackground(Color.WHITE);
     this.button[1].setOpaque(true);
     button[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[1]);    
     button[1].addActionListener(this);
     
     button[2] = new JButton("Trigonometria");
     button[2].setBounds(90, 260, 200, 50);
     this.button[2].setBackground(Color.WHITE);
     this.button[2].setOpaque(true);
     button[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[2]);    
     button[2].addActionListener(this);
     
     button[3] = new JButton("Regresar");
     button[3].setBounds(90, 320, 200, 50);
     this.button[3].setBackground(Color.WHITE);
     this.button[3].setOpaque(true);
     button[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[3]);    
     button[3].addActionListener(this);
     
     button[4] = new JButton("Ecuación cuadrática");
     button[4].setBounds(90, 80, 200, 50);
     this.button[4].setBackground(Color.WHITE);
     this.button[4].setOpaque(true);
     button[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[4]);    
     button[4].addActionListener(this);
    }
    
    //metodo para label
    public void labelbienvenida()
    {
     label[0] = new JLabel("MÁS FUNCIONES");//instanciamos y damos texto
     label[0].setBounds(110, 20, 200, 50);//damos posicion y tamaño
     label[0].setForeground(Color.WHITE);//damos color al texto
     this.label[0].setOpaque(false);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 20));//damos fuente al texto
     this.add(label[0]);//añadimos label
    }
    
    //main para la creacion de la ventana
    public static void main(String[] args) {
        /*damos forma a la venta*/
        menu form= new menu();
        form.setBounds(400, 60, 400, 420);
        form.setVisible(true);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //metodo abstracto para el evento de cada boton
    @Override
    public void actionPerformed(ActionEvent e) {
        
     if(e.getSource() == button[0])
     {
      //cadena para saber que opcion elije el usuario   
      String Cadena;
      Cadena = JOptionPane.showInputDialog(null, "Ingrese el tamaño del sistema: ");
      if(Cadena.equals("2x2"))
      {
         //redireccionamos al fomulario correspondiente
        sistemadeecuaciones form3= new sistemadeecuaciones();
        form3.setBounds(400, 60, 400, 410);
        form3.setVisible(true);
        form3.setResizable(false);
        form3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide(); 
      }
      else if(Cadena.equals("3x3"))
      {
         //redireccionamos al fomulario correspondiente
        sisec3x3 form4= new sisec3x3();
        form4.setBounds(400, 60, 540, 540);
        form4.setVisible(true);
        form4.setResizable(false);
        form4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide();   
      }
     }
     
     if(e.getSource() == button[1])
     {
      //cadena para saber que opcion elije el usuario 
      String Cadena;
      Cadena = JOptionPane.showInputDialog(null, "Escoje una opción"+ "\n" +"1)Binomio Cuadrado"+ "\n" +"2)Diferencia de Cuadrados"+ "\n" +"3)Suma y diferencia de cubos"+ "\n" +"Opción: " );
      if(Cadena.equals("1"))
      {
        //redireccionamos al fomulario correspondiente  
        binomiocuadrado form6= new binomiocuadrado();
        form6.setBounds(400, 60, 400, 410);
        form6.setVisible(true);
        form6.setResizable(false);
        form6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide(); 
      }
      else if(Cadena.equals("2"))
      {
        //redireccionamos al fomulario correspondiente  
        diferenciadecuadrados form7= new diferenciadecuadrados();
        form7.setBounds(400, 60, 400, 380);
        form7.setVisible(true);
        form7.setResizable(false);
        form7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide(); 
      }
      else if(Cadena.equals("3"))
      {
        //redireccionamos al fomulario correspondiente  
        syrdecubos form7= new syrdecubos();
        form7.setBounds(400, 60, 610, 320);
        form7.setVisible(true);
        form7.setResizable(false);
        form7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide();
      } 
     }
     if(e.getSource() == button[2])
     {
        //redireccionamos al fomulario correspondiente 
        trigonometria form5= new trigonometria();
        form5.setBounds(400, 60, 400, 380);
        form5.setVisible(true);
        form5.setResizable(false);
        form5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.hide();
     }
     if(e.getSource() == button[3])
     {
        //redireccionamos al fomulario correspondiente 
        Calculadora form1= new Calculadora();
        form1.setBounds(400, 60, 280, 600);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.hide();
     }
     if(e.getSource() == button[4])
     {
        //redireccionamos al fomulario correspondiente 
        formularioeccuadratica form2= new formularioeccuadratica();
        form2.setBounds(400, 60, 400, 410);
        form2.setVisible(true);
        form2.setResizable(false);
        form2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.hide(); 
     }
    }
    
}
