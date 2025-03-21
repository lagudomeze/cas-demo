package com.example.demo;

import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CasUserDetailsService implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
        String name = token.getName();

        System.out.println(token);

        System.out.println(token.getAssertion().getPrincipal().getAttributes());

        // todo get user info from database
        // 0: 普通用户, 1: 部门管理员 2: 系统管理员 -1: 特殊用户

        return new YsUserDetail(name, "userId", 0);
    }
}
