package security;

import java.util.ArrayList;
import java.util.List;

public class AuditLog {

    private List<String> logs = new ArrayList<>();

    public void addLog(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return logs;
    }
}
