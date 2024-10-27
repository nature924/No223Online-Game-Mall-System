package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
	private String cid;
    /**
     * 商品id
     */
	private String commid;
    /**
     * 评论者id
     */
	private String cuserid;
    /**
     * 评论者昵称
     */
	private String cusername;
    /**
     * 评论者用户头像
     */
    private String cuimage;
    /**
     * 商品发布者id
     */
	private String spuserid;
    /**
     * 评论内容
     */
	private String content;
    /**
     * 评论时间
     */
	private Date commtime;
    /**
     * 0异常 1正常 2删除
     */
	private Integer commstatus;
    /**
     * 评论对应的回复集合
     */
    private List<Reply> replyLsit;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCid() {
        return cid;
    }

    public Comment setCid(String cid) {
        this.cid = cid;
        return this;
    }

    public String getCommid() {
        return commid;
    }

    public Comment setCommid(String commid) {
        this.commid = commid;
        return this;
    }

    public String getCuserid() {
        return cuserid;
    }

    public Comment setCuserid(String cuserid) {
        this.cuserid = cuserid;
        return this;
    }

    public String getCusername() {
        return cusername;
    }

    public Comment setCusername(String cusername) {
        this.cusername = cusername;
        return this;
    }

    public String getCuimage() {
        return cuimage;
    }

    public Comment setCuimage(String cuimage) {
        this.cuimage = cuimage;
        return this;
    }

    public String getSpuserid() {
        return spuserid;
    }

    public void setSpuserid(String spuserid) {
        this.spuserid = spuserid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommtime() {
        return commtime;
    }

    public void setCommtime(Date commtime) {
        this.commtime = commtime;
    }

    public Integer getCommstatus() {
        return commstatus;
    }

    public Comment setCommstatus(Integer commstatus) {
        this.commstatus = commstatus;
        return this;
    }

    public List<Reply> getReplyLsit() {
        return replyLsit;
    }

    public Comment setReplyLsit(List<Reply> replyLsit) {
        this.replyLsit = replyLsit;
        return this;
    }
}
