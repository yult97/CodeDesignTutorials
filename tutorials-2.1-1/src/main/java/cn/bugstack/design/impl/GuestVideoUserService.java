package cn.bugstack.design.impl;

import cn.bugstack.design.IVedioUserService;

/**
 * 访客视频用户
 */
public class GuestVideoUserService implements IVedioUserService {
    @Override
    public void definition() {
        System.out.println("访客用户,视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户,有广告");
    }
}
