/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion5;

/**
 *
 * @author ChocoChiwi
 */
public class FuncionesCalculadora {
    private double num;
    private double num2;
    private String signo;
    private double total;
    private String acum="";
    private int cont;

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    public String d0(){
        acum=acum+"0";
    return acum;    
    }
    public String d1(){
        acum=acum+"1";
    return acum;    
    }
    public String d2(){
        acum=acum+"2";
    return acum;    
    }
    public String d3(){
        acum=acum+"3";
    return acum;    
    }
    public String d4(){
        acum=acum+"4";
    return acum;    
    }
    public String d5(){
        acum=acum+"5";
    return acum;    
    }
    public String d6(){
        acum=acum+"6";
    return acum;    
    }
    public String d7(){
        acum=acum+"7";
    return acum;    
    }
    public String d8(){
        acum=acum+"8";
    return acum;    
    }
    public String d9(){
        acum=acum+"9";
    return acum;    
    }
    public String dp(){
        cont+=1;
        if (cont==1) {
         acum=acum+".";   
        }
         
        return acum;
    }
    public String borrar(){
        acum="0";
        
        cont=0;
        return acum;
    }
    public String borrar2(){
        acum="0";
        
        
        return acum;
    }
    public String suma(){
        
        borrar();
        signo="+";
        return "Número anterior "+num;
    }
    public String resta(){
        
        borrar();
        signo="-";
        return "Número anterior "+num;
    }
    public String multi(){
        
        borrar();
        signo="*";
        return "Número anterior "+num;
    }
    public String div(){
        
        borrar();
        signo="/";
        return "Número anterior "+num;
    }
    public double ope(){
        
        if (signo.equals("+")) {
            total=num+num2;            
        }
        else if (signo.equals("-")){
            total=num-num2;
        }
        else if (signo.equals("*")){
            total=num*num2;
        }
        else if (signo.equals("/")){
            total=num/num2;
        }
        return total;
    }
    
}
