package com.j2.singleton.classic;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
    
  private Singleton(){}
  public static Singleton getInstance(){
    if(uniqueInstance ==null){
      System.out.println("Creating a new Instance");
      uniqueInstance = new Singleton();
    }
    System.out.println("NumCalled :"+ numCalled++);
    return uniqueInstance;
  }
  
  }
     public boolean isEmpty(){
       return empty;
     }
}