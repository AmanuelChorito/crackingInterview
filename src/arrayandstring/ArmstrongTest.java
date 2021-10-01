package arrayandstring;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongTest {
    private final  Armstrong armstrong=new Armstrong();
    @Test
    public void shouldreturnTrue() throws Exception {

        assertTrue(armstrong.isArmstrong(1634));
    }
    @Test
    public void ShouldReturnFalse() throws Exception {
        assertFalse(armstrong.isArmstrong(125));
    }

    @Test
    public void shouldReturnException() throws Exception{
        assertThrows(Exception.class, () -> armstrong.isArmstrong(-1));
    }
}