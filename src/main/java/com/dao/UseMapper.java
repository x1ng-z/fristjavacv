package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/28 15:05
 */
@Repository
public interface UseMapper {
    User finduser(int id);
    void insertuse(@Param("user") User user);
    void deleteuse(int id);
}
