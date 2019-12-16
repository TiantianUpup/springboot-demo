package com.h2t.study.generator;

import com.h2t.study.util.PasswordEncoderUtil;

/**
 * TODO Description
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/04 11:11
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("开始{bcrypt}" + PasswordEncoderUtil.passwordEncoder("cc") + "结束");
    }
}
