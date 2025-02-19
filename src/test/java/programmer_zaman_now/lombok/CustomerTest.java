package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        Customer customer = new Customer();
        customer.setId("100");
        customer.setName("Sony");

        Assertions.assertEquals("100", customer.getId());
        Assertions.assertEquals("Sony", customer.getName());
    }

    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer("100", "Sony");

        Assertions.assertEquals("100", customer.getId());
        Assertions.assertEquals("Sony", customer.getName());
    }

    @Test
    void testEquals() {
        Customer customer1 = new Customer("100", "Sony");
        Customer customer2 = new Customer("100", "Sony");

        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());
    }
}
