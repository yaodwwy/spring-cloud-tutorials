package cn.adbyte.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam Yao on 2018/6/27.
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/")
    public String hi(){
        return foo;
    }

}
