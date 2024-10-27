package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Soldrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 售出记录id
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
     * 售价
     */
    private BigDecimal thinkmoney;
    /**
     * 售出时间
     */
    private Date soldtime;
    /**
     * 用户id
     */
    private String userid;
    /**
     * 1正常 2删除
     */
    private Integer soldstatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public Soldrecord setId(String id) {
        this.id = id;
        return this;
    }

    public String getCommid() {
        return commid;
    }

    public Soldrecord setCommid(String commid) {
        this.commid = commid;
        return this;
    }

    public String getCommname() {
        return commname;
    }

    public Soldrecord setCommname(String commname) {
        this.commname = commname;
        return this;
    }

    public String getCommdesc() {
        return commdesc;
    }

    public Soldrecord setCommdesc(String commdesc) {
        this.commdesc = commdesc;
        return this;
    }

    public BigDecimal getThinkmoney() {
        return thinkmoney;
    }

    public Soldrecord setThinkmoney(BigDecimal thinkmoney) {
        this.thinkmoney = thinkmoney;
        return this;
    }

    public Date getSoldtime() {
        return soldtime;
    }

    public Soldrecord setSoldtime(Date soldtime) {
        this.soldtime = soldtime;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public Soldrecord setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public Integer getSoldstatus() {
        return soldstatus;
    }

    public Soldrecord setSoldstatus(Integer soldstatus) {
        this.soldstatus = soldstatus;
        return this;
    }
}
