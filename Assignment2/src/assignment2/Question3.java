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
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scn= new Scanner(System.in);  // We have the Scanner class.
        String password,user; //We have 2 different Strings.
        password="password"; //This is the password.
        int attempt=3; //User has 3 attempts to enter the password.

         do //Here is do while loop.
        {
            System.out.println("Enter your password:"); //User enters the password
            user=scn.next();
            if(password.equals(user))
        {
            System.out.println("Password Accepted !!!"); //If the password is correct, print that password is accepted and break out of the loop.
            break;
        }
            
            System.out.println("Incorrect Password, Please re-enter password "+attempt+" tries left:"); //Loop will continue until the attemps are over and attempts deacrese until the last one.
            attempt--;
            
            if(attempt==-1) //If the system reaches the last attempt,
         {
             System.out.println("Reset Password"); // Print user to reset their password.
         }
        }
        while(attempt>-1); //Condition of the loop.
            
}
}