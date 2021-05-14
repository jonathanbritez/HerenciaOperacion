# HerenciaOperacion
ejercicio n°11


package Mail;

/**
 *
 * Realizar una suma y resta  de dos valores ingresados por el usuario utilizando herencia. 
 * Crear dos paquetes uno con la clase mail y la otra con las operaciones. 
 * Crear una clase padre y dos hijas(resta, suma); 
 * luego con la clase principal mail llamar a esas clases.
 */


import Operaciones.hijaResta;

import Operaciones.hijaSuma;

import java.util.Scanner;

public class Mail 
{

    
    public static void main(String[] args) 
    {
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿que operacion desea realizar: 1.Suma o 2.Resta ?");
        respuesta = entrada.nextLine();
        
        if(respuesta.equalsIgnoreCase("1")){
        
            hijaSuma suma = new hijaSuma();
            suma.dameNumero1();
            suma.dameNumero2();

            System.out.println(suma.operacionSuma());
        
        }else if(respuesta.equalsIgnoreCase("2")){
        
            hijaResta resta = new hijaResta();
            resta.dameNumero1();
            resta.dameNumero2();
        
            System.out.println(resta.operacionResta());
        
        }
        
        
    }
    
}





package Operaciones;

import java.util.Scanner;

import Operaciones.hijaSuma;

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



package Operaciones;


public class hijaResta extends PadreOperaciones{
    
     public int operacionResta(){
        
        
        return oper = num1 - num2;
        
    }
    
    
}

package Operaciones;

public class hijaSuma extends PadreOperaciones {
    
    public int operacionSuma(){
        
        
        return oper = num1 + num2;
        
    }

}
