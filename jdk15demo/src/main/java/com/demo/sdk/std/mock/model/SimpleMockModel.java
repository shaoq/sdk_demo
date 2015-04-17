/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.std.mock.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author jiehua
 * @version $Id: SimpleMockModel.java, v 0.1 2015-4-17 上午9:28:26 jiehua Exp $
 */
public class SimpleMockModel implements Serializable {

    /**  */
    private static final long serialVersionUID = -9165557119558544908L;

    private String            trade_no         = "";

    private boolean           right            = false;

    private Date              happen_time      = new Date();

    private int               count_items      = 0;

    private float             price_num        = 2.12f;

    /**
     * Getter method for property <tt>trade_no</tt>.
     * 
     * @return property value of trade_no
     */
    public String getTrade_no() {
        return trade_no;
    }

    /**
     * Setter method for property <tt>trade_no</tt>.
     * 
     * @param trade_no value to be assigned to property trade_no
     */
    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    /**
     * Getter method for property <tt>right</tt>.
     * 
     * @return property value of right
     */
    public boolean isRight() {
        return right;
    }

    /**
     * Setter method for property <tt>right</tt>.
     * 
     * @param right value to be assigned to property right
     */
    public void setRight(boolean right) {
        this.right = right;
    }

    /**
     * Getter method for property <tt>happen_time</tt>.
     * 
     * @return property value of happen_time
     */
    public Date getHappen_time() {
        return happen_time;
    }

    /**
     * Setter method for property <tt>happen_time</tt>.
     * 
     * @param happen_time value to be assigned to property happen_time
     */
    public void setHappen_time(Date happen_time) {
        this.happen_time = happen_time;
    }

    /**
     * Getter method for property <tt>count_items</tt>.
     * 
     * @return property value of count_items
     */
    public int getCount_items() {
        return count_items;
    }

    /**
     * Setter method for property <tt>count_items</tt>.
     * 
     * @param count_items value to be assigned to property count_items
     */
    public void setCount_items(int count_items) {
        this.count_items = count_items;
    }

    /**
     * Getter method for property <tt>price_num</tt>.
     * 
     * @return property value of price_num
     */
    public float getPrice_num() {
        return price_num;
    }

    /**
     * Setter method for property <tt>price_num</tt>.
     * 
     * @param price_num value to be assigned to property price_num
     */
    public void setPrice_num(float price_num) {
        this.price_num = price_num;
    }

    /**
     *  获取一个实例
     * 
     * @return
     */
    public static SimpleMockModel getInstance() {

        SimpleMockModel model = new SimpleMockModel();

        model.setCount_items(88);
        model.setHappen_time(new Date());
        model.setPrice_num(1.03f);
        model.setRight(true);
        model.setTrade_no("tradeNo1238182811221");

        return model;
    }

}
