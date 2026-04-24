package com.javaproject.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import plugins.DatabaseService;
import plugins.PluginAConfig;
import plugins.PluginLoader;
import plugins.PluginService;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		PluginLoader loader = new PluginLoader();

		loader.loadPlugin(PluginAConfig.class);
	}

}
