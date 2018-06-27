package cn.adbyte.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adam Yao on 2018/6/26.
 */
@RestController
public class FeignController {

    @Autowired
    IFeignService iFeignService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return iFeignService.hi(name);
    }
}
