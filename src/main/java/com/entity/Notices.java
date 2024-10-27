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
public class Notices implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 通知id
     */
	private String id;
    /**
     * 用户id
     */
	private String userid;
    /**
     * 通知内容
     */
	private String whys;
    /**
     * 是否阅读 0未阅读 1已阅读
     */
	private Integer isread;
    /**
     * 通知类型
     */
	private String tpname;
    /**
     * 通知时间
     */
	private Date nttime;
    /**
     * 是否为新通知 1是 2不是
     */
    private Integer latest;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public Notices setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public Notices setUserid(String userid) {
        this.userid = userid;
        return this;
    }

    public String getWhys() {
        return whys;
    }

    public Notices setWhys(String whys) {
        this.whys = whys;
        return this;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public String getTpname() {
        return tpname;
    }

    public Notices setTpname(String tpname) {
        this.tpname = tpname;
        return this;
    }

    public Date getNttime() {
        return nttime;
    }

    public void setNttime(Date nttime) {
        this.nttime = nttime;
    }

    public Integer getLatest() {
        return latest;
    }

    public void setLatest(Integer latest) {
        this.latest = latest;
    }
}
