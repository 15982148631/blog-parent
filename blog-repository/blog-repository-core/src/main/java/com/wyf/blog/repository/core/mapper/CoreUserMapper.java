package com.wyf.blog.repository.core.mapper;

import com.wyf.blog.repository.core.domain.CoreUser;
import com.wyf.blog.repository.tk.mybatis.mapper.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreUserMapper extends MyMapper<CoreUser> {
}