package purchases.approve.handlers.vicepresident;

import purchases.approve.common.Type;
import purchases.approve.entity.Product;

import java.util.Arrays;
import java.util.List;

public interface VicePresidentLimits {
    /**
     * Holds a list of products the role can approve, and the purchase limits.
     */
    List<Product> vicePresidentPurchaseLimits = Arrays.asList(
            new Product(Type.CONSUMABLES, 700),
            new Product (Type.CLERICAL, 1500),
            new Product(Type.GADGETS, 2000),
            new Product(Type.GAMING, 4500),
            new Product(Type.PC, 6000)
    );
}
