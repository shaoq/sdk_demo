/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.util;

import java.lang.reflect.Field;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;

/**
 * 
 * @author jiehua
 * @version $Id: AlipayClientUtil.java, v 0.1 2015-4-16 下午8:02:38 jiehua Exp $
 */
public class AlipayClientUtil {

    /**
     * 
     */
    private static final AlipayClient ALIPAY_CLIENT = new DefaultAlipayClient(
                                                        GateWayUtils.GATEWAY_URL,
                                                        GateWayUtils.APP_ID,
                                                        GateWayUtils.PRIVATE_KEY);

    /**
     * 获取网关实例
     * 
     * @return
     */
    public static AlipayClient getJSONInStance() {

        return ALIPAY_CLIENT;
    }

    /**
     * 获取网关实例
     * 
     * @return
     */
    public static AlipayClient getXMLInStance() {

        try {

            Field declaredField = ALIPAY_CLIENT.getClass().getDeclaredField("format");

            declaredField.setAccessible(true);
            declaredField.set(ALIPAY_CLIENT, AlipayConstants.FORMAT_XML);

        } catch (Exception e) {

        }

        return ALIPAY_CLIENT;
    }

}
