/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion4;

import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class FuncionesCaracteres {
        private String texto;
    private int largo;


    private DefaultListModel lista=new DefaultListModel();

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public DefaultListModel llenarLista1(){
        lista.removeAllElements();
        largo=texto.length();
           
            for (int i = 1; i <= largo; i++) {
                
                lista.addElement(texto.charAt(i-1));
            }
            
        return lista;
        
    }
    public DefaultListModel llenarLista2(){
        lista.removeAllElements();
        largo=texto.length();
           
            for (int i = largo; i >= 1; i--) {
                
                lista.addElement(texto.charAt(i-1));
            }   
                    
        return lista;
        
    }            
    public DefaultListModel llenarLista3(){
        lista.removeAllElements();
        largo=texto.length();     
        if (largo % 2==0) {
           for (int i = 0; i <largo-1; i+=2) {

                lista.addElement(texto.substring(i,i+2));
            } 
        }
        else{
            texto=texto+" ";
            for (int i = 0; i <=largo; i+=2) {

                lista.addElement(texto.substring(i,i+2));
            }
        }
            
            
        return lista;
        
    }   
    public DefaultListModel llenarLista4(){
        lista.removeAllElements();
        largo=texto.length();
        if (largo % 3==0) {
           for (int i = 0; i < largo-1; i+=3) {
               
                   lista.addElement(texto.substring(i, i+3)); 
               
                }  
        }
        else{
            texto=texto+"  ";
            for (int i = 0; i <=largo-1; i+=3) {
               
                   lista.addElement(texto.substring(i, i+3)); 
               
                }
        }
           
            
        return lista;
        
    }
   



    public DefaultListModel vacio(){
        lista.removeAllElements();
        
        lista.addElement("Debe ingresar valores en las cajas de texto");
        
        return lista;
        
    }  
    
}
