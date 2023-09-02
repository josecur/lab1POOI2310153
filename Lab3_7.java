/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author Alumno
 */
public class Lab3_7 {
    public static void main(String[] args) {
       
        int x=1, y=2, z=3;
        
        if (++x > y++ || x-- >0)
            z++;
        else
            z--;
        
        System.out.println(x+" "+y+" "+z);
                
        //El resultado es int 1 3 4;
        
    }
    
}
