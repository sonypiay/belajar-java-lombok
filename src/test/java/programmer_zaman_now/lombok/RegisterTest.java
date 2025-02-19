package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void testWith() {
        Register register1 = new Register("sonypiay", "123");
        Register register2 = register1.withUsername("eko");

        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
    }
}
