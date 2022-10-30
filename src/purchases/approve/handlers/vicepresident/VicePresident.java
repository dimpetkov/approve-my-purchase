package purchases.approve.handlers.vicepresident;

import purchases.approve.common.CommonMessages;
import purchases.approve.engine.Approver;
import purchases.approve.purchase.Purchase;
import purchases.approve.common.Role;

/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver implements VicePresidentLimits {
    Role role = Role.VICE_PRESIDENT;
    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase, vicePresidentPurchaseLimits)) {
            System.out.printf(CommonMessages.APPROVED, role.getRoleName(), purchase.getId(), purchase.getPrice());
            return;
        }
        System.out.printf(CommonMessages.NOT_APPROVED, purchase.getId(), role.getRoleName());
        next.approve(purchase);
    }
}
