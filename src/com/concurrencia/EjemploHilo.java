package com.concurrencia;

public class EjemploHilo extends Thread{

    private int id;

    public EjemploHilo(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        try{
            
            System.out.println("Soy un hilo");
            Thread.sleep(4000);
            System.out.println("El hilo "+id);
            Thread.sleep(4000);
            System.out.println("Fin del hilo");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}
