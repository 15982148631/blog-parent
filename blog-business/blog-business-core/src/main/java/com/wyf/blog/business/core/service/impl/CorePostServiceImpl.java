package com.wyf.blog.business.core.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wyf.blog.repository.core.mapper.CorePostMapper;
import com.wyf.blog.business.core.service.CorePostService;
@Service
public class CorePostServiceImpl implements CorePostService{

    @Resource
    private CorePostMapper corePostMapper;

}
