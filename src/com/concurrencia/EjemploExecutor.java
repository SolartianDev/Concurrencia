
package com.concurrencia;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjemploExecutor {

    public static void main(String[] args) {
        // Crea un Executor con un pool de 3 hilos
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Ejecuta tareas usando el Executor
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(new EjemploHilo(i));
        }
       executor.shutdown();
        // Espera un momento para que las tareas se completen
        try {
            Thread.sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}





