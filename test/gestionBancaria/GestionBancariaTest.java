/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gestionBancaria;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas para la clase principal GestionBancaria
 */
public class GestionBancariaTest {
    
    public GestionBancariaTest() {
    }

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
}
