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
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新闻id
     */
	private String id;
    /**
     * 新闻标题
     */
	private String newstitle;
    /**
     * 新闻简介
     */
	private String newsdesc;
    /**
     * 新闻内容
     */
	private String newscontent;
    /**
     * 发布时间
     */
	private Date createtime;
    /**
     * 新闻发布者
     */
	private String username;
    /**
     * 图片
     */
    private String image;
    /**
     * 1正常  2删除
     */
	private Integer newsstatus;
    /**
     * 浏览量
     */
	private Integer rednumber;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public News setId(String id) {
        this.id = id;
        return this;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsdesc() {
        return newsdesc;
    }

    public void setNewsdesc(String newsdesc) {
        this.newsdesc = newsdesc;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public News setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNewsstatus() {
        return newsstatus;
    }

    public void setNewsstatus(Integer newsstatus) {
        this.newsstatus = newsstatus;
    }

    public Integer getRednumber() {
        return rednumber;
    }

    public void setRednumber(Integer rednumber) {
        this.rednumber = rednumber;
    }
}
