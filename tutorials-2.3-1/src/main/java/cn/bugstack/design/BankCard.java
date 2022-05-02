package cn.bugstack.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 里氏替换原则（Liskov Substitution Principle，LSP）：继承必须确保超类所拥有的性质在子类中必须仍然成立。
 * 银行卡 相当于所有卡父类，包含信用卡和储蓄卡
 * 银行卡功能：入账，还款功能
 * 信用卡功能：提现，贷款功能 但在贷款时，需进行校验额度
 * 储蓄卡功能：提现，存储功能 并且存在风险控制功能
 */
public abstract class BankCard {

    private Logger logger = LoggerFactory.getLogger(BankCard.class);

    private String cardNo; //卡号
    private String cardDate;//开卡时间

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    // 正向入账，+ 钱
    public String positive(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        logger.info("卡号{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    // 逆向入账，- 钱
    public String negative(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        logger.info("卡号{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<String>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }
}
