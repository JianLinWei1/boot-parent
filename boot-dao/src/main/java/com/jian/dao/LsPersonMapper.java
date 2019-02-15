package com.jian.dao;

import com.jian.entity.LsPerson;
import com.jian.entity.LsPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LsPersonMapper {
    long countByExample(LsPersonExample example);

    int deleteByExample(LsPersonExample example);

    int deleteByPrimaryKey(String cardid);

    int insert(LsPerson record);

    int insertSelective(LsPerson record);

    List<LsPerson> selectByExampleWithBLOBsWithRowbounds(LsPersonExample example, RowBounds rowBounds);

    List<LsPerson> selectByExampleWithBLOBs(LsPersonExample example);

    List<LsPerson> selectByExampleWithRowbounds(LsPersonExample example, RowBounds rowBounds);

    List<LsPerson> selectByExample(LsPersonExample example);

    LsPerson selectByPrimaryKey(String cardid);

    int updateByExampleSelective(@Param("record") LsPerson record, @Param("example") LsPersonExample example);

    int updateByExampleWithBLOBs(@Param("record") LsPerson record, @Param("example") LsPersonExample example);

    int updateByExample(@Param("record") LsPerson record, @Param("example") LsPersonExample example);

    int updateByPrimaryKeySelective(LsPerson record);

    int updateByPrimaryKeyWithBLOBs(LsPerson record);

    int updateByPrimaryKey(LsPerson record);
}