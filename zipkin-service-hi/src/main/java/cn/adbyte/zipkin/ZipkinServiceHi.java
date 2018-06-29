package cn.adbyte.zipkin;

import brave.sampler.Sampler;
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
public class ZipkinServiceHi {

    public static void main(String[] args) {
        LOG.warn("请在zipkin启动的情况下运行该项目\n" +
                "curl -sSL https://zipkin.io/quickstart.sh | bash -s\n" +
                "java -jar zipkin.jar");
        SpringApplication.run(ZipkinServiceHi.class, args);
    }
    private static final Logger LOG = Logger.getLogger(ZipkinServiceHi.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Logger.Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        LOG.log(Logger.Level.INFO, "calling trace service-hi ");

        return "i'm service-hi";

    }

}
