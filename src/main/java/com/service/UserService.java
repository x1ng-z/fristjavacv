package com.service;

import com.dao.UseMapper;
import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/28 15:20
 */
@Service
public class UserService {

    @Autowired
    private UseMapper userMapper;

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public User finduser(int id){
        return userMapper.finduser(id);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void insertuse(User user){
        userMapper.insertuse(user);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void deleteuse(int id){
        userMapper.deleteuse(id);
    }

}
