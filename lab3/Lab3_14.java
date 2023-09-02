/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Lab3_14 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int numSem;
       
       System.out.println("Ingrese un numero del 1 al 7 : ");
       numSem = in.nextInt();
       
       switch(numSem){
          
           case 1:
               System.out.println("Lunes");
               break;
               
           case 2:
               System.out.println("Martes");
               break;
               
           case 3:
               System.out.println("Miercoles");
               break;
               
           case 4:
               System.out.println("Jueves");  
               break;
               
           case 5:
               System.out.println("Viernes");
               break;
               
           case 6:
               System.out.println("Sabado");
               break;
               
           case 7:
               System.out.println("Domingo");
               break;
               
           default:
               System.out.println("numero no identificado");
               break;
       }
       
        
    }
    
}
