/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.ComplextMockModel;
import com.alipay.api.request.AlipayMobilePublicStdMockListcomplexmodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockListcomplexmodelApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockListComplexAPI.java, v 0.1 2015-4-17 上午10:29:02 jiehua Exp $
 */
public class StdMockListComplexAPI {

    @Test
    public void testJSONListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockListcomplexmodelApiRequest request = new AlipayMobilePublicStdMockListcomplexmodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicStdMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
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

        AlipayMobilePublicStdMockListcomplexmodelApiRequest request = new AlipayMobilePublicStdMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListcomplexmodelApiResponse response = alipayClient
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
    public void testXMLListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockListcomplexmodelApiRequest request = new AlipayMobilePublicStdMockListcomplexmodelApiRequest();
        request.setBizContent("");

        try {

            AlipayMobilePublicStdMockListcomplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
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

        AlipayMobilePublicStdMockListcomplexmodelApiRequest request = new AlipayMobilePublicStdMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListcomplexmodelApiResponse response = alipayClient
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

}
