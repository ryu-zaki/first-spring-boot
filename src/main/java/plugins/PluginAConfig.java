package plugins;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PluginAConfig {

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService();
    }

    @Bean
    public PluginService fileSystemService() {
        return new FileSystem();
    }

    @Bean
    public PluginService apiService(
            DatabaseService databaseService
    ) {
        return new APIService();
    }

}
