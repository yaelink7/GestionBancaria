/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gestionBancaria;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;

/**
 * Pruebas para la clase principal GestionBancaria
 */
public class GestionBancariaTest {
    
    private final InputStream systemInOriginal = System.in;
    private final PrintStream systemOutOriginal = System.out;
    private ByteArrayOutputStream salidaCapturada;
    
    public GestionBancariaTest() {
    }
    
    @Before
    public void setUp() {
        salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));
    }

    @After
    public void tearDown() {
        System.setIn(systemInOriginal);
        System.setOut(systemOutOriginal);
    }
    @Test
    public void testFlujoPrincipalConsola() {
        // 1. Simulamos navegar por tu menú real paso a paso:
        // Opción 4 (Cambiar nombre) -> "Mayra Min" 
        // Opción 1 (Depositar) -> 1500 
        // Opción 3 (Mostrar saldo) -> (Para que se imprima y podamos verificarlo)
        // Opción 5 (Salir) -> (Para que el ciclo termine)
        String entradasSimuladas = "4\nMayra Min\n1\n1500\n3\n5\n";
        System.setIn(new ByteArrayInputStream(entradasSimuladas.getBytes()));

        // 2. Ejecutamos el main
        GestionBancaria.main(new String[]{});

        // 3. Capturamos el resultado impreso
        String resultadoConsola = salidaCapturada.toString();

        // 4. Verificamos que contenga los datos que TU programa realmente imprime
        assertTrue("El menú debería mostrar el nuevo nombre del titular", 
                resultadoConsola.contains("Nombre Titular: Mayra Min"));
        
        assertTrue("El menú debería mostrar el saldo actualizado tras el depósito", 
                resultadoConsola.contains("Tu saldo es: 1500"));
        
        assertTrue("El programa debería imprimir el mensaje de salida", 
                resultadoConsola.contains("Saliendo del sistema..."));
        
        /*
        // Simulamos las entradas del teclado para el Scanner
        String entradasSimuladas = "Mayra Min\n1500.50\nEric Salas\n2500.00\n";
        System.setIn(new ByteArrayInputStream(entradasSimuladas.getBytes()));

        // Ejecutamos el main de tu clase corregida
        GestionBancaria.main(new String[]{});

        // Capturamos el resultado impreso
        String resultadoConsola = salidaCapturada.toString();

        // Verificamos que contenga los datos esperados
        assertTrue(resultadoConsola.contains("La cuenta del titular Eric Salas tiene un saldo inicial de: 2500.0"));
        assertTrue(resultadoConsola.contains("La cuenta del titular Mayra Min tiene un saldo inicial de: 1500.5"));
        */
    }

    /*
    @Test
    public void testMain() {
        
        // 1. Preparamos los datos que "escribiría" el usuario. 
        // El "5\n" representa el número 5 seguido de la tecla Enter.
        String entradaSimulada = "5\n";
        
        // 2. Guardamos la entrada original del sistema (el teclado real) para no romper nada
        InputStream inOriginal = System.in;
        
        try {
            // 3. Engañamos a Java para que System.in lea nuestra variable en lugar del teclado
            System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));
            
            // 4. Ejecutamos el método main
            String[] args = null;
            GestionBancaria.main(args);
            
            // 5. Si el programa llega hasta esta línea sin quedarse en un bucle infinito, el test pasa.
            assertTrue("El programa debería cerrarse correctamente al elegir la opción 5", true);
            
        } finally {
            // 6. Restablecemos el teclado a su estado normal obligatoriamente
            System.setIn(inOriginal);
        }
        
    }
    */
}
