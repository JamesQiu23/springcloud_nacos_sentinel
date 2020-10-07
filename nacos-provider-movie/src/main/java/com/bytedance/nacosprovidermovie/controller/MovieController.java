package com.bytedance.nacosprovidermovie.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.bytedance.nacosprovidermovie.bean.Movie;
import com.bytedance.nacosprovidermovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//SpringCloud 微服务之间远程调用时，默认采用HTTP+JSON的方式传递数据
@RestController //表示当前Controller可以接受http请求，响应数据都是json格式
public class MovieController {

    @Autowired
    MovieService movieService;

    //获取每个项目启动时的端口号打印
    @Value("${server.port}")//从配置文件中加载指定属性值
    Integer port;

    //配置中心的dataId文件加载到本地后和application文件的使用方式一样
    @Value("myname")
    String myName;

    //查询电影的方法
    @GetMapping("/getMovie")
    public Movie getMovie(@RequestParam("id") Integer id){
        System.out.println("加载到的myName是"+myName);
        System.out.println("端口号为:" + port +" 的电影服务被访问了...");
        return movieService.getMovie(id);
    }

}
