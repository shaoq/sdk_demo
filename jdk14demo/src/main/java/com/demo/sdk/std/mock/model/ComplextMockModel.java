/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.std.mock.model;

import java.io.Serializable;

/**
 * 
 * @author jiehua
 * @version $Id: ComplextMockModel.java, v 0.1 2015-4-17 上午9:30:10 jiehua Exp $
 */
public class ComplextMockModel implements Serializable {

    /**  */
    private static final long serialVersionUID = -5998583063709221725L;

    private String            biz_type;

    private long              biz_num;

    private SimpleMockModel   biz_model;

    /**
     * Getter method for property <tt>biz_type</tt>.
     * 
     * @return property value of biz_type
     */
    public String getBiz_type() {
        return biz_type;
    }

    /**
     * Setter method for property <tt>biz_type</tt>.
     * 
     * @param biz_type value to be assigned to property biz_type
     */
    public void setBiz_type(String biz_type) {
        this.biz_type = biz_type;
    }

    /**
     * Getter method for property <tt>biz_num</tt>.
     * 
     * @return property value of biz_num
     */
    public long getBiz_num() {
        return biz_num;
    }

    /**
     * Setter method for property <tt>biz_num</tt>.
     * 
     * @param biz_num value to be assigned to property biz_num
     */
    public void setBiz_num(long biz_num) {
        this.biz_num = biz_num;
    }

    /**
     * Getter method for property <tt>biz_model</tt>.
     * 
     * @return property value of biz_model
     */
    public SimpleMockModel getBiz_model() {
        return biz_model;
    }

    /**
     * Setter method for property <tt>biz_model</tt>.
     * 
     * @param biz_model value to be assigned to property biz_model
     */
    public void setBiz_model(SimpleMockModel biz_model) {
        this.biz_model = biz_model;
    }

    /**
     * 
     * 
     * @return
     */
    public static ComplextMockModel getInstance() {

        ComplextMockModel model = new ComplextMockModel();

        model.setBiz_num(11);

        model.setBiz_type("AAA第一个");

        model.setBiz_model(SimpleMockModel.getInstance());

        return model;

    }

}
