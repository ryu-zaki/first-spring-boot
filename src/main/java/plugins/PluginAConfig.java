package plugins;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PluginAConfig {

    @Bean
    public DatabaseService databaseService() {
        return new DatabaseService();
    }

    @Bean
    public PluginService pluginService(
            DatabaseService databaseService
    ) {
        return new APIService();
    }

}
