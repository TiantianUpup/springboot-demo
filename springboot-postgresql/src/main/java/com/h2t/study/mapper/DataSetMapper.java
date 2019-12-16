package com.h2t.study.mapper;

import com.h2t.study.po.DataSetPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据层
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/12/16 11:24
 */
@Mapper
public interface DataSetMapper {
    @Select("select * from dataset where user_uuid = #{userUuid}")
    List<DataSetPO> listDataSetByUserId(String userUuid);
}
