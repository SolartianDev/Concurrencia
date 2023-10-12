
package com.concurrencia;


import java.util.concurrent.atomic.*;

public class EjemploAtomico {
    public static void main(String[] args) {
        // AtomicBoolean
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        System.out.println("AtomicBoolean: " + atomicBoolean.get());
        atomicBoolean.set(false);
        System.out.println("AtomicBoolean Actualizado: " + atomicBoolean.get());

        // AtomicInteger
        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println("AtomicInteger: " + atomicInteger.get());
        atomicInteger.set(20);
        System.out.println("AtomicInteger Actualizado: " + atomicInteger.get());
        atomicInteger.incrementAndGet();
        System.out.println("AtomicInteger Incrementado: " + atomicInteger.get());

        // AtomicLong
        AtomicLong atomicLong = new AtomicLong(100L);
        System.out.println("AtomicLong: " + atomicLong.get());
        atomicLong.set(200L);
        System.out.println("AtomicLong Actualizado: " + atomicLong.get());

        // AtomicReference
        AtomicReference<String> atomicReference = new AtomicReference<>("Hola");
        System.out.println("AtomicReference: " + atomicReference.get());
        atomicReference.set("Mundo");
        System.out.println("AtomicReference Actualizado: " + atomicReference.get());

        // AtomicIntegerArray
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(3);
        atomicIntegerArray.set(0, 1);
        atomicIntegerArray.set(1, 2);
        atomicIntegerArray.set(2, 3);
        System.out.println("AtomicIntegerArray[1]: " + atomicIntegerArray.get(1));

        // AtomicIntegerFieldUpdater
        MiClase myObject = new MiClase();
        AtomicIntegerFieldUpdater<MiClase> updater = AtomicIntegerFieldUpdater.newUpdater(MiClase.class, "miCampo");
        updater.getAndIncrement(myObject);
        System.out.println("miCampo Actualizado usando AtomicIntegerFieldUpdater: " + myObject.miCampo);
    }

    public static class MiClase {
        public volatile int miCampo;
    }
}


