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
public class Collect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收藏id
     */
    private String id;
    /**
     * 商品id
     */
    private String commid;
    /**
     * 商品名
     */
    private String commname;
    /**
     * 商品描述
     */
    private String commdesc;
    /**
     * 收藏时间
     */
    private Date soldtime;
    /**
     * 0失效 1正常 2删除
     */
    private Integer collstatus;
    /**
     * 商品用户id
     */
    private String cmuserid;
    /**
     * 商品用户名
     */
    private String username;
    /**
     * 商品所在学校
     */
    private String server;
    /**
     * 收藏用户id
     */
    private String couserid;
    /**
     * 收藏操作：收藏or取消收藏
     */
    private Integer colloperate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public Collect setId(String id) {
        this.id = id;
        return this;
    }

    public String getCommid() {
        return commid;
    }

    public Collect setCommid(String commid) {
        this.commid = commid;
        return this;
    }

    public String getCommname() {
        return commname;
    }

    public Collect setCommname(String commname) {
        this.commname = commname;
        return this;
    }

    public String getCommdesc() {
        return commdesc;
    }

    public Collect setCommdesc(String commdesc) {
        this.commdesc = commdesc;
        return this;
    }

    public Date getSoldtime() {
        return soldtime;
    }

    public void setSoldtime(Date soldtime) {
        this.soldtime = soldtime;
    }

    public Integer getCollstatus() {
        return collstatus;
    }

    public void setCollstatus(Integer collstatus) {
        this.collstatus = collstatus;
    }

    public String getCmuserid() {
        return cmuserid;
    }

    public void setCmuserid(String cmuserid) {
        this.cmuserid = cmuserid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getServer() {
        return server;
    }

    public Collect setServer(String server) {
        this.server = server;
        return this;
    }

    public String getCouserid() {
        return couserid;
    }

    public Collect setCouserid(String couserid) {
        this.couserid = couserid;
        return this;
    }

    public Integer getColloperate() {
        return colloperate;
    }

    public void setColloperate(Integer colloperate) {
        this.colloperate = colloperate;
    }
}
