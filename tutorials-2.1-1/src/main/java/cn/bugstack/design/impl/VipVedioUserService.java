package cn.bugstack.design.impl;

import cn.bugstack.design.IVedioUserService;

/**
 * VIP视频用户
 */
public class VipVedioUserService implements IVedioUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户,视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户,无广告");
    }
}
