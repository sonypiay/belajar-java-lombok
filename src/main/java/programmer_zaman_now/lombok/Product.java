package programmer_zaman_now.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString(exclude = "price")
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

    private final String id;

    private String name;

    private Long price;
}
