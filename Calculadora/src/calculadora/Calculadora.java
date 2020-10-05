
package calculadora;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JFrame;
import javax.swing.*;


public class Calculadora extends JFrame implements ActionListener {
    //Instanciamos al gerente del motor de JavaScript
    ScriptEngineManager p = new ScriptEngineManager();
    ScriptEngine x = p.getEngineByName("JavaScript");
    //Declaramos nuestros objetos;
    public JButton button[] = new JButton[24];
    public JLabel label[] = new JLabel[2];
    public String tot;
    public double num = 0,raiz = 0,exponente = 0,inversomultiplicativo ;
    public DecimalFormat dt = new DecimalFormat("0.000");
    //public general
    public Calculadora()
    {
     //color de fondo del formulario
     this.getContentPane().setBackground(Color.DARK_GRAY);
     //linea que permite el uso del formulario
     setLayout(null);
     //llamada de metodos
     buttons();   
     label();
     crearevento(); 
    }
    //metodo para los botones
    public void buttons()
    {
     button[0] = new JButton("1");//instanciamos el boton
     button[0].setBounds(20, 200, 50, 50);//damos posicion y tamaño
     this.button[0].setBackground(Color.WHITE);//damos color de fondo
     this.button[0].setOpaque(true);//damos opacidad
     button[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     this.add(button[0]);//agregamos el boton al formulario   
     
     button[1] = new JButton("2");
     button[1].setBounds(80, 200, 50, 50);
     this.button[1].setBackground(Color.WHITE);
     this.button[1].setOpaque(true);
     button[1].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[1]);
     
     button[2] = new JButton("3");
     button[2].setBounds(140, 200, 50, 50);
     this.button[2].setBackground(Color.WHITE);
     this.button[2].setOpaque(true);
     button[2].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[2]);
     
     button[3] = new JButton("4");
     button[3].setBounds(20, 140, 50, 50);
     this.button[3].setBackground(Color.WHITE);
     this.button[3].setOpaque(true);
     button[3].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[3]);
     
     button[4] = new JButton("5");
     button[4].setBounds(80, 140, 50, 50);
     this.button[4].setBackground(Color.WHITE);
     this.button[4].setOpaque(true);
     button[4].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[4]);
     
     button[5] = new JButton("6");
     button[5].setBounds(140, 140, 50, 50);
     this.button[5].setBackground(Color.WHITE);
     this.button[5].setOpaque(true);
     button[5].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[5]);
     
     button[6] = new JButton("7");
     button[6].setBounds(20, 80, 50, 50);
     this.button[6].setBackground(Color.WHITE);
     this.button[6].setOpaque(true);
     button[6].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[6]);
     
     button[7] = new JButton("8");
     button[7].setBounds(80, 80, 50, 50);
     this.button[7].setBackground(Color.WHITE);
     this.button[7].setOpaque(true);
     button[7].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[7]);
     
     button[8] = new JButton("9");
     button[8].setBounds(140, 80, 50, 50);
     this.button[8].setBackground(Color.WHITE);
     this.button[8].setOpaque(true);
     button[8].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[8]);
     
     button[9] = new JButton("0");
     button[9].setBounds(80, 260, 50, 50);
     this.button[9].setBackground(Color.WHITE);
     this.button[9].setOpaque(true);
     button[9].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[9]);
     
     button[10] = new JButton("C");
     button[10].setBounds(20, 380, 110, 50);
     this.button[10].setBackground(Color.WHITE);
     this.button[10].setOpaque(true);
     button[10].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[10]);
     
     button[11] = new JButton(".");
     button[11].setBounds(200, 320, 50, 50);
     this.button[11].setBackground(Color.WHITE);
     this.button[11].setOpaque(true);
     button[11].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[11]);
     
     button[12] = new JButton("+");
     button[12].setBounds(200, 80, 50, 50);
     this.button[12].setBackground(Color.WHITE);
     this.button[12].setOpaque(true);
     button[12].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[12]);
     
     button[13] = new JButton("-");
     button[13].setBounds(200, 140, 50, 50);
     this.button[13].setBackground(Color.WHITE);
     this.button[13].setOpaque(true);
     button[13].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[13]);
     
     button[14] = new JButton("*");
     button[14].setBounds(200, 200, 50, 50);
     this.button[14].setBackground(Color.WHITE);
     this.button[14].setOpaque(true);
     button[14].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[14]);
     
     button[15] = new JButton("/");
     button[15].setBounds(200, 260, 50, 50);
     this.button[15].setBackground(Color.WHITE);
     this.button[15].setOpaque(true);
     button[15].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[15]);
     
     button[16] = new JButton("=");
     button[16].setBounds(140, 380, 110, 50);
     this.button[16].setBackground(Color.WHITE);
     this.button[16].setOpaque(true);
     button[16].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[16]);
     
     button[17] = new JButton("√");
     button[17].setBounds(80, 320, 50, 50);
     this.button[17].setBackground(Color.WHITE);
     this.button[17].setOpaque(true);
     button[17].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[17]);
     
     button[18] = new JButton("^");
     button[18].setBounds(20, 320, 50, 50);
     this.button[18].setBackground(Color.WHITE);
     this.button[18].setOpaque(true);
     button[18].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[18]);
     
     button[19] = new JButton("!");
     button[19].setBounds(140, 260, 50, 50);
     this.button[19].setBackground(Color.WHITE);
     this.button[19].setOpaque(true);
     button[19].setFont(new Font("Black Cooper", 0, 16));
     this.add(button[19]);
     
     button[20] = new JButton("n√");
     button[20].setBounds(20, 260, 50, 50);
     this.button[20].setBackground(Color.WHITE);
     this.button[20].setOpaque(true);
     button[20].setFont(new Font("Black Cooper", 0, 10));
     this.add(button[20]);
     
     button[21] = new JButton("1/x");
     button[21].setBounds(140, 320, 50, 50);
     this.button[21].setBackground(Color.WHITE);
     this.button[21].setOpaque(true);
     button[21].setFont(new Font("Black Cooper", 0, 10));
     this.add(button[21]);
     
     button[22] = new JButton("Más funciones");
     button[22].setBounds(20, 500, 230, 50);
     this.button[22].setBackground(Color.WHITE);
     this.button[22].setOpaque(true);
     button[22].setFont(new Font("Black Cooper", 0, 20));
     this.add(button[22]);
     
     button[23] = new JButton("Manual de usuario");
     button[23].setBounds(20, 440, 230, 50);
     this.button[23].setBackground(Color.WHITE);
     this.button[23].setOpaque(true);
     button[23].setFont(new Font("Black Cooper", 0, 20));
     this.add(button[23]);
     
    }
    //metodo para label que mostrara los resultados
    public void label()
    {
     label[0] = new JLabel();//instanciamos el label
     label[0].setBounds(20, 20, 230, 50);//damos posicion y tamaño
     this.label[0].setBackground(Color.WHITE);//damos color de fondo
     this.label[0].setOpaque(true);//damos opacidad
     label[0].setFont(new Font("Black Cooper", 0, 16));//damos fuente al texto
     label[0].setHorizontalAlignment(JLabel.RIGHT);//damos posicion al texto
     this.add(label[0]);//añadimos el label   
    }
    //metodo para los eventos de cada boton
    public void eventos (ActionEvent e) throws IOException
    {
       //instanciamos la herramienta JButton
      JButton bt = (JButton) e.getSource();
      //for que ayuda al recorrido dentro del arreglo button
      for (int i = 0;i<=23;i++)
      {
          //condicionamos para dar una funcion a cada boton
          if(bt == button[i])
            {
              if(i == 0)
              {
                  label[0].setText(label[0].getText()+"1");
              }
              else if(i == 1)
              {
                  label[0].setText(label[0].getText()+"2");
              }
              else if(i == 2)
              {
                  label[0].setText(label[0].getText()+"3");
              }
              else if(i == 3)
              {
                  label[0].setText(label[0].getText()+"4");
              }
              else if(i == 4)
              {
                  label[0].setText(label[0].getText()+"5");
              }
              else if(i == 5)
              {
                  label[0].setText(label[0].getText()+"6");
              }
              else if(i == 6)
              {
                  label[0].setText(label[0].getText()+"7");
              }
              else if(i == 7)
              {
                  label[0].setText(label[0].getText()+"8");
              }
              else if(i == 8)
              {
                  label[0].setText(label[0].getText()+"9");
              }
              else if(i == 9)
              {
                  label[0].setText(label[0].getText()+"0");
              }
              else if(i == 10)
              {
                   label[0].setText("");
              }
              else if(i == 11)
              {
                  String cadena;
                  cadena = label[0].getText();
                  
                  if(cadena.length() <= 0)
                  {
                      label[0].setText("0.");
                  }
                  else
                  {
                      if(!existepunto(label[0].getText()))
                      {
                       label[0].setText(label[0].getText()+".");   
                      }
                  }
              }
              else if(i == 12)
              {
                  label[0].setText(label[0].getText()+"+");
              }
              else if(i == 13)
              {
                  label[0].setText(label[0].getText()+"-");
                 
              }
              else if(i == 14)
              {
                  label[0].setText(label[0].getText()+"*");
                 
              }
              else if(i == 15)
              {
                  label[0].setText(label[0].getText()+"/");
                  
              }
              else if(i == 16)
              {
                  try 
                  {
                    //damos la funcion de poder operar al boton =  
                    tot = x.eval(label[0].getText()).toString();
                    label[0].setText(tot);
                  }
                  catch(ScriptException ex)
                  {
                    Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null,ex);
                  }
                  
              }
              else if(i == 17)
              {
                  //sacamos la  raiz cuadrada de un numero
                  num = Double.parseDouble(label[0].getText());
                  raiz = Math.sqrt(num);
                  label[0].setText(dt.format(raiz));
                 
              }
              else if(i == 18)
              {
                  //elevamos un numero a la n 
                  exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente: "));
                  num = Double.parseDouble(label[0].getText());
                  raiz = Math.pow(num,exponente);
                  label[0].setText(dt.format(raiz));
              }
              else if(i == 19)
              {
                  //sacamos el factorial de un numero
                   int factorial = 1;
                   int digito;
                   digito = Integer.parseInt(label[0].getText());
                   //recorrido para encontrar el factorial
                   for(int j = 1; j <= digito; j++)
                   {
                    factorial *= j;   
                   }
                  label[0].setText(String.valueOf(factorial));
              }
               else if(i == 20)
               {
                //sacamos raiz n de un numero   
                exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente: "));
                num = Double.parseDouble(label[0].getText());
                raiz = Math.pow(num,1/exponente);
                label[0].setText(dt.format(raiz));
               }
              else if(i == 21)
              {
                //encontramos inverso multiplicativo de un numero  
                num = Double.parseDouble(label[0].getText());
                inversomultiplicativo = Math.pow (num, -1 );
                label[0].setText(dt.format(inversomultiplicativo));
              }
              else if(i == 22)
              {
                //instanciamos a la clase menu para tener acceso al formulario
                menu form= new menu();
                form.setBounds(400, 60, 400, 420);
                form.setVisible(true);
                form.setResizable(false);
                form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                this.hide(); 
              }
              else if(i == 23)
              {
               //lineas para abrir el manual
               ProcessBuilder p = new ProcessBuilder(); 
               p.command("cmd.exe","/c","C:\\Users\\ChocoChiwi\\Documents\\NetBeansProjects\\Calculadora\\src\\calculadora\\MANUAL DE USUARIO.pdf");
               p.start();
              }
            }
          }
    }
    //metodo ´para activar los eventos de los botones
    public void crearevento(){
       //recorrido de los 23 botones
       for(int i = 0;i<=23;i++){
          button[i].addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
                  try {
                      eventos(e);
                  } catch (IOException ex) {
                      Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          });
       }
   }
   //metodo para verificar si existe un punto decimal
   public static boolean existepunto(String cadena){
       boolean existe = false;
       //recorrido dentro de la cadena que almacena los numeros
       for(int i = 0;i< cadena.length();i++){
           if(cadena.substring(i,i+1).equals(".")){
               existe = true;
               break;
           }
       }
       return existe;
   }
   //main para la creacion de la ventana
    public static void main(String[] args) {
        /*damos forma a la venta*/
        Calculadora form1= new Calculadora();
        form1.setBounds(400, 60, 280, 600);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     
    }
    //metodo abstracto para  los eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }   
}
