/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;
import Operaciones.hijaSuma;
/**
 *
 * @author jonathan
 */
public class PadreOperaciones {
    
    Scanner entrada = new Scanner(System.in);
    
    protected int num1;
    protected int num2;
    protected int oper;
    
    public int operacion(){//getters
    
        return oper;
    }
    
    public int dameNumero1(){//getters
    
        System.out.print("Escriba el primer numero: ");
        return num1 = entrada.nextInt();
    }
    
    public int dameNumero2(){//getters
        
        System.out.print("Escriba el segundo numero: ");
        return num2 = entrada.nextInt();
    }
   
    
     
}


