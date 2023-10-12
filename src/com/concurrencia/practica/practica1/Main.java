package com.concurrencia.practica.practica1;

// Importa las clases necesarias para trabajar con hilos y ejecutores
import java.util.concurrent.ExecutorService; // (1) Importa la clase ExecutorService del paquete java.util.concurrent.
import java.util.concurrent.Executors; // (2) Importa la clase Executors del paquete java.util.concurrent.
import java.util.concurrent.Future; // (3) Importa la clase Future del paquete java.util.concurrent.

// Clase principal del programa
public class Main {

    // Método principal del programa
    public static void main(String[] args) {
        // Configura el Executor (Ejecutor) utilizando un grupo de hilos (ThreadPool) de tamaño variable
        ExecutorService es = Executors.newFixedThreadPool(5); // (4) Crea un ExecutorService con un ThreadPool de 5 hilos.

        CountRunnable a = new CountRunnable(5, "A"); // (5) Crea una instancia de CountRunnable con 5 iteraciones y nombre "A".

        // Envía las instancias de CountRunnable al Executor para que sean ejecutadas
        es.submit(new CountRunnable(5, "A")); // (6) Envía una instancia de CountRunnable que cuenta hasta 5 con nombre "A".
        es.submit(new CountRunnable(5, "B")); // (7) Envía una instancia de CountRunnable que cuenta hasta 5 con nombre "B".
        es.submit(new CountRunnable(5, "C")); // (8) Envía una instancia de CountRunnable que cuenta hasta 5 con nombre "C".
        es.submit(a); // (9) Envía una instancia de CountRunnable que cuenta hasta 5 con nombre "A" nuevamente.

        Future futuro = es.submit(a); // (10) Envía una instancia de CountRunnable a través de un Future.

        try {
            System.out.println(futuro.get()); // (11) Intenta obtener el resultado del Future y lo imprime.
        } catch (Exception e) { // (12) Manejo de excepciones en caso de error al obtener el resultado del Future.
            System.out.println(e.getMessage());
        }

        // Detiene el ExecutorService después de que todos los hilos han terminado
        es.shutdown(); // (13) Detiene el ExecutorService.
    }
}


