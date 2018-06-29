package cn.adbyte.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam Yao on 2018/6/26.
 */
@RestController
public class RibbonHystrixController {

    @Autowired
    RibbonHystrixService helloService;

    @RequestMapping(value = "/")
    public String hi(@RequestParam(required = false) String name){
        return helloService.hi(name);
    }


}