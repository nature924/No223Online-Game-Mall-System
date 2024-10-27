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
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回复id
     */
	private String rid;
    /**
     * 评论id
     */
	private String cid;
    /**
     * 商品id
     */
	private String commid;
    /**
     * 被回复用户id
     */
	private String cuserid;
    /**
     * 被回复者昵称
     */
    private String cusername;
    /**
     * 商品发布者id
     */
	private String spuserid;
    /**
     * 回复内容
     */
	private String recontent;
    /**
     * 回复者id
     */
	private String ruserid;
    /**
     * 回复者昵称
     */
    private String rusername;
    /**
     * 回复者用户头像
     */
    private String ruimage;
    /**
     * 回复时间
     */
	private Date replytime;
    /**
     * 0异常 1正常 2删除
     */
	private Integer repstatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRid() {
        return rid;
    }

    public Reply setRid(String rid) {
        this.rid = rid;
        return this;
    }

    public String getCid() {
        return cid;
    }

    public Reply setCid(String cid) {
        this.cid = cid;
        return this;
    }

    public String getCommid() {
        return commid;
    }

    public Reply setCommid(String commid) {
        this.commid = commid;
        return this;
    }

    public String getCuserid() {
        return cuserid;
    }

    public Reply setCuserid(String cuserid) {
        this.cuserid = cuserid;
        return this;
    }

    public String getCusername() {
        return cusername;
    }

    public Reply setCusername(String cusername) {
        this.cusername = cusername;
        return this;
    }

    public String getSpuserid() {
        return spuserid;
    }

    public void setSpuserid(String spuserid) {
        this.spuserid = spuserid;
    }

    public String getRecontent() {
        return recontent;
    }

    public Reply setRecontent(String recontent) {
        this.recontent = recontent;
        return this;
    }

    public String getRuserid() {
        return ruserid;
    }

    public Reply setRuserid(String ruserid) {
        this.ruserid = ruserid;
        return this;
    }

    public String getRusername() {
        return rusername;
    }

    public Reply setRusername(String rusername) {
        this.rusername = rusername;
        return this;
    }

    public String getRuimage() {
        return ruimage;
    }

    public Reply setRuimage(String ruimage) {
        this.ruimage = ruimage;
        return this;
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public Integer getRepstatus() {
        return repstatus;
    }

    public void setRepstatus(Integer repstatus) {
        this.repstatus = repstatus;
    }
}
