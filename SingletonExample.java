package com.practice;

import java.util.Locale;

class Singleton{  
    private static Singleton single_instance = null;  
    int i;  
     private Singleton ()  
     {  
         i=90;  
     }  
     public static Singleton getInstance()  
     {  
         if(single_instance == null)  
         {  
             single_instance = new Singleton();  
         }  
         return single_instance;  
     }  
}  

public class SingletonExample {
	public static void main(String[] args) {
		Singleton first = Singleton.getInstance();  
        System.out.println("First instance integer value:"+first.i);  
        first.i=first.i+90;  
        Singleton second = Singleton.getInstance();  
        System.out.println("Second instance integer value:"+second.i);  
        
        Locale locale=Locale.getDefault();  
      //Locale locale=new Locale("fr","fr");//for the specific locale  
        
      System.out.println(locale.getDisplayCountry());  
      System.out.println(locale.getDisplayLanguage());  
      System.out.println(locale.getDisplayName());  
      System.out.println(locale.getISO3Country());  
      System.out.println(locale.getISO3Language());  
      System.out.println(locale.getLanguage());  
      System.out.println(locale.getCountry());  
	}
}
