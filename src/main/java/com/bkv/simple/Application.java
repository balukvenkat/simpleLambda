package com.bkv.simple;

import com.bkv.simple.config.HelloConfig;
import com.bkv.simple.ctlr.HelloController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({HelloController.class, HelloConfig.class})
public class Application extends SpringBootServletInitializer implements ApplicationRunner{
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOG.info("Hello from HelloApplication");
		//String contxtPath = System.getProperty("server.servlet.context-path");
		System.setProperty("server.servlet.context-path", "/");
		String contxtPath = System.getProperty("server.servlet.context-path");
		LOG.info("contxtPath: "+contxtPath);
	}
}
