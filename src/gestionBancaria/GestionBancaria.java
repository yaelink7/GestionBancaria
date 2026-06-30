/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionBancaria;


import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class GestionBancaria {

    /**
     * Default constructor
     * @param args
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Instanciamos el objeto de tu clase CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria("Nuevo usuario sin nombre", 0.0);
        int opcion;

        do {
            System.out.println("\n CUENTA BANCARIA");
            System.out.println("Nombre Titular: " + miCuenta.getTitular());
            System.out.println("Presiona un numero para realizar una operacion");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo actual");
            System.out.println("4. Cambiar nombre del titular");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar: $");
                    double deposito = scanner.nextDouble();
                    miCuenta.deposito(deposito);
                    break;
                case 2:
                    System.out.print("Monto a retirar: $");
                    double retiro = scanner.nextDouble();
                    miCuenta.retiro(retiro);
                    break;   
                case 3:
                    miCuenta.mostrarSaldo();
                    break;   
                case 4:
                    System.out.print("Ingresa el nuevo nombre: ");
                    String nuevoTitular = scanner.nextLine();
                    miCuenta.setTitular(nuevoTitular);
                    break;      
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción incorrecta. Por favor elige un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
        scanner.close();
    }
 }
