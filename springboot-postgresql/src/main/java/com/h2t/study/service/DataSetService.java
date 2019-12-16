package com.h2t.study.service;

import com.h2t.study.po.DataSetPO;

import java.util.List;

/**
 * 业务层接口
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/12/16 10:53
 */
public interface DataSetService {
    List<DataSetPO> listDataSetByUserId(String userUuid);
}
