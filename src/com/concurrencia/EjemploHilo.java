package com.concurrencia;

public class EjemploHilo extends Thread {

    private int id;  // (1) Declara una variable privada 'id' para identificar el hilo.

    public EjemploHilo(int id) {  // (2) Constructor que recibe un valor 'id' al crear una instancia del hilo.
        this.id = id;  // (3) Asigna el valor 'id' recibido al atributo 'id' de la instancia.
    }
    
    @Override
    public void run() {  // (4) Método run, que es ejecutado cuando el hilo se inicia.
        try {  // (5) Manejo de excepciones para capturar InterruptedException.

            System.out.println("Soy un hilo");  // (6) Imprime "Soy un hilo" en la consola.
            Thread.sleep(4000);  // (7) Hace que el hilo duerma (se detenga) durante 4 segundos.
            System.out.println("El hilo " + id);  // (8) Imprime el valor de 'id' en la consola.
            Thread.sleep(4000);  // (9) Hace que el hilo duerma nuevamente durante 4 segundos.
            System.out.println("Fin del hilo");  // (10) Imprime "Fin del hilo" en la consola.
        } catch (InterruptedException e) {  // (11) Captura y maneja excepciones de tipo InterruptedException.
            e.printStackTrace();  // (12) Imprime información sobre la excepción en la consola.
        }
    }
}

