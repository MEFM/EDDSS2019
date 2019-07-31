/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author mynor
 */
public class Bolsa {

    class Nodo {

        Object bolsa;
        Nodo siguiente;
    }

    Nodo primero;
    Nodo cola;

    public Bolsa() {
        primero = null;
        cola = null;
    }

    public void insertar(Object valor) {
        Nodo niu = new Nodo();
        niu.bolsa = valor;
        if (vacio(primero)) {
            primero = niu;
            cola = primero;
        } else {
            cola.siguiente = niu;
            niu.siguiente = primero;
            cola = niu;
        }
    }

    public boolean vacio(Nodo inicio) {
        return inicio == null;
    }

    public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!vacio(primero)) {
            // Crea una copia de la lista.
            Nodo aux = primero;
            // Posicion de los elementos de la lista.
            int i = 0;
            System.out.print("-> ");
            // Recorre la lista hasta llegar nuevamente al incio de la lista.
            do{
                // Imprime en pantalla el valor del nodo.
                System.out.print(i + ".[ " + aux.bolsa + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.siguiente;
                // Incrementa el contador de la posión.
                i++;
            }while(aux != primero);
        }
    }
}
