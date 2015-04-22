/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockPlaintApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockPlaintApiResponse;
import com.demo.sdk.std.mock.model.SimpleMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockPlaintAPI.java, v 0.1 2015-4-17 上午9:37:01 jiehua Exp $
 */
public class MockPlaintAPI {

    @Test
    public void testJSONPlaintAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("繁体骶骶龘の");

            AlipayMobilePublicMockPlaintApiResponse response = alipayClient.execute(request);

            SimpleMockModel expectModel = SimpleMockModel.getInstance();

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            Assert.assertEquals(expectModel.getPrice_num() + "", response.getPriceNum());
            Assert.assertEquals(expectModel.getTrade_no(), response.getTradeNo());
            Assert.assertEquals(expectModel.getCount_items(), response.getCountItems().intValue());
            Assert.assertNotNull(response.getHappenTime());
            Assert.assertEquals(expectModel.isRight(), response.getRight().booleanValue());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    @Test
    public void testJSONPlaintAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("false");

            AlipayMobilePublicMockPlaintApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    @Test
    public void testXMLPlaintAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("繁体骶骶龘の");

            AlipayMobilePublicMockPlaintApiResponse response = alipayClient.execute(request);

            SimpleMockModel expectModel = SimpleMockModel.getInstance();

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            Assert.assertEquals(expectModel.getPrice_num() + "", response.getPriceNum());
            Assert.assertEquals(expectModel.getTrade_no(), response.getTradeNo());
            Assert.assertEquals(expectModel.getCount_items(), response.getCountItems().intValue());
            Assert.assertNotNull(response.getHappenTime());
            Assert.assertEquals(expectModel.isRight(), response.getRight().booleanValue());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    @Test
    public void testXMLPlaintAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("false");

            AlipayMobilePublicMockPlaintApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }
}
