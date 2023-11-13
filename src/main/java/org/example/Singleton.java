package org.example;

public class Singleton{
     private static Singleton einzigeInstanz;

     //weitere nütliche Instanzvariablen

    private Singleton(){}

    // nicht Threadsicher (kein synchronized)
    public static Singleton getInstanz(){
        if (einzigeInstanz == null) {
            einzigeInstanz = new Singleton();
        }
        return einzigeInstanz;
        }
    // weitere nützliche Methoden
}