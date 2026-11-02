package security;

public class RoleHierarchy {

    public boolean hasHigherRole(Role higher, Role lower) {
        return higher.equals(lower);
    }
}
