package com.bytedance.nacosprovidermovie.dao;

import com.bytedance.nacosprovidermovie.bean.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDao {
    @Value("${server.port}")//从配置文件中加载指定属性值
            Integer port;
    public Movie getMovieById(Integer id) {
        return new Movie(id , "诗酒趁年华，端口"+port);
    }
}
