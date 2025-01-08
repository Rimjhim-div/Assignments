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

class Singleton{
   public  static volatile Singleton single;
  private Singleton(){
        
    }
  public static Singleton getObject() {
        if(single==null){
            synchronized(Singleton.class){
                if(single==null){
                    single=new Singleton();
            System.out.println(single.hashCode());
                }
            }
        }
    
      return single;
  }
}
    

class Thread1 extends Thread{
    public void run(){
         Singleton ob=Singleton.getObject();
        
}
}
class Thread2 extends Thread{
    public void run(){
         Singleton ob2=Singleton.getObject();
    }
}
public class SingletonClass {
        public static void main(String[]args){
            Thread1 t1=new Thread1();
            Thread1 t2=new Thread1();
            t1.start();
            // try{This is a one way of threadsaftey
//         Thread.sleep(10);
//    }catch(Exception e){}// one way to make singleton class thread safe
            t2.start();
        
        }
       
}

