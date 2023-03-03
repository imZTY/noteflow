package com.zty.noteflow.core.dao;

import com.zty.noteflow.core.facade.DO.AccountPipelineDO;
import com.zty.noteflow.core.facade.DO.examples.AccountPipelineDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountPipelineDOMapper {
    int countByExample(AccountPipelineDOExample example);

    int deleteByExample(AccountPipelineDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountPipelineDO record);

    int insertSelective(AccountPipelineDO record);

    List<AccountPipelineDO> selectByExample(AccountPipelineDOExample example);

    AccountPipelineDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountPipelineDO record, @Param("example") AccountPipelineDOExample example);

    int updateByExample(@Param("record") AccountPipelineDO record, @Param("example") AccountPipelineDOExample example);

    int updateByPrimaryKeySelective(AccountPipelineDO record);

    int updateByPrimaryKey(AccountPipelineDO record);
}