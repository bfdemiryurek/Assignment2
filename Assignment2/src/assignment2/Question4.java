/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Lenova
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scn= new Scanner(System.in);
        String password,user;
        password="password";
        int attempt=4;

        System.out.println("Enter your password:");
            user=scn.next();
            if(password.equals(user))
            {
                System.out.println("Password Accepted!");
            }
        else
            {    
        do
                   
        {
            attempt--;
            System.out.println("Incorrect Password, Please re-enter password "+attempt+" tries left:");
            
                }
        while(attempt>1);
        
    }
}
}    

