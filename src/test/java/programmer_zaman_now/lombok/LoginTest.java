package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testLogin() {
        var login1 = Login.createEmpty();

        Assertions.assertNull(login1.getUsername());
        Assertions.assertNull(login1.getPassword());

        var login2 = Login.create("sonypiay", "123456");

        Assertions.assertEquals("sonypiay", login2.getUsername());
        Assertions.assertEquals("123456", login2.getPassword());
    }

    @Test
    void testToString() {
        var login = Login.create("sonypiay", "123456");

        Assertions.assertEquals("Login(username=sonypiay)", login.toString());
    }
}
