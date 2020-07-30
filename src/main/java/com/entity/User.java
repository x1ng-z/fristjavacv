package com.entity;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;

/**
 * @author zzx
 * @version 1.0
 * @date 2020/7/28 13:50
 */

@Alias("user")
public class User {
    private int pkuse;
    private String usename;
    private String password;

    public int getPkuse() {
        return pkuse;
    }

    public void setPkuse(int pkuse) {
        this.pkuse = pkuse;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
