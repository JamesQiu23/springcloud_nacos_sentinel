package com.bytedance.nacosconsumeruser.service;

import com.bytedance.nacosconsumeruser.bean.User;
import com.bytedance.nacosconsumeruser.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    MovieFeignClient movieFeignClient;
    public Map<String, Object> getUserAndMovie(Integer id) {
        Map<String, Object> map = new HashMap();
        map.put("user",getUser(id));
        //查询电影信息存到map中：一会需要远程访问电影服务实现
        map.put("movie",movieFeignClient.getMovie(id));
        System.out.println(movieFeignClient.getMovie(id));
        return map;
    }
    public User getUser(Integer id) {

        return userDao.getUserById(id);
    }
}
