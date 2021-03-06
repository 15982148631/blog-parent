package com.wyf.blog.repository.core.domain;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "core_user")
public class CoreUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 登录名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 昵称
     */
    @Column(name = "nickname")
    private String nickname;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 网址
     */
    @Column(name = "url")
    private String url;

    /**
     * 用户状态：1(已启用) 0(已禁用)
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 激活码
     */
    @Column(name = "activation_key")
    private String activationKey;

    /**
     * 逻辑删除：1(已删除) 0(未删除)
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}