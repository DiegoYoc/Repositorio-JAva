/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class FuncionesNum {
    
        DefaultListModel lista=new DefaultListModel();
        DefaultComboBoxModel lista2=new DefaultComboBoxModel();
        private int num;

  

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
        
        
        
        
    
    public DefaultListModel vacio(){
        lista.removeAllElements();
        
        lista.addElement("Debe ingresar un valor");
        
        return lista;
        
    }
    public DefaultListModel pares(){
        lista.removeAllElements();
        
           
            for (int i = 2; i <= num; i++) {
                if (i % 2==0) {
                    lista.addElement(i);
                }
            
            }     
       
                    
        return lista;
        
    }
    public DefaultListModel multiplo5(){
        lista.removeAllElements();
        
           
            for (int i = 5; i <= num; i++) {
                if (i % 5==0) {
                    lista.addElement(i);
                }
            
            }     
       
                    
        return lista;
        
    }
    public DefaultComboBoxModel tabla(){
        lista2.removeAllElements();
        
        for (int i = 1; i <= 10; i++) {
            lista2.addElement(num+" X "+i+" = "+num*i);
            
        }
        
        
        return lista2;
    }
}
