package com.zty.noteflow.core.facade.context;

/**
 * 使用模板加工处理完成后的、即将用于发布上传的文件内容
 * @author: tianyi.zeng
 * @create: 1/2/2023 - 下午 2:51
 */
public class FileContext {

    /**
     * 是否发布成功
     */
    private boolean success;

    private String markdownFilePath;

    private byte[] markdownFileByte;

    private String htmlFilePath;

    private byte[] htmlFileByte;

    private String mp3FilePath;

    private byte[] mp3FileByte;

    private String videoFilePath;

    private byte[] viderFileByte;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMarkdownFilePath() {
        return markdownFilePath;
    }

    public void setMarkdownFilePath(String markdownFilePath) {
        this.markdownFilePath = markdownFilePath;
    }

    public byte[] getMarkdownFileByte() {
        return markdownFileByte;
    }

    public void setMarkdownFileByte(byte[] markdownFileByte) {
        this.markdownFileByte = markdownFileByte;
    }

    public String getHtmlFilePath() {
        return htmlFilePath;
    }

    public void setHtmlFilePath(String htmlFilePath) {
        this.htmlFilePath = htmlFilePath;
    }

    public byte[] getHtmlFileByte() {
        return htmlFileByte;
    }

    public void setHtmlFileByte(byte[] htmlFileByte) {
        this.htmlFileByte = htmlFileByte;
    }

    public String getMp3FilePath() {
        return mp3FilePath;
    }

    public void setMp3FilePath(String mp3FilePath) {
        this.mp3FilePath = mp3FilePath;
    }

    public byte[] getMp3FileByte() {
        return mp3FileByte;
    }

    public void setMp3FileByte(byte[] mp3FileByte) {
        this.mp3FileByte = mp3FileByte;
    }

    public String getVideoFilePath() {
        return videoFilePath;
    }

    public void setVideoFilePath(String videoFilePath) {
        this.videoFilePath = videoFilePath;
    }

    public byte[] getViderFileByte() {
        return viderFileByte;
    }

    public void setViderFileByte(byte[] viderFileByte) {
        this.viderFileByte = viderFileByte;
    }
}
