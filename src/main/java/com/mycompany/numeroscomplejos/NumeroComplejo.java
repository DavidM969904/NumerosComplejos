/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeroscomplejos;

/**
 *
 * @author PABLO
 */
public class NumeroComplejo {
    //En esta parte de la estructura de java se puede escribir la parte logica es decir el codigo//
    private int img;
    private int real;
    
    public NumeroComplejo(int real, int img)
    {
        this.real = real;
        this.img = img;
    }
    
    public NumeroComplejo suma(NumeroComplejo numero)
    {
        int real = this.real + numero.real;
        int img = this.img + numero.img;
        return new NumeroComplejo(real,img);
    }
    
    public String toString()
    {
        if (img < 0)
        {
            return real + "" + img +"i";
        }
        return real + "+" + img + "i"; 
    }
}

