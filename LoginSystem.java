
package loginsystem;

import java.util.*;
public class LoginSystem {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean k = true;

        String [][] account = new String [10][2];
        int count = 0;
        String user;
        String pass;
        
        while (k){
        
        
        System.out.println("===LOGIN SYSTEM===");
        System.out.println("[1]Login");
        int log = 1;
        System.out.println("[2]Register");
        int reg = 2;
        System.out.println("[3]Exit");
        int ex = 3;
            System.out.println("");
        
        int choose = sc.nextInt();sc.nextLine();
        
            if (choose==log){
                System.out.println("Enter Username: ");
                user = sc.nextLine();
                System.out.println("Enter Password: ");
                pass = sc.nextLine();
                
                boolean correct = false;
                
                for (int i = 0; i<count; i++){
                    if (account [i][0].equals(user) && account [i][1].equals(pass)){
                        correct = true;
                        break;
                            

                    }}
                    
                    if (correct){
                        System.out.println("Hello "+user+"!");
                    }else {
                        System.out.println("Invalid Username or Password!");
                    }
                }
                
             
            
            if (choose==reg){
                System.out.println("Enter Username: ");
                user = sc.nextLine();
                    
                
                boolean naa = false;
                    for (int i = 0; i<count; i++){
                        if (account [i][0].equals(user)){
                            naa = true;
                            break;
                        }}
                        
                        if (naa){
                            System.out.println("Username already exist!");
                        } else {
                        
                    
                
                System.out.println("Enter Password: ");
                pass = sc.nextLine();
                System.out.println("Confirm Password: ");
                String confi = sc.nextLine();
                
                if (confi.equals(pass)){
                    System.out.println("Successfully Registered!");
                    
                    account [count][0] = user;
                    account [count][1] = pass;
                    count++;
                    
                }else {System.out.println("Password and Confirm Password did not match!!");}
                
                        }
                    }
            
                System.out.println("");
        
            if (choose==ex){k = false;System.out.println("Goodbye!");k=false;}
        }

                }
            

                    
                
        
        }
        
        

        
    

    

