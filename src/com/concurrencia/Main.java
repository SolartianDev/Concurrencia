package com.concurrencia;

public class Main {
    public static void main(String args[]) {  // (1) Método principal de la clase Main.

        // Creamos una instancia de MiRunnable
        MiRunnable miRunnable = new MiRunnable();  // (2) Creamos una instancia de la clase MiRunnable.

        // Creamos dos hilos utilizando la misma instancia de MiRunnable
        Thread hilo1 = new Thread(miRunnable);  // (3) Creamos un primer hilo y le pasamos la instancia de MiRunnable.
        Thread hilo2 = new Thread(miRunnable);  // (4) Creamos un segundo hilo y le pasamos la misma instancia de MiRunnable.

        // Iniciamos los hilos
        hilo1.start();  // (5) Iniciamos el primer hilo.
        hilo2.start();  // (6) Iniciamos el segundo hilo.

        // Creamos un nuevo hilo utilizando la clase EjemploHilo
        EjemploHilo hilo = new EjemploHilo(1);  // (7) Creamos una instancia de la clase EjemploHilo con ID 1.

        hilo.start();  // (8) Iniciamos el nuevo hilo.

        // El programa principal ha terminado, pero los hilos continúan ejecutándose.
    }
}






