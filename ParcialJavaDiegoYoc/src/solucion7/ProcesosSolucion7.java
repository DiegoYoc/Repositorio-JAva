/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion7;

/**
 *
 * @author ChocoChiwi
 */
public class ProcesosSolucion7 {
    
    private String num;
    private int num2;
    private int i=0;
    private int convertir;
    private int dec;
    private String ob;//otra base
    private String convertido;
   
    


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

   
    public String convertir10(){
          dec=0;
          i=0;
        num2=Integer.parseInt(num);
        while(num2!=0){
            convertir=num2%10;
            dec+=convertir*Math.pow(2, i);
            
            i++;
            num2/=10;
            
        }
     return "Su número decimal es: "+dec;   
        
    }
    public String convertir8(){
          dec=0;
          i=0;
        num2=Integer.parseInt(num);
        while(num2!=0){
            convertir=num2%10;
            dec+=convertir*Math.pow(2, i);
            
            i++;
            num2/=10;
            
        }
      
       ob="";
       while ( dec > 0 ) {
         ob = dec % 8 + ob;
         dec /= 8;
       }    
        
        return ob;
    }
    public String convertir16(){
          dec=0;
          i=0;
        num2=Integer.parseInt(num);
        while(num2!=0){
            convertir=num2%10;
            dec+=convertir*Math.pow(2, i);
            
            i++;
            num2/=10;
            
        }
       ob="";
       convertido="";
       while ( dec> 0 ) {
         convertido=String.valueOf(dec % 16);
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
            convertido=String.valueOf(dec % 16);     
         }
         ob = convertido+ob;
         dec /= 16;
       }    
        
        return ob;
   
    }
    
            
    public String vacio(){
       return "Caja de texto vacia ingrese una valor";
    }
    
    
}
