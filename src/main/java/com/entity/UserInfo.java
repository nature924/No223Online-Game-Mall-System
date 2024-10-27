package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 用户邮箱
     */
	private String email;
    /**
     * 用户头像
     */
	private String uimage;
    /**
     * 用户性别
     */
	private String sex;
    /**
     * 游戏服务器
     */
	private String server;
    /**
     * 1正常 0封号
     */
	private Integer userstatus;
    /**
     * 注册时间
     */
	private Date createtime;
    /**
     * 验证码
     */
	private String vercode;
    /**
     * 在线状态
     */
    private String status;//在线状态 online：在线、hide：隐身

    //补充的属性
    private String id; //我的ID
    private String sign; //我的签名
    private String avatar;//我的头像
    private String content;   //聊天内容
    private String type; //消息类型
    private String toid; //聊天窗口的选中的用户或者群组的id
    private Date sendtime;  //消息发送时间

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserid() {
        return userid;
    }

    public UserInfo setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public UserInfo setRoleid(Integer roleid) {
        this.roleid = roleid;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserInfo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserInfo setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public UserInfo setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUimage() {
        return uimage;
    }

    public UserInfo setUimage(String uimage) {
        this.uimage = uimage;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public UserInfo setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getServer() {
        return server;
    }

    public UserInfo setServer(String server) {
        this.server = server;
        return this;
    }



    public Integer getUserstatus() {
        return userstatus;
    }

    public UserInfo setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
        return this;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public UserInfo setCreatetime(Date createtime) {
        this.createtime = createtime;
        return this;
    }

    public String getVercode() {
        return vercode;
    }

    public UserInfo setVercode(String vercode) {
        this.vercode = vercode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getId() {
        return id;
    }

    public UserInfo setId(String id) {
        this.id = id;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public UserInfo setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserInfo setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getContent() {
        return content;
    }

    public UserInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public String getType() {
        return type;
    }

    public UserInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getToid() {
        return toid;
    }

    public UserInfo setToid(String toid) {
        this.toid = toid;
        return this;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public UserInfo setSendtime(Date sendtime) {
        this.sendtime = sendtime;
        return this;
    }
}
