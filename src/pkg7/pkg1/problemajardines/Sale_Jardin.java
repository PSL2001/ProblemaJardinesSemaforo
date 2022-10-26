package pkg7.pkg1.problemajardines;

import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Sale_Jardin extends Thread {
    //clase derivada de Thread que define un hilo
    private RecursoJardin jardin;
    private Semaphore semaforo;
    public Sale_Jardin(String nombre, RecursoJardin j, Semaphore s) {
        this.setName(nombre);
        this.jardin = j;
        this.semaforo = s;
    }

    @Override
    public void run() {
        try {
            semaforo.acquire();
        } catch(InterruptedException e) {
            System.err.println(e);
        }
        jardin.decrementaCuenta();
        semaforo.release();
    }
}
