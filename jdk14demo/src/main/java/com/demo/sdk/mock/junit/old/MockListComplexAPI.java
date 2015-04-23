/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.ComplextMockModel;
import com.alipay.api.request.AlipayMobilePublicMockListcomplexmodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListcomplexmodelApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListComplexAPI.java, v 0.1 2015-4-17 涓����10:29:02 jiehua Exp $
 */
public class MockListComplexAPI extends TestCase {

    public void testJSONListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("廰頔阿杜の");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = (AlipayMobilePublicMockListcomplexmodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功:");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            List cmModelList = response.getCmModelList();
            com.demo.sdk.std.mock.model.ComplextMockModel instance00 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();
            com.demo.sdk.std.mock.model.ComplextMockModel instance01 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();

            // 楠�璇�缁����
            Assert.assertEquals(2, cmModelList.size());
            ModelCompareUtil.assertComplexModel(instance00, (ComplextMockModel) cmModelList.get(0));
            ModelCompareUtil.assertComplexModel(instance01, (ComplextMockModel) cmModelList.get(1));

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();

        }

    }

    public void testJSONListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = (AlipayMobilePublicMockListcomplexmodelApiResponse) alipayClient
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

    public void testXMLListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("廰頔阿杜の");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = (AlipayMobilePublicMockListcomplexmodelApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功:");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            List cmModelList = response.getCmModelList();
            com.demo.sdk.std.mock.model.ComplextMockModel instance00 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();
            com.demo.sdk.std.mock.model.ComplextMockModel instance01 = com.demo.sdk.std.mock.model.ComplextMockModel
                .getInstance();

            // 验证结果
            Assert.assertEquals(2, cmModelList.size());
            ModelCompareUtil.assertComplexModel(instance00, (ComplextMockModel) cmModelList.get(0));
            ModelCompareUtil.assertComplexModel(instance01, (ComplextMockModel) cmModelList.get(1));

            // TODO 遗留问题

        } catch (Exception e) {

            e.printStackTrace();

            Assert.fail();
        }

    }

    public void testXMLListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListcomplexmodelApiRequest request = new AlipayMobilePublicMockListcomplexmodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcomplexmodelApiResponse response = (AlipayMobilePublicMockListcomplexmodelApiResponse) alipayClient
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

}
