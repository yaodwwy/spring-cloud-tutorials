package cn.adbyte.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Adam Yao on 2018/6/26.
 */
@Service
public class RibbonBalanceService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/?name=" + name, String.class);
    }
}
