package org.ms.eureka_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@EnableEurekaServer
@ComponentScan("org.ms.eureka_ms")
@Configuration
public class EurekaMsApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMsApplication.class, args);
  }
}
