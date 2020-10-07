package com.bytedance.nacosconsumeruser.service.impl;


import com.bytedance.nacosconsumeruser.bean.Movie;
import com.bytedance.nacosconsumeruser.service.MovieFeignClient;
import org.springframework.stereotype.Service;

//feign客户端的异常处理类，当feign客户端的方法调用失败时会调用当前类的实现方法处理请求
@Service //将异常类的对象注入到容器中
public class MovieFeignClientExceptionHandler implements MovieFeignClient {
    @Override
    public Movie getMovie(Integer id) {
        Movie movie = new Movie(-1000, "访问失败,请刷新重试");
        return movie;
    }
}
