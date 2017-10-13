package org.xfs.core.util;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PlatRouteInfoBO implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 运单号
     */
    private String wayBillNo;
    /**
     * 运单路由状态
     */
    private String operatorType;
    /**
     * 运单路由状态名称
     */
    private String operatorTypeName;
    /**
     * 操作内容
     */
    private String content;
    /**
     * 操作时间
     */
    private String statuson;
    /**
     * 操作人
     */
    private String driverName;
    /**
     * 操作电话
     */
    private String driverPhone;
    /**
     * 车牌号
     */
    private String carNo;
    /**
     * 经度
     */
    private BigDecimal lon;
    /**
     * 纬度
     */
    private BigDecimal lat;
    /**
     * 位置名称
     */
    private String placeName;

    /**
     * 接驳类型:1:临时接驳 2:中转接驳
     */
    private Integer transhipType;

    /**
     * 网点名称
     */
    private String branchName;

    public Integer getTranshipType() {
        return transhipType;
    }

    public void setTranshipType(Integer transhipType) {
        this.transhipType = transhipType;
    }

    public String getWayBillNo() {
        return wayBillNo;
    }

    public void setWayBillNo(String wayBillNo) {
        this.wayBillNo = wayBillNo;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getOperatorTypeName() {
        return operatorTypeName;
    }

    public void setOperatorTypeName(String operatorTypeName) {
        this.operatorTypeName = operatorTypeName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatuson() {
        return statuson;
    }

    public void setStatuson(String statuson) {
        this.statuson = statuson;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * @return the lon
     */
    public BigDecimal getLon() {
        return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    /**
     * @return the lat
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * @return the placeName
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * @param placeName the placeName to set
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
