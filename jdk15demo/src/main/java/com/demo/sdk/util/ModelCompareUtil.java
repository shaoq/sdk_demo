/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.util;

import junit.framework.Assert;

import com.alipay.api.domain.ComplextMockModel;
import com.alipay.api.domain.SimpleMockModel;

/**
 * 
 * @author jiehua
 * @version $Id: ModelCompareUtil.java, v 0.1 2015-4-17 ÉÏÎç9:31:33 jiehua Exp $
 */
public class ModelCompareUtil {

    /**
     * 
     * 
     * @param expiredModel
     * @param actModel
     */
    public static void assertPlaintModel(com.demo.sdk.std.mock.model.SimpleMockModel expiredModel,
                                         SimpleMockModel actModel) {

        Assert.assertNotNull(actModel);

        Assert.assertEquals(expiredModel.getPrice_num() + "", actModel.getPriceNum());
        Assert.assertEquals(expiredModel.getTrade_no(), actModel.getTradeNo());
        Assert.assertEquals(expiredModel.getCount_items(), actModel.getCountItems().intValue());
        Assert.assertNotNull(actModel.getHappenTime());
        Assert.assertEquals(expiredModel.isRight(), actModel.getRight().booleanValue());

    }

    /**
     * 
     * 
     * @param expectModel
     * @param actModel
     */
    public static void assertComplexModel(com.demo.sdk.std.mock.model.ComplextMockModel expectModel,
                                          ComplextMockModel actModel) {

        Assert.assertNotNull(actModel);

        Assert.assertEquals(expectModel.getBiz_type(), actModel.getBizType());
        Assert.assertEquals(expectModel.getBiz_num(), actModel.getBizNum().longValue());

        assertPlaintModel(expectModel.getBiz_model(), actModel.getBizModel());

    }

}
