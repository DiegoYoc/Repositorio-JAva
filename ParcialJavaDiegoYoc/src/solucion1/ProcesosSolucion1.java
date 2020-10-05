/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion1;

import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion1 {
    private int num; 
    private DefaultListModel lista=new DefaultListModel();

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public DefaultListModel vacio(){
        lista.removeAllElements();
        
        lista.addElement("Debe ingresar al menos un número");
        
        return lista;
        
    }
   
    public DefaultListModel llenarLista(){
        lista.removeAllElements();
        if (num<=1) {
            lista.addElement("Numéro debe ser mayor a UNO");
        }
        else{
            for (int i = 1; i <= num; i++) {
            lista.addElement(i);
            }     
        }
                    
        return lista;
        
    }
    public DefaultListModel llenarLista2(){
        lista.removeAllElements();
        if (num<=2) {
            lista.addElement("Numéro debe ser mayor a DOS");
        }
        else{
            for (int i = 2; i <= num; i+=2) {
            lista.addElement(i);
            }     
        }
                    
        return lista;
        
    }    
    public DefaultListModel llenarLista3(){
        lista.removeAllElements();
        if (num<=1) {
            lista.addElement("Numéro debe ser mayor a DOS");
        }
        else{
            for (int i = num; i >= 1; i--) {
            lista.addElement(i);
            }     
        }
                    
        return lista;
        
    }
    public DefaultListModel llenarLista4(){
        lista.removeAllElements();
        if (num<=1) {
            lista.addElement("Numéro debe ser mayor a DOS");
        }
        else{
            for (int i = num; i >= 1; i-=3) {
            lista.addElement(i);
            }     
        }
                    
        return lista;
        
    }    
}

