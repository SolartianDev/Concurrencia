package com.concurrencia;

class MiRunnable implements Runnable {  // (1) Define una clase llamada MiRunnable que implementa la interfaz Runnable.

    @Override
    public void run() {  // (2) Implementa el método run() que se ejecuta cuando se inicia un hilo.
        for (int i = 1; i <= 5; i++) {  // (3) Inicia un bucle que se ejecutará 5 veces.
            System.out.println(Thread.currentThread().getId() + " - Valor: " + i);  // (4) Imprime el ID del hilo actual y el valor de 'i'.
            try {
                Thread.sleep(1000);  // (5) Hace que el hilo actual duerma (se detenga) durante 1 segundo.
            } catch (InterruptedException e) {  // (6) Captura y maneja excepciones de tipo InterruptedException.
                System.out.println("Hilo interrumpido.");  // (7) Imprime "Hilo interrumpido" en caso de interrupción.
            }
        }
    }
}

