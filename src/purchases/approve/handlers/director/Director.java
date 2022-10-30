package purchases.approve.handlers.director;

import purchases.approve.common.CommonMessages;
import purchases.approve.engine.Approver;
import purchases.approve.purchase.Purchase;
import purchases.approve.common.Role;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver implements DirectorPurchaseLimits{

    Role role = Role.DIRECTOR;

    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase, directorPurchaseLimits)) {
            System.out.printf(CommonMessages.APPROVED, role.getRoleName(), purchase.getId(), purchase.getPrice());
            return;
        }

        System.out.printf(CommonMessages.NOT_APPROVED, purchase.getId(), role.getRoleName());
        next.approve(purchase);
    }
}
