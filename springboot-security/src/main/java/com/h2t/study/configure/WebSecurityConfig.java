package com.h2t.study.configure;

import com.h2t.study.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SpringSecurity配置类
 *
 * @Author: hetiantian
 * @Date:2019/9/3 23:12 
 * @Version: 1.0
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /*
            1.配置静态资源不进行授权验证
            2.登录地址及跳转过后的成功页不需要验证
            3.其余均进行授权验证
         */
        http.
                authorizeRequests().antMatchers("/static/**").permitAll().
                and().authorizeRequests().antMatchers("/user/**").hasAuthority("ROLE_/hello").
                and().authorizeRequests().anyRequest().authenticated().
                and().formLogin().loginPage("/login").successForwardUrl("/index").permitAll()
                .and().logout().logoutUrl("/logout").invalidateHttpSession(true).deleteCookies().permitAll()
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置自定义userDetailService
        //校验时指定密码解码方式
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
}
