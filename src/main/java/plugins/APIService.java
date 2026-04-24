package plugins;

public class APIService implements PluginService {

    public void execute(String username) {

        System.out.println("Execute from the API with user: " + username);

    }
}

