package cn.adbyte.zipkin;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ZipkinServiceMiya {

    public static void main(String[] args) {
        LOG.warn("请在zipkin启动的情况下运行该项目\n" +
                "curl -sSL https://zipkin.io/quickstart.sh | bash -s\n" +
                "java -jar zipkin.jar");
        SpringApplication.run(ZipkinServiceMiya.class, args);
    }

    private static final Logger LOG = Logger.getLogger(ZipkinServiceMiya.class.getName());


    @RequestMapping("/hi")
    public String home(){
        LOG.log(Logger.Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOG.log(Logger.Level.INFO, "info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
