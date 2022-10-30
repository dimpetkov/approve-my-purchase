package purchases.approve.handlers.manager;

import purchases.approve.common.Type;
import purchases.approve.entity.Product;

import java.util.Arrays;
import java.util.List;

public interface ManagerPurchaseLimits {
    /**
     * Holds a list of products the role can approve, and the purchase limits.
     */
    List<Product> managerPurchaseLimits = Arrays.asList(
            new Product(Type.CONSUMABLES, 300),
            new Product (Type.CLERICAL, 500),
            new Product(Type.GADGETS, 1000),
            new Product(Type.GAMING, 3000),
            new Product(Type.PC, 5000)
    );

}
