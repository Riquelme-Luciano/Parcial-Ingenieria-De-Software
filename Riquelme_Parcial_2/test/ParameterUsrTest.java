import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

public class ParameterUsrTest {
    private String email;
    
    public ParameterUsrTest() {
    }
    
     public void parameterUsrTest(String email) {
        this.email = email;
    }
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"test@example.com"},
                {"user@mail.com"},
                // Add more test data as needed
        });
    }

    @Test
    public void testValidarEmail() {
        // Your test logic with the parameterized email
        System.out.println("Testing email: " + email);
    }
}
