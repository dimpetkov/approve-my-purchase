package purchases.approve.entity;

import purchases.approve.common.Type;

public class Product {
    Type productName;
    int priceLimit;

    public Product(Type productName, int priceLimit) {
        this.productName = productName;
        this.priceLimit = priceLimit;
    }

    public Product() {
    }

    public Type getProductName() {
        return productName;
    }

    public int getPriceLimit() {
        return priceLimit;
    }
}
