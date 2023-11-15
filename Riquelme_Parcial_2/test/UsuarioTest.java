import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    private static Usuario usr;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void antesDeTodo() {
        usr = new Usuario("Juanjo", 1212);
        System.out.println("TEST de usuario");
    }
    
    @AfterClass
    public static void despuesDeTodo() {
        System.out.println("Fin de las pruebas " + java.time.LocalDate.now().minusDays(1));
    }
    
    @Before
    public void antesDeCadaTest() {
        System.out.println("---------------------------");
    }
    
    @After
    public void despuesDeCadaTest() {
        System.out.println("---------------------------");
    }

    @Test
    public void testUsuariosDiferentes() {
        Usuario u1 = new Usuario("Usuario1", 1111);
        Usuario u2 = new Usuario("Usuario2", 2222);
        assertNotSame("Mismo usuario", u1, u2);
    }

    @Test
    public void testValidarUsr() {
        assertFalse(usr.validarPassword(2222));
    }
    
    @Test
    public void testValidarEmail() {
        String email = "*****@*****.**";
        assertTrue(email.length() < 20 && email.contains("@") && email.contains("."));
    }
    
     @Test
    public void testCambioPass() {
        String newPass = "1234";
        usr.cambioPassword(newPass);
        assertEquals(Integer.parseInt(newPass), usr.getPassword());
        System.out.println("Contraseña cambiada exitosamente a " + usr.getPassword());
    }
    
    @Test(timeout = 30)
    public void testDelay() throws InterruptedException {
        usr.delay(50);
    }
}
