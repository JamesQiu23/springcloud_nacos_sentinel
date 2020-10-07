package com.bytedance.nacosconsumeruser.dao;

import com.bytedance.nacosconsumeruser.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUserById(Integer id){
        return new User(id , "王安石(feign)");
    }
}
