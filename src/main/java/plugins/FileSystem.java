package plugins;

public class FileSystem implements PluginService{

    public void execute(String username) {
        System.out.println("File System with user: " + username);
    }
}
