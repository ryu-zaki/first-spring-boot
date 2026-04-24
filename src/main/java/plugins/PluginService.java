package plugins;

public class PluginService {

    private final DatabaseService databaseService;

    public PluginService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }


    public void executeDatabase(String username) {
        this.databaseService.execute(username);
    }
}
