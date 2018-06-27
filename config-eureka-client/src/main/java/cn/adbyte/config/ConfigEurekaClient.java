package cn.adbyte.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableEurekaClient
@SpringBootApplication
public class ConfigEurekaClient {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClient.class, args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/")
    public String hi(){
        return foo;
    }
}
