package cn.adbyte.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Adam Yao on 2018/6/26.
 */
@FeignClient(value = "eureka-client", fallback = FeignServiceHystrix.class)
public interface IFeignService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
