package com.iiot.business.domain;

import com.iiot.common.annotation.Excel;
import com.iiot.common.core.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 油桶字段对象 xt_oil_drum
 *
 * @author desom
 * @date 2020-05-15
 */
@AllArgsConstructor
@NoArgsConstructor
public class XtOilDrum extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 部门id
     */
    @Excel(name = "部门id")
    private Long deptId;

    /**
     * 油桶编号
     */
    @Excel(name = "油桶编号")
    private String oilCode;

    /**
     * 油品名称
     */
    @Excel(name = "油品名称")
    private String oilName;

    /**
     * 品牌厂商
     */
    @Excel(name = "品牌厂商")
    private String vendor;


    /**
     * 设备号
     */
    @Excel(name = "设备号")
    private String bindDevCode;
    /**
     * 油桶容量(l)
     */
    @Excel(name = "油桶容量(l)")
    private Double tankCapacity;

    /**
     * 油桶余量(l)
     */
    @Excel(name = "油桶余量(l)")
    private Double remainAmount;

    /**
     * 绑定部门id
     */
    @Excel(name = "绑定部门id")
    private Long bindDeptId;

    /**
     * 绑定时间
     */
    @Excel(name = "绑定时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bindTime;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 0 非绑定状态 1 绑定状态
     */
    private String bindStatus;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getOilCode() {
        return oilCode;
    }

    public void setOilCode(String oilCode) {
        this.oilCode = oilCode;
    }

    public String getOilName() {
        return oilName;
    }

    public void setOilName(String oilName) {
        this.oilName = oilName;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getBindDevCode() {
        return bindDevCode;
    }

    public void setBindDevCode(String bindDevCode) {
        this.bindDevCode = bindDevCode;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        BigDecimal bigDecimal = new BigDecimal(tankCapacity);
        this.tankCapacity = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Double getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Double remainAmount) {
        BigDecimal bigDecimal = new BigDecimal(remainAmount);
        this.remainAmount = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Long getBindDeptId() {
        return bindDeptId;
    }

    public void setBindDeptId(Long bindDeptId) {
        this.bindDeptId = bindDeptId;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }
}
