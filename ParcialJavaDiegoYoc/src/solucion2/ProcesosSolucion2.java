/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion2;

import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion2 {
    private int num1;
    private int num2;
    public int sum;
    public double sum2;
    public int cont;
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
    public DefaultListModel llenarLista(){
        lista.removeAllElements();
        if (num1>=num2) {
            lista.addElement("Segundo dígito debe ser mayor al primero");
        }
        else{
            cont=0;
            sum=0;
            for (int i = num1; i <= num2; i++) {
            cont+=1;
            sum+=i;
            lista.addElement("Suma "+cont+"="+ sum);
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
            cont=0;
            sum2=0;
            for (int i = num1; i <= num2; i++) {
            cont+=1;
            sum2+=i;
            
            }
            lista.addElement("El promedio del rango es: "+sum2/cont);
        }
                    
        return lista;
        
    }
    public DefaultListModel vacio(){
        lista.removeAllElements();
        
        lista.addElement("Debe ingresar valores en las cajas de texto");
        
        return lista;
        
    }
}
