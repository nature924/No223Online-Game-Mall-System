package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hlt
 * @since 2019-12-25
 */
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@Data
@Accessors(chain = true)//链式写法
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录id
     */
	private String id;
    /**
     * 用户id
     */
	private String userid;
    /**
     * 角色id 1普通用户 2管理员 3超级管理员
     */
	private Integer roleid;
    /**
     * 用户名
     */
	private String username;
    /**
     * 用户密码
     */
	private String password;
    /**
     * 手机号
     */
    private String mobilephone;
    /**
     * 1正常 0封号
     */
	private Integer userstatus;
    /**
     * 验证码
     * */
    private String vercode;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public Login setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public Login setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public Login setRoleid(Integer roleid) {
        this.roleid = roleid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Login setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public Login setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
        return this;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public Login setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
        return this;
    }

    public String getVercode() {
        return vercode;
    }

    public Login setVercode(String vercode) {
        this.vercode = vercode;
        return this;
    }
}
