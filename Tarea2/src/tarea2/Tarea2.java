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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    static Bolsa bosla = new Bolsa();

    public static void main(String[] args) {
        // TODO code application logic here
        bosla.insertar(1);
        bosla.insertar(3);
        bosla.insertar(2);
        bosla.insertar(8);
        
        bosla.listar();
    }

}
