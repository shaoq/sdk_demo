/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.ComplextMockModel;
import com.alipay.api.request.AlipayMobilePublicMockListcomplexmodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListcomplexmodelApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListComplexAPI.java, v 0.1 2015-4-17 上午10:29:02 jiehua Exp $
 */
public class MockListComplexAPI {

    @Test
    public void testJSONListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            List<ComplextMockModel> cmModelList = response.getCmModelList();
            com.demo.sdk.std.mock.model.ComplextMockModel instance00 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();
            com.demo.sdk.std.mock.model.ComplextMockModel instance01 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();

            // 验证结果
            Assert.assertEquals(2, cmModelList.size());
            ModelCompareUtil.assertComplexModel(instance00, cmModelList.get(0));
            ModelCompareUtil.assertComplexModel(instance01, cmModelList.get(1));

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    @Test
    public void testJSONListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

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
    public void testXMLListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            List<ComplextMockModel> cmModelList = response.getCmModelList();
            com.demo.sdk.std.mock.model.ComplextMockModel instance00 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();
            com.demo.sdk.std.mock.model.ComplextMockModel instance01 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();

            // 验证结果
            Assert.assertEquals(2, cmModelList.size());
            ModelCompareUtil.assertComplexModel(instance00, cmModelList.get(0));
            ModelCompareUtil.assertComplexModel(instance01, cmModelList.get(1));

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    @Test
    public void testXMLListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

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
