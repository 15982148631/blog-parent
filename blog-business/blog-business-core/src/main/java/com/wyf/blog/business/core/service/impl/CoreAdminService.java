package com.wyf.blog.business.core.service.impl;

import com.github.pagehelper.PageInfo;
import com.wyf.blog.repository.core.domain.CoreAdmin;


public interface CoreAdminService{

    /**
     * 新增
     * @param coreAdmin {@link CoreAdmin}
     * @return {@code boolean}
     */
    boolean create(CoreAdmin coreAdmin);

    /**
     * 删除
     * @param coreAdminId {@code Long} 管理员 ID
     * @return {@code boolean}
     */
    boolean remove(Long coreAdminId);

    /**
     * 更新（全量）
     * @param coreAdmin {@link CoreAdmin}
     * @return {@code boolean}
     */
    boolean update(CoreAdmin coreAdmin);

    /**
     * 获取
     * @param coreAdminId {@code Long} 管理员 ID
     * @return {@link CoreAdmin}
     */
    CoreAdmin get(Long coreAdminId);

    /**
     * 分页
     * @param current {@code int} 页码
     * @param size {@code int} 笔数
     * @param value {@code Object} 任意条件
     * @return {@code IPage} 管理员分页数据
     */
    PageInfo<CoreAdmin> page(int current, int size, Object value);
}
