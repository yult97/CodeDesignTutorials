package cn.bugstack.design.impl;

import cn.bugstack.design.IVedioUserService;

/**
 * 普通视频用户
 */
public class OrdinaryVideoUserService implements IVedioUserService {
    @Override
    public void definition() {
        System.out.println("普通用户,视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户,无广告");
    }
}
