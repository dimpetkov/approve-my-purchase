package purchases.approve.common;

public enum Role {
    /**
     * Holds the different roles and their name String values, for easy use in methods and classes.
     * Can add new roles here
     */
    MANAGER("Manager"),
    DIRECTOR("Director"),
    VICE_PRESIDENT("Vice President"),
    PRESIDENT("President"),
    EXECUTIVE_MEETING("executive meeting");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
