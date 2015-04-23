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
import com.alipay.api.domain.ListListComplexMockModel;
import com.alipay.api.request.AlipayMobilePublicMockListcmlistApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListcmlistApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListListComplexAPI.java, v 0.1 2015-4-17 涓����8:14:21 jiehua Exp $
 */
public class MockListListComplexAPI extends TestCase {

    public void testJSONListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("廰頔阿杜の");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = (AlipayMobilePublicMockListcmlistApiResponse) alipayClient
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
            List listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List cmList0 = ((ListListComplexMockModel) listCmList.get(0)).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList0.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList0.get(1));

            List cmList1 = ((ListListComplexMockModel) listCmList.get(1)).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList1.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList1.get(1));

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testJSONListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = (AlipayMobilePublicMockListcmlistApiResponse) alipayClient
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

    public void testXMLListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("廰頔阿杜の");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = (AlipayMobilePublicMockListcmlistApiResponse) alipayClient
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
            List listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List cmList0 = ((ListListComplexMockModel) listCmList.get(0)).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList0.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList0.get(1));

            List cmList1 = ((ListListComplexMockModel) listCmList.get(1)).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList1.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(),
                (ComplextMockModel) cmList1.get(1));

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testXMLListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = (AlipayMobilePublicMockListcmlistApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败");
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
