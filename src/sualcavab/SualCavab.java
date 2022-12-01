/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sualcavab;

/**
 *
 * @author Umman
 */
public class SualCavab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User u = new User();
        u.b = 1;
        
        User u2 = new User();
        u2.b = 2;
        
        u2 = u;
        
        System.out.println(u2.b);
    }
    
}
