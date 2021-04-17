/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2;
import java.io.*;
import java.util.*;


/**
 *
 * @author admin
 */
public class J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name: "+name);

        System.out.println("Enter your no. ");
        int x = sc.nextInt();
        System.out.println("Square of no. = " + (x*x));

        
    }
    
}
