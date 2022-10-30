package purchases.approve.engine;

import purchases.approve.purchase.Purchase;
import purchases.approve.entity.Product;

import java.util.List;

public abstract class Approver {

    protected Approver next;
    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(Purchase purchase);

    protected boolean canApprove(Purchase purchase, List<Product> purchaseLimits) {
        double purchaseLimit = purchaseLimits.stream()
                .filter(product -> product.getProductName() == purchase.getType())
                .findFirst().get().getPriceLimit();
        return purchase.getPrice() <= purchaseLimit;
    }
    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
