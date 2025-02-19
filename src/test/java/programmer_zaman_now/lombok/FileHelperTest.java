package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Test;

public class FileHelperTest {

    @Test
    void testPom() throws Exception {
        String text = FileHelper.loadFile("pom.xml");
        System.out.println(text);
    }
}
