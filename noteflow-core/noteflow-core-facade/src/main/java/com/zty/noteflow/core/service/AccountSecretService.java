package com.zty.noteflow.core.service;

import java.util.List;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;

/**
 * @author: tianyi.zeng
 * @create: 30/1/2023 - 下午 4:08
 */
public interface AccountSecretService {

    public List<AccountSecretDO> queryByDO(AccountSecretDO queryDO);

}
