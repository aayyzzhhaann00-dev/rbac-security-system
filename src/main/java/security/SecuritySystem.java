package security;

public class SecuritySystem {

    private RoleManager roleManager;
    private AccessControl accessControl;
    private AuditLog auditLog;

    public SecuritySystem() {
        roleManager = new RoleManager();
        accessControl = new AccessControl();
        auditLog = new AuditLog();
    }
}
