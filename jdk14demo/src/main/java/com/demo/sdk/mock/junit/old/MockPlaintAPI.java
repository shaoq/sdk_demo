/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockPlaintApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockPlaintApiResponse;
import com.demo.sdk.std.mock.model.SimpleMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockPlaintAPI.java, v 0.1 2015-4-17 涓����9:37:01 jiehua Exp $
 */
public class MockPlaintAPI extends TestCase {

    public void testJSONPlaintAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("貣龞哈迪大┱");

            AlipayMobilePublicMockPlaintApiResponse response = (AlipayMobilePublicMockPlaintApiResponse) alipayClient
                .execute(request);

            SimpleMockModel expectModel = SimpleMockModel.getInstance();

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
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

    public void testJSONPlaintAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("false");

            AlipayMobilePublicMockPlaintApiResponse response = (AlipayMobilePublicMockPlaintApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    public void testXMLPlaintAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("貣龞哈迪大┱");

            AlipayMobilePublicMockPlaintApiResponse response = (AlipayMobilePublicMockPlaintApiResponse) alipayClient
                .execute(request);

            SimpleMockModel expectModel = SimpleMockModel.getInstance();

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
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

    public void testXMLPlaintAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        try {

            AlipayMobilePublicMockPlaintApiRequest request = new AlipayMobilePublicMockPlaintApiRequest();
            request.setBizContent("false");

            AlipayMobilePublicMockPlaintApiResponse response = (AlipayMobilePublicMockPlaintApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }
}
