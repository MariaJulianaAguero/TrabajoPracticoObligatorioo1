//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
//El programa deberá después mostrar el resultado de la suma

package g1e1;

import java.util.Scanner;


public class G1E1 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer. nextInt();
        int result= num1+num2;
        System.out.println("El resultado es: "+result);
        
    }
    
}
