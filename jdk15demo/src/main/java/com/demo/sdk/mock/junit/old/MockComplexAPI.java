/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockComplexmodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockComplexmodelApiResponse;
import com.demo.sdk.std.mock.model.ComplextMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockComplexAPI.java, v 0.1 2015-4-17 下午7:27:56 jiehua Exp $
 */
public class MockComplexAPI {

    @Test
    public void testJSONComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockComplexmodelApiRequest request = new AlipayMobilePublicMockComplexmodelApiRequest();

        request.setBizContent("");

        try {

            AlipayMobilePublicMockComplexmodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果

            ComplextMockModel complexModel = ComplextMockModel.getInstance();

            Assert.assertEquals(complexModel.getBiz_num(), response.getBizNum().longValue());
            Assert.assertEquals(complexModel.getBiz_type(), response.getBizType());
            ModelCompareUtil.assertPlaintModel(complexModel.getBiz_model(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockComplexmodelApiRequest request = new AlipayMobilePublicMockComplexmodelApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockComplexmodelApiResponse response = alipayClient.execute(request);

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
    public void testXMLComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockComplexmodelApiRequest request = new AlipayMobilePublicMockComplexmodelApiRequest();

        request.setBizContent("");

        try {

            AlipayMobilePublicMockComplexmodelApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果

            ComplextMockModel complexModel = ComplextMockModel.getInstance();

            Assert.assertEquals(complexModel.getBiz_num(), response.getBizNum().longValue());
            Assert.assertEquals(complexModel.getBiz_type(), response.getBizType());
            ModelCompareUtil.assertPlaintModel(complexModel.getBiz_model(),
                response.getSimpleMockModel());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockComplexmodelApiRequest request = new AlipayMobilePublicMockComplexmodelApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockComplexmodelApiResponse response = alipayClient.execute(request);

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
