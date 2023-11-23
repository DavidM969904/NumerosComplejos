/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeroscomplejos;

/**
 *
 * @author PABLO
 */
public class NumerosComplejos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        NumeroComplejo num1 = new NumeroComplejo(4,18);
        NumeroComplejo num2 = new NumeroComplejo(4,-45);
        NumeroComplejo suma = num1.suma(num2);
        System.out.println("La suma es: " + suma);
    }
}
