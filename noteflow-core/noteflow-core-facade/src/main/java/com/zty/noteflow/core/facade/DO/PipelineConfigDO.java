package com.zty.noteflow.core.facade.DO;

import java.util.Date;

public class PipelineConfigDO {
    private Integer id;

    private Integer accountId;

    private Integer fileId;

    private Integer pipelineType;

    private Integer pullerMask;

    private Integer pusherMask;

    private String configJson;

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

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(Integer pipelineType) {
        this.pipelineType = pipelineType;
    }

    public Integer getPullerMask() {
        return pullerMask;
    }

    public void setPullerMask(Integer pullerMask) {
        this.pullerMask = pullerMask;
    }

    public Integer getPusherMask() {
        return pusherMask;
    }

    public void setPusherMask(Integer pusherMask) {
        this.pusherMask = pusherMask;
    }

    public String getConfigJson() {
        return configJson;
    }

    public void setConfigJson(String configJson) {
        this.configJson = configJson;
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