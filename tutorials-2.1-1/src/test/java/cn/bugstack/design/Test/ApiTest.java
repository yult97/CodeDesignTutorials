package cn.bugstack.design.Test;

import cn.bugstack.design.IVedioUserService;
import cn.bugstack.design.impl.GuestVideoUserService;
import cn.bugstack.design.impl.OrdinaryVideoUserService;
import cn.bugstack.design.impl.VipVedioUserService;

public class ApiTest {
    public static void main(String[] args) {
        //访客用户实现类
        IVedioUserService guestVideoUserService = new GuestVideoUserService();
        guestVideoUserService.definition();
        guestVideoUserService.advertisement();
        //普通用户实现类
        IVedioUserService ordinaryVideoUserService = new OrdinaryVideoUserService();
        ordinaryVideoUserService.advertisement();
        ordinaryVideoUserService.definition();
        //VIP用户实现类
        IVedioUserService vipVedioUserService = new VipVedioUserService();
        vipVedioUserService.definition();
        vipVedioUserService.advertisement();
    }
}
