/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Mail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
