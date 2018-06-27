package cn.adbyte.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Adam Yao on 2018/6/26.
 */
@Component
public class FeignServiceHystrix implements IFeignService{
    @Override
    public String hi(String name) {
        return "FeignServiceHystrix.class : hi,"+name+",sorry,error!";
    }
}
