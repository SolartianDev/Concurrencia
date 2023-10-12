
package com.concurrencia;


import java.util.concurrent.CyclicBarrier;

public class EjemploCyclicBarrier {
    public static void main(String[] args) {
        final int numberOfThreads = 3;
        CyclicBarrier barrera = new CyclicBarrier(numberOfThreads, () -> {
            System.out.println("Todos los hilos han llegado a la barrera. Ahora pueden continuar.");
        });

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(() -> {
                try {
                    
                    System.out.println("Hilo " + Thread.currentThread().getId() + " llegó a la barrera.");
                    barrera.await(); // Espera a que todos los hilos lleguen a la barrera
                    System.out.println("Hilo " + Thread.currentThread().getId() + " continuando después de la barrera.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
