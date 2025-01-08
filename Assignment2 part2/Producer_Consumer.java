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
class Utility{
    int i;
    boolean bool=false;
    public synchronized void set(int i)throws InterruptedException{
        while(bool){
            wait();
        }
        this.i=i;
        bool=true;
        System.out.println("producer"+i);
        notify();
    }
     public synchronized void get()throws InterruptedException{
          while(!bool){
            wait();
        }
        this.i=i;
        bool=false;
        System.out.println("consumer"+i);
        notify();
    }
}
class Consumer implements Runnable{
      private Utility utility;
     public Consumer(Utility utility){
        this.utility=utility;
        Thread consumer=new Thread(this,"consumer");
        consumer.start();
     }
     public void run(){
         while(true){
             try {
                 utility.get();
                 Thread.sleep(500);
             } catch (InterruptedException ex) {
               ex.printStackTrace();
             }
         }
     }
    
     }
 
 class Producer implements Runnable{
      private Utility utility;
     public Producer(Utility utility){
        this.utility=utility;
        Thread producer=new Thread(this,"Producer");
        producer.start();
     }
     public void run(){
         int i=0;
         while(true){
             try {
                 utility.set(i++);
                   Thread.sleep(500);
             } catch (InterruptedException ex) {
                 ex.printStackTrace();
             }
         }
     }
 }
    public class Producer_Consumer{
        public static void main(String[]args){
            Utility u=new Utility();
            new Producer(u);
            new Consumer(u);
        }
    }