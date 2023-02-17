// package hello;

// import java.util.Arrays;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication
// @ComponentScan
// public class Application {

//     public static void main(String[] args) {
//         SpringApplication.run(Application.class, args);
//     }

//     @Bean
//     public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//         return args -> {

//             System.out.println("Let's inspect the beans provided by Spring Boot:");

//             String[] beanNames = ctx.getBeanDefinitionNames();
//             Arrays.sort(beanNames);
//             for (String beanName : beanNames) {
//                 System.out.println(beanName);
//             }

//         };
//     }

// }

package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by JavaDeveloperZone on 19-07-2017.
 */
@SpringBootApplication
@ComponentScan
// Using a root package also allows the @ComponentScan annotation to be used
// without needing to specify a basePackage attribute
public class Application {
    // @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args); // it will start application
    }
}
