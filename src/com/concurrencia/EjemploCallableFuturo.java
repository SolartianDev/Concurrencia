
package com.concurrencia;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EjemploCallableFuturo {
    


    public static void main(String[] args) {
        // Crea un ExecutorService con un hilo
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Crea una tarea Callable
        Callable<String> tarea = () -> {
            Thread.sleep(2000); // Simula una operación que lleva tiempo
            return "Resultado de la tarea";
        };

        // Envía la tarea al ExecutorService y obtén un Future
        Future<String> futuro = executorService.submit(tarea);

        // Realiza otras operaciones mientras la tarea se está ejecutando

        try {
            // Obtiene el resultado de la tarea (espera si aún no está disponible)
            String resultado = futuro.get();
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Apaga el ExecutorService
        executorService.shutdown();
    }
}

