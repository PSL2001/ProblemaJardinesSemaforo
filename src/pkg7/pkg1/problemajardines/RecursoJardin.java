/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg1.problemajardines;

/**
 *
 * @author usuario
 */
public class RecursoJardin {
     //clase que simula las entradas y las salidas al Jardín
    private int cuenta; //para contar las entradas y salidas al Jardín
    public RecursoJardin() {
        cuenta = 100; //inicalmente hay 50 personas en le jardín
    }
    public void incrementaCuenta() {
        //método que increamenta en 1 la varibale cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
                + "----- Entra en Jardín");
        //muestra el hilo que entra en el método
        cuenta++;
        System.out.println(cuenta + " en jardín");
        //cuenta cada acceso al jardín y muestra el número de accesos
    }
   public  void  decrementaCuenta() {
        //método que decrementa en 1 la varibale cuenta
        System.out.println("hilo " + Thread.currentThread().getName()
                + "----- Sale de Jardín");
        //muestra el hilo que sale en el método
        cuenta--;
        System.out.println(cuenta + " en jardín");
        //cuenta cada acceso al jardín y muestra el número de accesos
    }
}
