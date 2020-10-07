package com.bytedance.nacosconsumeruser.service;

import com.bytedance.nacosconsumeruser.bean.Movie;
import com.bytedance.nacosconsumeruser.service.impl.MovieFeignClientExceptionHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-provider-movie" ,fallback = MovieFeignClientExceptionHandler.class ) //需要将当前feign客户端绑定给Movie服务
//value是从nacos注册中心的页面上找到的另一个微服务的值，其实也是另一个微服务在Yml配置文件内的值
public interface MovieFeignClient {
    /**
     * 简单类型的数据：
     *         必须通过RequestParam绑定参数
     * 复杂类型的数据：对象、map、list
     *          必须使用@RequestBody将参数转为json传递
     * @param id
     * @return
     */
    //HTTP+JSON: url?id=1
    @GetMapping("/getMovie")
    public Movie getMovie(@RequestParam("id") Integer id);
}
