/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion8;

import javax.swing.DefaultListModel;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion8 {
    private String num;
    private int pri;
    private int perf;
    private int conteo;
    private int num1;
    private int num2;
    private int fibo;

    public int getFibo() {
        return fibo;
    }

    public void setFibo(int fibo) {
        this.fibo = fibo;
    }
    
    
    
    public DefaultListModel lista=new DefaultListModel();

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public int getPerf() {
        return perf;
    }

    public void setPerf(int perf) {
        this.perf = perf;
    }

    
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public DefaultListModel tabla(){
        lista.removeAllElements();
        for (int i = 1; i <= 10; i++) {
            lista.addElement(num+" X "+i+" = "+Integer.parseInt(num)*i);
            
        }
        
        return lista;
    }
    public DefaultListModel vacio(){
        lista.removeAllElements();
        
        lista.addElement("Debe ingresar valores en las cajas de texto");
        
        return lista;
        
    }
    public DefaultListModel primo(){
        lista.removeAllElements();
        conteo=0;
        for (int i = 1; i <=pri; i++) {
            if (pri%i==0) {
                conteo+=1;
            }
        }
        if (conteo==2) {
            lista.addElement(pri+" es un número primo");
        }
        else{
            lista.addElement(pri+" NO es un número primo");
        }
         
        
        return lista;
    }
    public DefaultListModel perfecto(){
        
        lista.removeAllElements();
        conteo=0;
        
        for (int i = 1; i <perf; i++) {
            if (perf%i==0) {
                conteo+=i;
                lista.addElement("+"+i);
            }
        }
        if (conteo==perf) {
            lista.addElement("="+perf+ " Es un número perfecto");
        }
        else{
            lista.addElement(perf+ " NO es un número perfecto");
        }
        
        
        
        return lista;
    }
    public DefaultListModel secuencia(){
        lista.removeAllElements();
        conteo=0;
        if (fibo<=1) {
            lista.addElement("ingresar un número mayor a 1");
        }
        num1=1;
        num2=1;
        lista.addElement(num1);
        
        for (int i = 2; i <=fibo; i++) {
            lista.addElement(num2);
            num2=num1+num2;
            num1=num2-num1;
        }
        
        
        return lista;
    }

    
    
    
    
}
