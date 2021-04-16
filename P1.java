/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;



/**
 *
 * @author admin
 */
public class P1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        
        System.out.print("Enter N1: ");
        n1 = input.nextInt();
        System.out.print("Enter N2: ");
        n2 = input.nextInt();
        
       n3 = n1+n2;
       System.out.println("Sum = "+n3);
    }
    
}

