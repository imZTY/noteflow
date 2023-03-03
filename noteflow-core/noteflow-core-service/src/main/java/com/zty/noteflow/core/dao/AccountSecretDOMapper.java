package com.zty.noteflow.core.dao;

import com.zty.noteflow.core.facade.DO.AccountSecretDO;
import com.zty.noteflow.core.facade.DO.examples.AccountSecretDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountSecretDOMapper {
    int countByExample(AccountSecretDOExample example);

    int deleteByExample(AccountSecretDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountSecretDO record);

    int insertSelective(AccountSecretDO record);

    List<AccountSecretDO> selectByExample(AccountSecretDOExample example);

    AccountSecretDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountSecretDO record, @Param("example") AccountSecretDOExample example);

    int updateByExample(@Param("record") AccountSecretDO record, @Param("example") AccountSecretDOExample example);

    int updateByPrimaryKeySelective(AccountSecretDO record);

    int updateByPrimaryKey(AccountSecretDO record);
}