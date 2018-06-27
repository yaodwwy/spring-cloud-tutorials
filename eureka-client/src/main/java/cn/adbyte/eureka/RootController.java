package cn.adbyte.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Adam Yao on 2018/6/26.
 */
@RestController
@RequestMapping("")
public class RootController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
