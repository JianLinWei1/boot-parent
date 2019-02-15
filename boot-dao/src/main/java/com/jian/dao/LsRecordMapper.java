package com.jian.dao;

import com.jian.entity.LsRecord;
import com.jian.entity.LsRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LsRecordMapper {
    long countByExample(LsRecordExample example);

    int deleteByExample(LsRecordExample example);

    int deleteByPrimaryKey(String recordid);

    int insert(LsRecord record);

    int insertSelective(LsRecord record);

    List<LsRecord> selectByExampleWithRowbounds(LsRecordExample example, RowBounds rowBounds);

    List<LsRecord> selectByExample(LsRecordExample example);

    LsRecord selectByPrimaryKey(String recordid);

    int updateByExampleSelective(@Param("record") LsRecord record, @Param("example") LsRecordExample example);

    int updateByExample(@Param("record") LsRecord record, @Param("example") LsRecordExample example);

    int updateByPrimaryKeySelective(LsRecord record);

    int updateByPrimaryKey(LsRecord record);
}