package purchases.approve.handlers.executivemeeting;

import purchases.approve.common.CommonMessages;
import purchases.approve.common.Role;
import purchases.approve.engine.Approver;
import purchases.approve.entity.Product;
import purchases.approve.purchase.Purchase;

import java.util.List;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    Role role = Role.EXECUTIVE_MEETING;

    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(Purchase purchase) {

        System.out.printf(CommonMessages.EXECUTIVE_MEETING, purchase.getId(), purchase.getPrice(), role.getRoleName());
    }

    @Override
    protected boolean canApprove(Purchase purchase, List<Product> purchaseLimits) {
        return false;
    }
}
