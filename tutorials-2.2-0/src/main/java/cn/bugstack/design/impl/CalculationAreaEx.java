package cn.bugstack.design.impl;

public class CalculationAreaEx extends CalculationArea{
    private static final double π=3.1415926D;

    /**
     * 计算圆形面积
     * @param r
     * @return
     */
    public double circular(double r){
        return π*r*r;
    }
}
