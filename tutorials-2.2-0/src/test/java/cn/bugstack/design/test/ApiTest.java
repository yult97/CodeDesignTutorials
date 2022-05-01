package cn.bugstack.design.test;

import cn.bugstack.design.ICalculationArea;
import cn.bugstack.design.impl.CalculationAreaEx;
import org.junit.Test;

/**
 * 开闭原则测试类（测试新圆周率计算圆面积）
 */
public class ApiTest {
    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea iCalculationArea=new CalculationAreaEx();
        double circular = iCalculationArea.circular(10);
        System.out.println(circular);
    }
}
