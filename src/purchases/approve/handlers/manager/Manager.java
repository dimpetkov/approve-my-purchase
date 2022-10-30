package purchases.approve.handlers.manager;

import purchases.approve.common.CommonMessages;
import purchases.approve.engine.Approver;
import purchases.approve.purchase.Purchase;
import purchases.approve.common.Role;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver implements ManagerPurchaseLimits{
    Role role = Role.MANAGER;

    @Override
    public void approve(Purchase purchase) {
        if (canApprove(purchase, managerPurchaseLimits)) {

            System.out.printf(CommonMessages.APPROVED, role.getRoleName(), purchase.getId(), purchase.getPrice());
            return;
        }

        System.out.printf(CommonMessages.NOT_APPROVED, purchase.getId(), role.getRoleName());
        next.approve(purchase);
    }

}
