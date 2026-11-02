package security;

public class AccessControl {

    public boolean checkAccess(User user, Permission permission) {
        return user != null && permission != null;
    }
}
