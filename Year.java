/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.BufferedInputStream;
/**
 *
 * @author admin
 */
import java.io.*;
import java.util.*;
public class Year {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader bufread = new BufferedReader(istream);
        System.out.println("Please enter Name : ");
        String firstname = bufread.readLine();
        System.out.println("Please enter birth year : ");
        String bornyear = bufread.readLine();
        System.out.println("Hello "+firstname+" DOB"+bornyear);  
        String curryear = bufread.readLine();
        System.out.println("Your YOB is : " +curryear);
        int b = Integer.parseInt(bornyear);
        int c = Integer.parseInt(curryear);
        int age = b-c;
        System.out.println("Age = "+age);
        
    }
    
}
