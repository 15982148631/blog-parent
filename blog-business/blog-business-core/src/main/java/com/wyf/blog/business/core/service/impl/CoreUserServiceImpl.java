package com.wyf.blog.business.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wyf.blog.repository.core.mapper.CoreUserMapper;
import com.wyf.blog.business.core.service.CoreUserService;
@Service
public class CoreUserServiceImpl implements CoreUserService{

    @Resource
    private CoreUserMapper coreUserMapper;

}
