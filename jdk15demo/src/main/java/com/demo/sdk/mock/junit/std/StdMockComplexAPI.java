/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import junit.framework.Assert;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicStdMockComplexmodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockComplexmodelApiResponse;
import com.demo.sdk.std.mock.model.ComplextMockModel;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockComplexAPI.java, v 0.1 2015-4-17 涓����7:27:56 jiehua Exp $
 */
public class StdMockComplexAPI {

    @Test
    public void testJSONComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockComplexmodelApiRequest request = new AlipayMobilePublicStdMockComplexmodelApiRequest();

        request.setBizContent("廰頔阿杜の");

        try {

            AlipayMobilePublicStdMockComplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("10000", response.getCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            JSONObject parse = (JSONObject) JSONObject.parse(response.getBody());

            JSONObject reponseModel = (JSONObject) parse
                .get("alipay_mobile_public_std_mock_complexmodel_api_response");
            JSONObject x = (JSONObject) reponseModel.get("biz_model");
            System.out.println(x.getString("trade_no"));

            // 楠�璇�缁����

            ComplextMockModel complexModel = ComplextMockModel.getInstance();

            Assert.assertEquals(complexModel.getBiz_num(), response.getBizNum().longValue());
            Assert.assertEquals(complexModel.getBiz_type(), response.getBizType());
            ModelCompareUtil.assertPlaintModel(complexModel.getBiz_model(), response.getBizModel());

            //

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockComplexmodelApiRequest request = new AlipayMobilePublicStdMockComplexmodelApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockComplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败:");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("40004", response.getCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockComplexmodelApiRequest request = new AlipayMobilePublicStdMockComplexmodelApiRequest();

        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockComplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功:");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("10000", response.getCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 楠�璇�缁����

            ComplextMockModel complexModel = ComplextMockModel.getInstance();

            Assert.assertEquals(complexModel.getBiz_num(), response.getBizNum().longValue());
            Assert.assertEquals(complexModel.getBiz_type(), response.getBizType());
            ModelCompareUtil.assertPlaintModel(complexModel.getBiz_model(), response.getBizModel());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockComplexmodelApiRequest request = new AlipayMobilePublicStdMockComplexmodelApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockComplexmodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败:");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("40004", response.getCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

}
