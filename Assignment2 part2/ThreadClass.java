/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author 91626
 */class Mythread implements Runnable{
    public  void  run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
   }
   catch(Exception e){
        
   }
}
    }
}
class Mythread1 extends Thread{
    public  void  run(){
        for(int i=10;i<20;i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
   }
   catch(Exception e){
     }
}
    }
}
public class ThreadClass {
    public static void main(String[]args){
         Mythread t1=new Mythread();
          Mythread1 t2=new Mythread1();
         Thread thread=new Thread(t1);
         Thread thread1=new Thread(t2);
         thread.start();
         thread1.start();
    }
}

