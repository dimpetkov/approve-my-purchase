package purchases.approve.common;

public class CommonMessages {
    /**
     * Common messages when print results.
     */
    public static final String APPROVED = "%s approved purchase with id %d that costs %.2f%n"; /* replacements: Role.getRoleName, id, cost */
    public static final String NOT_APPROVED = "Purchase with id %d needs approval from higher position than %s.%n"; /* replacements: id, Role.getRoleName */
    public static final String EXECUTIVE_MEETING = "Purchase with id %d that costs %.2f requires an approval of %s.%n"; /* replacements: id, cost, Role.getRoleName */
    
}