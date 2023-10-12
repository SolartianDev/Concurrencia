package com.concurrencia.practica.practica1; // (1) Este comentario indica el paquete al que pertenece la clase.

// Definición de la clase CountRunnable implementando la interfaz Runnable
public class CountRunnable implements Runnable { // (2) Este comentario explica la definición de la clase.

    // Variables finales para almacenar el conteo y el nombre del hilo
    final int count; // (3) Comentario explicando la variable 'count'.
    final String threadName; // (4) Comentario explicando la variable 'threadName'.

    // Constructor para inicializar las variables
    public CountRunnable(int count, String name) { // (5) Comentario del constructor
        this.count = count;
        this.threadName = name;
    }

    // Método run() que implementa la lógica del hilo
    @Override
    public synchronized void run() { // (6) Comentario del método 'run()'
        // Realizar el conteo usando un bucle for
        for (int i = 1; i <= count; i++) { // (7) Comentario del bucle 'for'.
            try {
                Thread.sleep(2000); // simula el tiempo que tarda una ejecucion
                // Imprimir el mensaje indicando el número de iteración y el nombre del hilo
                System.out.println("Hilo " + threadName + ": " + i); // (8) Comentario de la impresión del mensaje.
            } catch (InterruptedException e) { // (9) Comentario del bloque 'catch'.
                System.out.println(e.getMessage());
            }
        }
    }
}
