package com.wyf.blog.repository.core.mapper;

import com.wyf.blog.repository.core.domain.CorePost;
import org.springframework.stereotype.Repository;
import com.wyf.blog.repository.tk.mybatis.mapper.MyMapper;

@Repository
public interface CorePostMapper extends MyMapper<CorePost> {
}