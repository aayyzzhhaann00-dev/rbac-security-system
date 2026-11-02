package security;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecurityTest {

    @Test
    void testUserCreation() {
        assertNotNull(new User());
    }

    @Test
    void testRoleCreation() {
        assertNotNull(new Role());
    }

    @Test
    void testPermissionCreation() {
        assertNotNull(new Permission());
    }

    @Test
    void testSameRoleHierarchy() {
        Role role = new Role();
        RoleHierarchy hierarchy = new RoleHierarchy();
        assertTrue(hierarchy.hasHigherRole(role, role));
    }

    @Test
    void testDifferentRoleHierarchy() {
        RoleHierarchy hierarchy = new RoleHierarchy();
        assertFalse(hierarchy.hasHigherRole(new Role(), new Role()));
    }

    @Test
    void testAddRole() {
        RoleManager manager = new RoleManager();
        manager.addRole(new Role());
        assertEquals(1, manager.getRoles().size());
    }

    @Test
    void testEmptyRoleList() {
        RoleManager manager = new RoleManager();
        assertTrue(manager.getRoles().isEmpty());
    }

    @Test
    void testAccessWithValidData() {
        AccessControl control = new AccessControl();
        assertTrue(control.checkAccess(new User(), new Permission()));
    }

    @Test
    void testAccessWithNullUser() {
        AccessControl control = new AccessControl();
        assertFalse(control.checkAccess(null, new Permission()));
    }

    @Test
    void testAccessWithNullPermission() {
        AccessControl control = new AccessControl();
        assertFalse(control.checkAccess(new User(), null));
    }

    @Test
    void testAddAuditLog() {
        AuditLog log = new AuditLog();
        log.addLog("User logged in");
        assertEquals(1, log.getLogs().size());
    }

    @Test
    void testEmptyAuditLog() {
        AuditLog log = new AuditLog();
        assertTrue(log.getLogs().isEmpty());
    }
}
