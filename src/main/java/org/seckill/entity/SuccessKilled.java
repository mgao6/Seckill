package org.seckill.entity;

import ch.qos.logback.core.pattern.FormatInfo;

import java.util.*;


/**
 * @author GaoMing
 * @date 2021/10/9 - 20:12
 */
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;

    // 变通
    // 多对一
    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    Scanner in = new Scanner(System.in);
    String[] s = in.nextLine().split(" ");
    int[] int_s = new int[s.length];
    int n = int_s.length;
    for(int i = 0; i < n; i++){
        int_s[i] = Integer.parseInt(s[i]);
    }


    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
