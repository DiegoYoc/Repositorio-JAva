/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion2;

/**
 *
 * @author ChocoChiwi
 */
public class FuncionesTv {
    private String estado;
    private String texto;
    private String colori;
    private int cont=0;
    private int volumen;
    private int canales;
    
    public void asignarEstado(String estado){
        this.estado=estado;
       
    }
    public void asignarTexto(String texto){
        this.texto=texto;
    }
    public void asignarColor(String colori){
        this.colori= colori;
    }
    
    public  String cambiarTextoBoton(){
        if (texto=="Encender") {
            texto="Apagar";
            
            return texto;
        }
        else{
            texto="Encender";
            
            return texto;
        }
           
    }
    public String cambiarEstado(){
        
        if (estado=="Apagada") {
            estado="<html><center>Encendida<br>Volumen 1<br>Canal 1</center></html>";
           cont=1;
           volumen=1;
           canales=1;
            return estado;
           
            
        }
        else{
            estado="Apagada";
            cont=0;
            volumen=0;
            canales=0;
            return estado;
        }
    }
    public String cambiarColor(){
        if (colori=="red"){
             colori="green";
             return colori;
             
        }
        else{
            colori="red";
            return colori;
        }
    }
    public String subirVolumen(){
        
        if (cont==1) {
          
            if (volumen<30) {
               volumen+=1; 
            }
        
        return "Volumen " + volumen;
        } 
        else{
           
            
            return  "Apagada";
                   
        }
        
    }
    public String bajarVolumen(){
       
       if (cont==1) {
            if (volumen>1) {
               volumen-=1; 
            }
        
        return "Volumen " + volumen;
        }
        else{
            
            return  "Apagada";
                   
        }
    }
    
    public String canalArriba(){
        if (cont==1) {
            if (canales<75) {
               canales+=1; 
            }
        
        return "Canal " + canales;
        }
        else{
            canales=1;
            return  "Apagada";
                   
        }
    }
    public String canalAbajo(){
       if (cont==1) {
            if (canales>1) {
               canales-=1; 
            }
        
        return "Canal " + canales;
        }
        else{
            canales=1;
            return  "Apagada";
                   
        }
    }          
    
}
