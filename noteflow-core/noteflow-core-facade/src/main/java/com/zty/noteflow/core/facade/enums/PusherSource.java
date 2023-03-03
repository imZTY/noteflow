package com.zty.noteflow.core.facade.enums;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:35
 */
public enum PusherSource {
    MP_WECHAT,
    GITHUB_PAGE
    ;

    PusherSource() {
        this.mask = (1 << ordinal());
    }

    private int mask;

    public int getMask() {
        return mask;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }
}
