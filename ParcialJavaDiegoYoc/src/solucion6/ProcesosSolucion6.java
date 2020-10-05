/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion6;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion6 {
    private int num;
    private String conver;
    private String b4;
    private String convertido;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String binario(){
        conver=Integer.toBinaryString(num);
        return conver;
    }
    public String octal(){
        conver=Integer.toOctalString(num);
        return conver;
    }
    public String hexadecimal(){
        conver=Integer.toHexString(num);
        return conver;
    }
    public String base4(){
       
       b4="";
       while ( num > 0 ) {
         b4 = num % 4 + b4;
         num /= 4;
       }    
        
        return b4;
    }
    public String base2(){
       
       b4="";
       while ( num > 0 ) {
         b4 = num % 2 + b4;
         num /= 2;
       }    
        
        return b4;
    }
    public String base8(){
       
       b4="";
       while ( num > 0 ) {
         b4 = num % 8 + b4;
         num /= 8;
       }    
        
        return b4;
    }
    public String base16(){
       
       b4="";
       convertido="";
       while ( num > 0 ) {
         convertido=String.valueOf(num % 16);
         switch (convertido){
             case "10":
             convertido="A";  
             break;
             case "11":
             convertido="B";  
             break;
             case "12":
             convertido="C";  
             break;
             case "13":
             convertido="D";  
             break;
             case "14":
             convertido="E";  
             break;
             case "15":
             convertido="F";  
             break;
             default:
            convertido=String.valueOf(num % 16);     
         }
         b4 = convertido+ b4;
         num /= 16;
       }    
        
        return b4;
    }    
    public String vacio(){
       return "Caja de texto vacia ingrese una valor";
   }
    

}
