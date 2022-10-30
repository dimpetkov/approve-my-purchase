package purchases.approve.handlers.president;

import purchases.approve.common.CommonMessages;
import purchases.approve.common.Role;
import purchases.approve.engine.Approver;
import purchases.approve.purchase.Purchase;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver implements PresidentPurchaseLimits{
    Role role = Role.PRESIDENT;

    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase, presidentPurchaseLimits)) {
            System.out.printf(CommonMessages.APPROVED, role.getRoleName(), purchase.getId(), purchase.getPrice());
            return;
        }

        System.out.printf(CommonMessages.NOT_APPROVED, purchase.getId(), role.getRoleName());
        next.approve(purchase);
    }
}
