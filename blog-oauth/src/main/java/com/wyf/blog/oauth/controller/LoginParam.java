package com.wyf.blog.oauth.controller;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author wyf
 * @ClassName LoginParam
 * @Description 登录参数
 * @Date 2020/11/25 17:22
 * @Version 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LoginParam implements Serializable {

    private static final long serialVersionUID = -3105862306623370280L;
    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}