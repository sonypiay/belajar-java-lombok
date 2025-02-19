package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {

    @Test
    void createMember() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(null, null);
        });
    }

    @Test
    void testSetterNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("100", "Sony");

            member.setId(null);
            member.setName(null);
        });
    }

    @Test
    void testSayHello() {
        Member member = new Member("100", "Sony");
        String sayHello = member.sayHello("Eko");

        System.out.println(sayHello);
    }
}
