/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3;
import java.io.*;
import java.util.*;
import java.math.*;

/**
 *
 * @author admin
 */
public class J3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double num,pow,res;
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        System.out.println("Enter the Power:");
        pow = sc.nextInt();
        res = Math.pow(num,pow);
        System.out.println("The result is: "+res);
        
    }
    
}
