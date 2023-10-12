package com.concurrencia;

public class Main {
    public static void main(String args[]) {
        // Creamos una instancia de MiRunnable
       MiRunnable miRunnable = new MiRunnable();

      // Creamos dos hilos utilizando la misma instancia de MiRunnable
        Thread hilo1 = new Thread(miRunnable);
        Thread hilo2 = new Thread(miRunnable);
        
        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
       
     EjemploHilo hilo = new EjemploHilo(1);
        
        hilo.start();
    }
}





