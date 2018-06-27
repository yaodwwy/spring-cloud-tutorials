package cn.adbyte.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * http://projects.spring.io/spring-cloud/spring-cloud.html#_spring_cloud_config
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 */
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer.class, args);
    }
}
