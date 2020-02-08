/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author reuder
 */
public class Calculadora {
    
    public String marca = "minha marca";
    public String modelo = "meu modelo";
    private double resultado;
    
    public double somar(double a, double b){
        return this.resultado = a+b;
    }
    
    public double subtrair(double a, double b){
        return this.resultado = a - b;
    }
    
    public double multiplicar(double a, double b){
        return this.resultado = a*b;
    }
    
    public double dividir(double a, double b){
        return this.resultado = a/b;
    }
    
    public String marcaDaCalc(String a){
        return this.marca=a;
    }
     public String modeloDaCalc(String a){
        return this.modelo=a;
    }
     
    
}
 