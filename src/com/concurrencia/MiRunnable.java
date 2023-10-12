package com.concurrencia;

class MiRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Valor: " + i);
            try {
                Thread.sleep(1000); // Espera 1 segundo entre impresiones
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
            }
        }
    }
}
