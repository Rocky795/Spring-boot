package com.pratham.springboot;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableAsync
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("Hello");
	}

	 @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        
        // Set the core and max pool size to 4
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        
        // Set the thread name prefix
        executor.setThreadNamePrefix("default_task_executor_thread");
        
        // Initialize the executor
        executor.initialize();
        
        return executor;
    }
	

}
