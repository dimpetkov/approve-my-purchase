package purchases.approve.engine;

import purchases.approve.handlers.manager.Manager;
import purchases.approve.purchase.PurchaseList;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        PurchaseList.getPurchasesToApprove().forEach(manager::approve);
    }
}
