package com.wyf.blog.oauth.service.impl;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.wyf.blog.repository.core.domain.CoreAdmin;
import com.wyf.blog.repository.core.domain.CoreUser;
import com.wyf.blog.repository.core.mapper.CoreAdminMapper;
import com.wyf.blog.repository.core.mapper.CoreUserMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author wyf
 * @ClassName UserDetailsServiceImpl
 * @Description 自定义认证与授权
 * @Date 2020/11/25 16:49
 * @Version 1.0.0
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private CoreAdminMapper coreAdminMapper;

    @Resource
    private CoreUserMapper coreUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 管理后台
        Example example = new Example(CoreUser.class);
        example.and().andAllEqualTo(username);
        CoreAdmin coreAdmin = coreAdminMapper.selectOneByExample(example);
        if (null != coreAdmin) {
            // 授权，管理员权限为 ADMIN
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("ADMIN"));

            // 由框架完成认证工作
            return new User(coreAdmin.getUsername(), coreAdmin.getPassword(), grantedAuthorities);
        }

        // 门户网站
        CoreUser coreUser = coreUserMapper.selectOneByExample(example);
        if (null != coreUser) {
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("USERS"));
            return new User(coreUser.getUsername(), coreUser.getPassword(), grantedAuthorities);
        }

        return null;
    }
}