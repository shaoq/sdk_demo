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
 * @version $Id: AlipayClientUtil.java, v 0.1 2015-4-16 ����8:02:38 jiehua Exp $
 */
public class AlipayClientUtil {

    /**
     * JSON�ͻ���
     */
    private static final AlipayClient ALIPAY_JSON_CLIENT = new DefaultAlipayClient(
                                                             GateWayUtils.GATEWAY_URL,
                                                             GateWayUtils.APP_ID,
                                                             GateWayUtils.PRIVATE_KEY);

    /**
     * XML�ͻ���
     */
    private static final AlipayClient ALIPAY_XML_CLIENT  = new DefaultAlipayClient(
                                                             GateWayUtils.GATEWAY_URL,
                                                             GateWayUtils.APP_ID,
                                                             GateWayUtils.PRIVATE_KEY);

    static {

        try {

            Field declaredField = ALIPAY_XML_CLIENT.getClass().getDeclaredField("format");

            declaredField.setAccessible(true);
            declaredField.set(ALIPAY_XML_CLIENT, AlipayConstants.FORMAT_XML);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    /**
     * ��ȡ����ʵ��
     * 
     * @return
     */
    public static AlipayClient getJSONInStance() {

        return ALIPAY_JSON_CLIENT;
    }

    /**
     * ��ȡ����ʵ��
     * 
     * @return
     */
    public static AlipayClient getXMLInStance() {

        return ALIPAY_XML_CLIENT;
    }

}
