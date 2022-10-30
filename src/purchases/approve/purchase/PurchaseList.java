package purchases.approve.purchase;

import java.util.ArrayList;
import java.util.List;
import static purchases.approve.common.Type.*;

public class PurchaseList {

    private static List<Purchase> purchaseListCreate() {
        List<Purchase> purchasesToApprove = new ArrayList<>();
        purchasesToApprove.add(new Purchase(1, CONSUMABLES, 15000));
        purchasesToApprove.add(new Purchase(2, PC, 5000));
        purchasesToApprove.add(new Purchase(3, PC, 5000));
        purchasesToApprove.add(new Purchase(4, CLERICAL, 3000));
        return purchasesToApprove;
    }

    public static List<Purchase> getPurchasesToApprove() {
        return purchaseListCreate();
    }

}
