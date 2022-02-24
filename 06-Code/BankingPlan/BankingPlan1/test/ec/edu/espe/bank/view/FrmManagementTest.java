
package ec.edu.espe.bank.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan Shuguli , DEEE-ESPE
 */
public class FrmManagementTest {
    
    public FrmManagementTest() {
    }

    /**
     * Test of add method, of class FrmManagement.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float addend1 = 23.45F;
        float addend2 = 25.34F;
        FrmManagement instance = new FrmManagement();
        instance.add(addend1, addend2);
        float expResult = 48.79F;
        float result = (float) Double.sum(addend1, addend2);
        assertEquals(expResult, result, 0.001);
     
    }
    
    @Test
    public void testDeposit() {
        System.out.println("add");
        float addend1 = 25.45F;
        float addend2 = 25.34F;
        FrmManagement instance = new FrmManagement();
        instance.add(addend1, addend2);
        float expResult = 50.79F;
        float result = (float) Double.sum(addend1, addend2);
        assertEquals(expResult, result, 0.001);
    }
}