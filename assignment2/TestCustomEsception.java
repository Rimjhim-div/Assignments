/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author 91626
 */
class InvalidAgeexception extends Exception {
    public InvalidAgeexception(String str){
        super(str);
    }
}

public class TestCustomEsception {
    static void validate (int age) throws InvalidAgeexception{    
       if(age < 18){  
  
       
        throw new InvalidAgeexception("age is not valid to vote");    
    }  
       else {   
        System.out.println("Eligible");   
        }   
     }    
  
    
    public static void main(String args[])  
    {  
        try  
        {  
           
            validate(13);  
        }  
        catch (InvalidAgeexception ex)  
        {  
            System.out.println(" exception handled");  
    
           
            System.out.println("Exception occured: " + ex);  
        }  
  
       
    }  
}  

