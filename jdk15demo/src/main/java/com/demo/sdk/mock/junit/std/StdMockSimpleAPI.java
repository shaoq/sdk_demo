/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import org.junit.Assert;
import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicStdMockSimplemodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockSimplemodelApiResponse;
import com.demo.sdk.std.mock.model.SimpleMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockSimpleAPI.java, v 0.1 2015-4-17 下午5:05:34 jiehua Exp $
 */
public class StdMockSimpleAPI {

    @Test
    public void testJSONSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockSimplemodelApiRequest request = new AlipayMobilePublicStdMockSimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockSimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getBizModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();

        }

    }

    @Test
    public void testJSONSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockSimplemodelApiRequest request = new AlipayMobilePublicStdMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockSimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testXMLSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockSimplemodelApiRequest request = new AlipayMobilePublicStdMockSimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockSimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getBizModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }
    }

    @Test
    public void testXMLSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockSimplemodelApiRequest request = new AlipayMobilePublicStdMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockSimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();

        }
    }

}
