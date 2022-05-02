package cn.bugstack.design.test;

import cn.bugstack.design.CashCard;
import cn.bugstack.design.CreditCard;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * 里氏替换原则，主要原则为：父类方法为储蓄卡功能，包含储蓄和提现功能，但需要实现信用卡提现时，逻辑校验，
 * 未保证原有储蓄卡功能逻辑不变时，增加信用卡逻辑校验，因此需要继承父类储蓄卡功能进行改造，从而不会影响父类方法，达到目的。
 */
public class ApiTest {
    private static Logger logger=LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_CreditCard(){
        CreditCard creditCard=new CreditCard();
        // 支付
        creditCard.withdrawal("100001", new BigDecimal(100));
        // 还款
        creditCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }

    @Test
    public void test_CashCard(){
        CashCard cashCard=new CashCard();
        // 支付
        cashCard.withdrawal("100001", new BigDecimal(100));
        // 还款
        cashCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = cashCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }
}
