package com.wyf.blog.business.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyf.blog.business.core.service.CoreAdminService;
import com.wyf.blog.common.exceptions.BusinessException;
import com.wyf.blog.common.response.ResponseCode;
import com.wyf.blog.repository.core.domain.CoreAdmin;
import com.wyf.blog.repository.core.mapper.CoreAdminMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CoreAdminServiceImpl implements CoreAdminService {

    @Resource
    private CoreAdminMapper coreAdminMapper;

    @Override
    public boolean create(CoreAdmin coreAdmin) {
        int i = coreAdminMapper.insert(coreAdmin);
        return i==1?true:false;
    }

    @Override
    public boolean remove(Long coreAdminId) {
        int i = coreAdminMapper.deleteByPrimaryKey(coreAdminId);
        return  i==1?true:false;
    }

    @Override
    public boolean update(CoreAdmin coreAdmin) {
        int i = coreAdminMapper.updateByPrimaryKey(coreAdmin);
        return  i==1?true:false;
    }

    @Override
    public CoreAdmin get(Long coreAdminId) {
        CoreAdmin coreAdmin = coreAdminMapper.selectByPrimaryKey(coreAdminId);
        if (null == coreAdmin) {
            throw new BusinessException(ResponseCode.USER_NOT_EXIST);
        }
        return coreAdmin;
    }


    @Override
    public PageInfo<CoreAdmin> page(int current, int size, Object value) {
        PageHelper.startPage(current,size);
        List<CoreAdmin> list=coreAdminMapper.selectAll();
        return new PageInfo(list);
    }

}
