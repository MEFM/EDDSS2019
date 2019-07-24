/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.*;

/**
 *
 * @author mynor
 */
public class Tarea1 {

    //-------------CRIBA DE ERATOSTENES-------------------
    //Ingreso del numero limite e impresión
    public static void numero(int n) {
        //Recorrido de 1 hasta el n limite
        for (int i = 1; i <= n; i++) {
            //Envio del indice o numero hacia la comprobación
            if (primo(i)) {
                System.out.println("Es primo: " + i);
            }
        }
    }

    //Comprobación de que es primo
    public static boolean primo(int numero) {
        int auxiliar;
        //Recorrido de 2 hasta el numero que se envia desde el indice
        for (int i = 2; i < numero; i++) {
            //numero modulo i 
            auxiliar = numero % i;
            /*
                En caso de que el resultado del modulo sea 0
                el numero no es primo por lo tanto no se imprimira.
             */
            if (auxiliar == 0) {
                return false;
            }
        }
        return true;
    }
    //----------------------------------------------------    

    
    //-------------Día de la semana según fecha-------------------
    public static void dia(int dia, int mes, int año) {
        String dias[] = {" Domingo ", " Lunes ", " Martes ", " Miercoles ", " Jueves ", " Viernes ", " Sabado "};

        //algoritmo de Zeller
        if ((dia < 32) && (mes < 13) && (año < 10000 && año >= 1700)) {//si la fecha es correcta

            int a = (14 - mes) / 12;
            int y = año - a;
            int m = mes + 12 * a - 2;
            int d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            System.out.print("El dia es :" + dias[d]);
        }
    }
    //------------------------------------------------------------
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        System.out.println("Que quiere ver primero?");
        System.out.println("1. Criba de Eratóstenes");
        System.out.println("2. Dias desde 1700");
        System.out.println("3. Salir.");
        System.out.println("Escriba que numero de opción"
                + " desea: ");
        menu = teclado.nextInt();
        do {
            switch (menu) {
                case 0:
                    System.out.println("Que quiere ver primero?");
                    System.out.println("1. Criba de Eratóstenes");
                    System.out.println("2. Dias desde 1700");
                    System.out.println("3. Salir.");
                    System.out.println("Escriba que numero de opción"
                            + " desea: ");
                    menu = teclado.nextInt();
                    break;
                case 1:
                    int n;
                    System.out.println("Ingrese el numero para ver sus primos"
                            + "anteriores.");
                    numero(n = teclado.nextInt());
                    System.out.println("");
                    menu = 0;
                    System.out.println("");
                    break;
                case 2:
                    try {
                        System.out.println("Ingrese dia fecha y hora en formato"
                                + " numerico, de lo contrario sera rechazado.");
                        int dia = teclado.nextInt();
                        int mes = teclado.nextInt();
                        int año = teclado.nextInt();
                        dia(dia, mes, año);
                        System.out.println("");
                        menu = 0;
                    } catch (Exception e) {
                        System.out.println("Manco meta bien los numeros");
                        menu = 0;
                        System.out.println("");
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
         
        } while (menu != 3);

    }

}
