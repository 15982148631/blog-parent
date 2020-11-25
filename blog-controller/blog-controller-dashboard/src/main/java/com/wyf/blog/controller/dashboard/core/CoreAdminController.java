package com.wyf.blog.controller.dashboard.core;

import com.github.pagehelper.PageInfo;
import com.wyf.blog.business.core.service.impl.CoreAdminService;
import com.wyf.blog.common.response.ResponseResult;
import com.wyf.blog.repository.core.domain.CoreAdmin;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Objects;

/**
 * @Author wyf
 * @ClassName CoreAdminController
 * @Description 管理员
 * @Date 2020/11/25 14:38
 * @Version 1.0.0
 */
@RestController
@RequestMapping("core/admin")
public class CoreAdminController {
    @Resource
    private CoreAdminService coreAdminService;

    /**
     * 新增
     * @param coreAdmin {@link CoreAdmin}
     * @return {@link ResponseResult}
     */
    @PostMapping("create")
    public ResponseResult create(@Valid @RequestBody CoreAdmin coreAdmin, BindingResult bindingResult) {
        // 表单验证
        if (bindingResult.hasErrors()) {
            return ResponseResult.failure(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }

        // 业务逻辑
        boolean created = coreAdminService.create(coreAdmin);
        if (created) {
            return ResponseResult.success("创建成功");
        }

        return null;
    }

    /**
     * 删除
     * @param coreAdminId {@code Long} 管理员 ID
     * @return {@link ResponseResult}
     */
    @DeleteMapping("remove/{coreAdminId}")
    public ResponseResult remove(@PathVariable Long coreAdminId) {
        // 业务逻辑
        boolean deleted = coreAdminService.remove(coreAdminId);
        if (deleted) {
            return ResponseResult.success("删除成功");
        }

        return null;
    }

    /**
     * 修改
     * @param coreAdmin {@link CoreAdmin}
     * @return {@link ResponseResult}
     */
    @PutMapping("update")
    public ResponseResult update(@Valid @RequestBody CoreAdmin coreAdmin, BindingResult bindingResult) {
        // 表单验证
        if (bindingResult.hasErrors()) {
            return ResponseResult.failure(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        }

        // 业务逻辑
        boolean updated = coreAdminService.update(coreAdmin);
        if (updated) {
            return ResponseResult.success("修改成功");
        }

        return null;
    }

    /**
     * 获取
     * @param coreAdminId {@code Long} 管理员 ID
     * @return {@link ResponseResult}
     */
    @GetMapping("get/{coreAdminId}")
    public ResponseResult get(@PathVariable Long coreAdminId) {
        CoreAdmin coreAdmin = coreAdminService.get(coreAdminId);
        return ResponseResult.success(coreAdmin);
    }

    /**
     * 分页
     * @param current {@code int} 页码
     * @param size {@code int} 笔数
     * @param value {@code Object} 任意条件
     * @return {@link ResponseResult}
     */
    @GetMapping("page")
    public ResponseResult page(@RequestParam int current,
                               @RequestParam int size,
                               @RequestParam(required = false) String value) {
        PageInfo pageInfo = coreAdminService.page(current, size, value);
        //分页后结果集
        return ResponseResult.success(pageInfo.getList());
    }
}
