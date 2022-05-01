package cn.bugstack.design.Test;

import cn.bugstack.design.VedioService;

public class ApiTest {
    public static void main(String[] args) {
        VedioService vedioService = new VedioService();
        vedioService.serveGrade("VIP用户");
        vedioService.serveGrade("普通用户");
        vedioService.serveGrade("访客用户");
    }
}
