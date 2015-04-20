/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import org.junit.Assert;
import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockSimplemodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockSimplemodelApiResponse;
import com.demo.sdk.std.mock.model.SimpleMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockSimpleAPI.java, v 0.1 2015-4-17 ����5:05:34 jiehua Exp $
 */
public class MockSimpleAPI {

    @Test
    public void testJSONSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON �ɹ���");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // ��֤���
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();

        }

    }

    @Test
    public void testJSONSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON ʧ�ܣ�");
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
    public void testXMLSimpleAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML �ɹ���");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // ��֤���
            ModelCompareUtil.assertPlaintModel(SimpleMockModel.getInstance(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }
    }

    @Test
    public void testXMLSimpleAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockSimplemodelApiRequest request = new AlipayMobilePublicMockSimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockSimplemodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML ʧ�ܣ�");
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
