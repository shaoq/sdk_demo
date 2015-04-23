/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockSimplemodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockSimplemodelApiResponse;
import com.demo.sdk.std.mock.model.SimpleMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockSimpleAPI.java, v 0.1 2015-4-17 涓����5:05:34 jiehua Exp $
 */
public class MockSimpleAPI extends TestCase {

    public void testJSONSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("貣龞哈迪大┱");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = (AlipayMobilePublicMockSimplemodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();

        }

    }

    public void testJSONSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = (AlipayMobilePublicMockSimplemodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败:");
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

    public void testXMLSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("貣龞哈迪大┱");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = (AlipayMobilePublicMockSimplemodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }
    }

    public void testXMLSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = (AlipayMobilePublicMockSimplemodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败:");
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
