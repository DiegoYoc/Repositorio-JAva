/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion4;



/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion4 {

    private String texto;
    private int largo;
    private char pos;
    private char ultimo;
    private String ultimo2;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
   
   public String vacio(){
       return "Caja de texto vacia ingrese una palabra";
   }
   
   public String cantCaracteres(){
        largo=texto.length();
        return "La longitud del texto es: "+ largo;
    }
    public String primerC(){
        pos=texto.charAt(0);
        return "El Primer Carácter es: "+pos;
    }

    public String ultimoC(){
        pos=texto.charAt(texto.length()-1);
        return "El último Carácter es: "+pos;
    }
    
    public String vocal(){
        ultimo=texto.charAt(texto.length()-1);
        ultimo2=String.valueOf(ultimo);
        if (ultimo2.equals("a") || ultimo2.equals("e") || ultimo2.equals("i") || ultimo2.equals("o") || ultimo2.equals("u") || ultimo2.equals("A") || ultimo2.equals("E") || ultimo2.equals("I") || ultimo2.equals("O") || ultimo2.equals("U")) {
            return "El último carácter es una vocal";
        }
        else{
          return "El último carácter es una consonante";
                  
        }
        
    }
    public String comparacion(){
        
        if ((texto.charAt(texto.length()-1)==(texto.charAt(0)))) {
            return "El primer caráter y el último del texto son iguales";
        }
        else{
          return "Primer y Ultimo carácter son distintos";
                  
        }
       
        }
}
