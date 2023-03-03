package com.zty.noteflow.core.dao;

import com.zty.noteflow.core.facade.DO.PipelineConfigDO;
import com.zty.noteflow.core.facade.DO.examples.PipelineConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PipelineConfigDOMapper {
    int countByExample(PipelineConfigDOExample example);

    int deleteByExample(PipelineConfigDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PipelineConfigDO record);

    int insertSelective(PipelineConfigDO record);

    List<PipelineConfigDO> selectByExample(PipelineConfigDOExample example);

    PipelineConfigDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PipelineConfigDO record, @Param("example") PipelineConfigDOExample example);

    int updateByExample(@Param("record") PipelineConfigDO record, @Param("example") PipelineConfigDOExample example);

    int updateByPrimaryKeySelective(PipelineConfigDO record);

    int updateByPrimaryKey(PipelineConfigDO record);
}