
package boletin7ejercicio3;

import javax.swing.JOptionPane;


public class Boletin7ejercicio3 {


    public static void main(String[] args) {
        int num1;
        String respuesta = JOptionPane.showInputDialog("teclea numero");
        num1 = Integer.parseInt(respuesta);
       
        if (num1>0){
            System.out.println(num1 + "el numero es positivo");
        }
        else if (num1<0) {
            System.out.println(num1 + "el numero es negativo");
        }
         else
            System.out.println(num1 + "el numero es 0");
        
     }
            
    
    
}
