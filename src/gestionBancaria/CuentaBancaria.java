/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionBancaria;


import java.io.*;
import java.util.*;

/**
 * 
 */
public class CuentaBancaria {

    /**
     * Default constructor
     */
    public CuentaBancaria() {
    }

    /**
     * 
     */
    private String titular;

    /**
     * 
     */
    private double saldo;

    /**
     * @param String titular 
     * @param double saldo
     */
    public CuentaBancaria(String titular, double saldo) {
        // TODO implement here
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     * 
     */
    public String getTitular() {
      return titular; 
    }

    /**
     * 
     */
    public Double getSaldo() {
        // TODO implement here
        return saldo;
        // TODO implement here
    }

    /**
     * @param String Titular
     */
    public void setTitular(String titular) {
        // TODO implement here
        if(titular.isEmpty()){ 
			System.out.println("Cambio no realizado. Dato vacío o no válido"); 
		}else{ 
			this.titular=titular; 
		} 
    }

    /**
     * @param double monto
     */
    public double deposito(double monto) {
        // TODO implement here
        
		if(monto >= 0){    
			saldo+=monto;   
		}else{   
			System.out.println("El monto a depositar no es válido");  
		}   
			return saldo; 	
        // TODO implement here
    }

    /**
     * @param double monto
     */
    public double retiro(double monto) {
        // TODO implement here
        if( monto<=saldo && monto>0){   
			saldo=saldo-monto;       
		}else{   
			System.out.println("Saldo insuficiente");  
		}   
		return saldo;  
        // TODO implement here
    }

    /**
     * 
     */
    public void mostrarSaldo() {
        // TODO implement here
        System.out.println("Tu saldo es: " + saldo);   
    }

}