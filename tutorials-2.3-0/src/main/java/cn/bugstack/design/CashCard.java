package cn.bugstack.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 里氏替换原则，模拟储蓄卡功能
 */
public class CashCard {
    private static Logger logger= LoggerFactory.getLogger(CashCard.class);

    /**
     * 提现功能
     * @param orderId
     * @param amount
     * @return
     */
    public String withdrawal(String orderId, BigDecimal amount){
        logger.info("提现成功，单号：{} 金额：{}", orderId, amount);
        return "00000";
    }

    /**
     * 储蓄功能
     * @param orderId
     * @param amount
     * @return
     */
    public String recharge(String orderId, BigDecimal amount){
        logger.info("储蓄成功，单号：{} 金额：{}", orderId, amount);
        return "00000";
    }

    /**
     * 交易流水查询
     * @return
     */
    public List<String> tradeFlow(){
        logger.info("交易流水查询成功");
        List<String> tradeList  = new ArrayList<>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,50.00");
        tradeList.add("100001,60.00");
        tradeList.add("100001,70.00");
        tradeList.add("100001,80.00");
        return tradeList;
    }
}
