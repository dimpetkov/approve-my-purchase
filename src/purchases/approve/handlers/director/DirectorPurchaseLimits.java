package purchases.approve.handlers.director;

import purchases.approve.common.Type;
import purchases.approve.entity.Product;

import java.util.Arrays;
import java.util.List;

public interface DirectorPurchaseLimits {
    /**
     * Holds a list of products the role can approve, and the purchase limits.
     */
    List<Product> directorPurchaseLimits = Arrays.asList(
            new Product(Type.CONSUMABLES, 500),
            new Product (Type.CLERICAL, 1000),
            new Product(Type.GADGETS, 1500),
            new Product(Type.GAMING, 3500),
            new Product(Type.PC, 6000)
    );
}
