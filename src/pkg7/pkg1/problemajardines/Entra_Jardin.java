/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg1.problemajardines;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.concurrent.Semaphore;

/**
 *
 * @author usuario
 */
public class Entra_Jardin extends Thread {
    private RecursoJardin jardin;
     private Semaphore semaforo;
    public Entra_Jardin(String nombre, RecursoJardin j, Semaphore s) {
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
        jardin.incrementaCuenta();
        semaforo.release();
        //invoca al método que incrementa la cuenta de accesos al jardín
    }
}
