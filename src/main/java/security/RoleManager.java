package security;

import java.util.ArrayList;
import java.util.List;

public class RoleManager {

    private List<Role> roles = new ArrayList<>();

    public void addRole(Role role) {
        roles.add(role);
    }

    public List<Role> getRoles() {
        return roles;
    }
}
