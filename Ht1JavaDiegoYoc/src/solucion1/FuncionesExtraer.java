/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion1;

/**
 *
 * @author ChocoChiwi
 */
public class FuncionesExtraer {
    private String texto;
    private int largo;
    private char pos;

    public void asignarTexto(String texto) {
        this.texto = texto;
    }
    public String CantCaracteres(){
        largo=texto.length();
        return "La cantidad de caracteres es: "+ largo;
    }
    public String PrimerC(){
        pos=texto.charAt(0);
        return "El Primer Carácter es: "+pos;
    }
    public String TercerC(){
        pos=texto.charAt(2);
        return "El Tercer Carácter es: "+pos;
    }
    public String UltimoC(){
        pos=texto.charAt(texto.length()-1);
        return "El último Carácter es: "+pos;
    }
    public String vacio(){
        
        
        return "Para trabajar ingrese texto";
        
    }
 
    
    
    
    
    
}
