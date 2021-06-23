/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kit.doip.server.rest2doip;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main class starting the spring boot application.
 *
 */
@SpringBootApplication
@ComponentScan({"edu.kit.doip.server"})
public class Application {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    // TODO code application logic here
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {

      String[] providedBeans = ctx.getBeanDefinitionNames();
      Arrays.sort(providedBeans);
      System.out.println("List all sontrollers provided by Spring Boot:");

      for (String bean : providedBeans) {
        if (bean.contains("Controller"))
        System.out.println(bean);
      }

    };
  }

}
