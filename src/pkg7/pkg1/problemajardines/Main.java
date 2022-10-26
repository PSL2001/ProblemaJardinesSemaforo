/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg1.problemajardines;
import java.util.concurrent.Semaphore;
/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();
        Semaphore sema = new Semaphore(1);
        //crea un objeto RecursoJardín

        for (int i = 1; i <= 10; i++) {
            (new Entra_Jardin("Entra" + i, jardin, sema)).start();
        }//entrada de 10 hilos al jardín

        for (int i = 1; i <= 15; i++) {
            (new Sale_Jardin("Sale" + i, jardin, sema)).start();
        }//salida de 15 hilos al jardín
    }
    
}
