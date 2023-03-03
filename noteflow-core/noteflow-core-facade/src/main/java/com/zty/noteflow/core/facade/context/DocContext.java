package com.zty.noteflow.core.facade.context;

import java.time.LocalDateTime;

/**
 * 从源平台拉渠道的、尚未进行模板加工的 文章内容上下文
 * @author: tianyi.zeng
 * @create: 1/2/2023 - 下午 2:48
 */
public class DocContext {

    /**
     * 是否加工成功
     */
    private boolean success;

    /**
     * 最后一次修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 内容MD5
     */
    private String md5;

    private String markdown;

    private String html;

    private byte[] mp3FileByte;

    private byte[] videoFileByte;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public byte[] getMp3FileByte() {
        return mp3FileByte;
    }

    public void setMp3FileByte(byte[] mp3FileByte) {
        this.mp3FileByte = mp3FileByte;
    }

    public byte[] getVideoFileByte() {
        return videoFileByte;
    }

    public void setVideoFileByte(byte[] videoFileByte) {
        this.videoFileByte = videoFileByte;
    }
}
