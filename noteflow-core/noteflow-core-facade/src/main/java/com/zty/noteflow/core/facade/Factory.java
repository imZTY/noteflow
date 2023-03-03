package com.zty.noteflow.core.facade;

import java.util.List;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 上午 11:30
 */
public interface Factory<T> {

    public List<T> getByConfig(AccountSecretDO config);

}
