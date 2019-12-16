package com.h2t.study.service.impl;

import com.h2t.study.mapper.DataSetMapper;
import com.h2t.study.po.DataSetPO;
import com.h2t.study.service.DataSetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务层接口实现类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/12/16 10:53
 */
@Service
public class DataSetServiceImpl implements DataSetService {
    @Resource
    private DataSetMapper fileSetMapper;

    @Override
    public List<DataSetPO> listDataSetByUserId(String userUuid) {
        return fileSetMapper.listDataSetByUserId(userUuid);
    }
}
