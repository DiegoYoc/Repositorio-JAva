/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion3;

import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion3 {
    private int num1;
    private int num2;

    private DefaultListModel lista=new DefaultListModel();
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }    
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }  
    public DefaultListModel llenarLista1(){
        lista.removeAllElements();
        if (num1>=num2) {
            lista.addElement("Segundo dígito debe ser mayor al primero");
        }
        else{
           
            for (int i = num1; i <= num2; i++) {
                if (i % 2==0) {
                    lista.addElement(i);
                }
            
            }     
        }
                    
        return lista;
        
    }
    public DefaultListModel llenarLista2(){
        lista.removeAllElements();
        if (num1>=num2) {
            lista.addElement("Segundo dígito debe ser mayor al primero");
        }
        else{
           
            for (int i = num1; i <= num2; i++) {
                if (i % 2==1) {
                    lista.addElement(i);
                }
            
            }     
        }
                    
        return lista;
        
    }
    public DefaultListModel llenarLista3(){
        lista.removeAllElements();
        if (num1>=num2) {
            lista.addElement("Segundo dígito debe ser mayor al primero");
        }
        else{
           
            for (int i = num1; i <= num2; i++) {
                if (i % 3==0) {
                    lista.addElement(i);
                }
            
            }     
        }
                    
        return lista;
        
    }
    public DefaultListModel llenarLista4(){
        lista.removeAllElements();
        if (num1>=num2) {
            lista.addElement("Segundo dígito debe ser mayor al primero");
        }
        else{
           
            for (int i = num1; i <= num2; i++) {
                if (i % 5==0) {
                    lista.addElement(i);
                }
            
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
