package com.zty.noteflow.core.facade.DO;

import java.util.Date;

public class AccountSecretDO {
    private Integer id;

    private Integer accountId;

    private Integer pipelineId;

    private Integer configType;

    private Integer sourceMask;

    private String configJson;

    private String token;

    private String key;

    private String rsapublic;

    private String rsaprivate;

    private Byte disabled;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public Integer getConfigType() {
        return configType;
    }

    public void setConfigType(Integer configType) {
        this.configType = configType;
    }

    public Integer getSourceMask() {
        return sourceMask;
    }

    public void setSourceMask(Integer sourceMask) {
        this.sourceMask = sourceMask;
    }

    public String getConfigJson() {
        return configJson;
    }

    public void setConfigJson(String configJson) {
        this.configJson = configJson;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRsapublic() {
        return rsapublic;
    }

    public void setRsapublic(String rsapublic) {
        this.rsapublic = rsapublic;
    }

    public String getRsaprivate() {
        return rsaprivate;
    }

    public void setRsaprivate(String rsaprivate) {
        this.rsaprivate = rsaprivate;
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}