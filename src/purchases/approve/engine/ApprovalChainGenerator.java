package purchases.approve.engine;

import purchases.approve.handlers.director.Director;
import purchases.approve.handlers.vicepresident.VicePresident;
import purchases.approve.handlers.executivemeeting.ExecutiveMeeting;
import purchases.approve.handlers.president.President;

/**
 * Used to generate chain of approval.
 * DO NOT MODIFY.
 */
public class ApprovalChainGenerator {

    public static Approver generate(Approver manager) {
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        Approver president = new President();

        return manager
                .registerNext(director)
                .registerNext(vicePresident)
                .registerNext(president)
                .registerNext(ExecutiveMeeting.getInstance());
    }
}
