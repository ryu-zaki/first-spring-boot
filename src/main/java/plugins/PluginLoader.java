package plugins;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PluginLoader {

    public void loadPlugin(Class<?> pluginConfig) {
        ApplicationContext context = new AnnotationConfigApplicationContext(pluginConfig);

        PluginService service = context.getBean(PluginService.class);

        service.execute("Jhonwell");
    }

}
