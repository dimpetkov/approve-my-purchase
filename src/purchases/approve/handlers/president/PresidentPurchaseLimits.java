package purchases.approve.handlers.president;

import purchases.approve.common.Type;
import purchases.approve.entity.Product;

import java.util.Arrays;
import java.util.List;

public interface PresidentPurchaseLimits {
    /**
     * Holds a list of products the role can approve, and the purchase limits.
     */
    List<Product> presidentPurchaseLimits = Arrays.asList(
            new Product(Type.CONSUMABLES, 1000),
            new Product (Type.CLERICAL, 2000),
            new Product(Type.GADGETS, 3000),
            new Product(Type.GAMING, 5000),
            new Product(Type.PC, 8000)
    );
}
