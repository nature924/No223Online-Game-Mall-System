package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 视频
     */
    private String videourl;
    /**
     * 原价
     */
    private BigDecimal orimoney;
    /**
     * 售价
     */
    private BigDecimal thinkmoney;
    /**
     * 商品所在游戏服务器
     */
    private String server;
    /**
     * 发布时间
     */
    private Date createtime;
    /**
     * 修改时间
     */
    private Date updatetime;
    /**
     * 结束时间
     */
    private Date endtime;
    /**
     * 0违规 1正常 2删除  3待审核
     */
    private Integer commstatus;
    /**
     * 常用选项：自提，可小刀，不议价等选项
     */
    private String common;
    /**
     * 常用类别字段
     * */
    private String common2;
    /**
     * 商品其他图集合
     * */
    private List<String> otherimg;

    /**
     * 浏览量
     */
    private Integer rednumber;
    /**
     * 商品类别
     */
    private String category;
    /**
     * 简介图
     */
    private String image;
    /**
     * 用户id
     */
    private String userid;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCommid() {
        return commid;
    }

    public Commodity setCommid(String commid) {
        this.commid = commid;
        return this;
    }

    public String getCommname() {
        return commname;
    }

    public Commodity setCommname(String commname) {
        this.commname = commname;
        return this;
    }

    public String getCommdesc() {
        return commdesc;
    }

    public Commodity setCommdesc(String commdesc) {
        this.commdesc = commdesc;
        return this;
    }

    public String getVideourl() {
        return videourl;
    }

    public Commodity setVideourl(String videourl) {
        this.videourl = videourl;
        return this;
    }

    public BigDecimal getOrimoney() {
        return orimoney;
    }

    public Commodity setOrimoney(BigDecimal orimoney) {
        this.orimoney = orimoney;
        return this;
    }

    public BigDecimal getThinkmoney() {
        return thinkmoney;
    }

    public Commodity setThinkmoney(BigDecimal thinkmoney) {
        this.thinkmoney = thinkmoney;
        return this;
    }

    public String getServer() {
        return server;
    }

    public Commodity setServer(String server) {
        this.server = server;
        return this;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public Commodity setCreatetime(Date createtime) {
        this.createtime = createtime;
        return this;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public Commodity setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
        return this;
    }

    public Date getEndtime() {
        return endtime;
    }

    public Commodity setEndtime(Date endtime) {
        this.endtime = endtime;
        return this;
    }

    public Integer getCommstatus() {
        return commstatus;
    }

    public Commodity setCommstatus(Integer commstatus) {
        this.commstatus = commstatus;
        return this;
    }

    public String getCommon() {
        return common;
    }

    public Commodity setCommon(String common) {
        this.common = common;
        return this;
    }

    public String getCommon2() {
        return common2;
    }

    public Commodity setCommon2(String common2) {
       // this.common2 = common2;
        return this;
    }

    public List<String> getOtherimg() {
        return otherimg;
    }

    public Commodity setOtherimg(List<String> otherimg) {
        this.otherimg = otherimg;
        return this;
    }

    public Integer getRednumber() {
        return rednumber;
    }

    public Commodity setRednumber(Integer rednumber) {
        this.rednumber = rednumber;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Commodity setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Commodity setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUserid() {
        return userid;
    }

    public Commodity setUserid(String userid) {
        this.userid = userid;
        return this;
    }
}
