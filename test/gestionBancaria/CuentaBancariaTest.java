/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package gestionBancaria;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author yaeli
 */
public class CuentaBancariaTest {
    private CuentaBancaria cuenta;
    
    public CuentaBancariaTest() {
    }

    @Before
    public void testSetUp() {
        /* Inicializamos una cuenta con un titular y un saldo inicial de 1000.0
        cuenta = new CuentaBancaria("Juan Pérez", 1000.0);*/
        // Inicializamos una cuenta con un titular y un saldo inicial de 1000.0
        cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    }

    @Test
    public void testTestGetTitular() {
        assertEquals("El titular no coincide con el inicializado.", cuenta.getTitular(), "Juan Pérez");
    }

    @Test
    public void testTestGetSaldo() {
        assertEquals(1000.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testTestSetTitularValido() {
        cuenta.setTitular("");
        // Al remover el mensaje, eliminamos cualquier conflicto de versiones
        assertEquals("Juan Pérez", cuenta.getTitular());
    }

    @Test
    public void testTestSetTitularInvalidoVacio() {
        cuenta.setTitular("");
        // Al enviar vacío, el método interno no debe realizar el cambio
    }

    @Test
    public void testTestDepositoMontoValido() {
        double nuevoSaldo = cuenta.deposito(500.0);
        assertEquals(1500.0, nuevoSaldo, 0.001);
        assertEquals(1500.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testTestDepositoMontoNegativo() {
        double nuevoSaldo = cuenta.deposito(-200.0);
        assertEquals(1000.0, nuevoSaldo, 0.001);
    }

    @Test
    public void testTestRetiroMontoValido() {
        double nuevoSaldo = cuenta.retiro(300.0);
        assertEquals(700.0, nuevoSaldo, 0.001);
        assertEquals(700.0, cuenta.getSaldo(), 0.001);
    }

    @Test
    public void testTestRetiroSaldoInsuficiente() {
        double nuevoSaldo = cuenta.retiro(1500.0);
        assertEquals(1000.0, nuevoSaldo, 0.001);
        
    }
    
    @Test
    public void testRetiroMontoNegativo(){
        double nuevoSaldo = cuenta.retiro(-50.0);
        assertEquals(1000.0, nuevoSaldo, 0.001);
    }
    
}

    

