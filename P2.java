/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class P2 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.println("Enter Number 1 : ");
        n1 = input.nextInt();
        System.out.println("Enter Number 2 : ");
        n2 = input.nextInt();
        
        if (n1==n2)
        {
        System.out.println("They are equal in magnitude.");
        }
        
        if(n1>n2)
        {
        System.out.println("N1>N2");
        }
        
        if(n2>n1)
        {
        System.out.println("N2>N1");
        }
             
    }
    
}
