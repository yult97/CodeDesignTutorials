package cn.bugstack.design.impl;

import cn.bugstack.design.ICalculationArea;

/**
 * 设计模式-开闭原则案例
 */
public class CalculationArea implements ICalculationArea {
    private static final double π = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
