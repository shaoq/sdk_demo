/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.SimpleMockModel;
import com.alipay.api.request.AlipayMobilePublicStdMockListsimplemodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockListsimplemodelApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockListSimpleAPI.java, v 0.1 2015-4-17 下午7:46:30 jiehua Exp $
 */
public class StdMockListSimpleAPI {

    @Test
    public void testJSONListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicStdMockListsimplemodelApiRequest request = new AlipayMobilePublicStdMockListsimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListsimplemodelApiResponse response = alipayClient
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

            //验证结果
            List<SimpleMockModel> bizModelList = response.getBizModelList();
            Assert.assertNotNull(bizModelList);
            Assert.assertEquals(2, bizModelList.size());

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), bizModelList.get(0));
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), bizModelList.get(1));

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testJSONListSimpleFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicStdMockListsimplemodelApiRequest request = new AlipayMobilePublicStdMockListsimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListsimplemodelApiResponse response = alipayClient
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
    public void testXMLListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicStdMockListsimplemodelApiRequest request = new AlipayMobilePublicStdMockListsimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListsimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("10000", response.getCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            //验证结果
            List<SimpleMockModel> bizModelList = response.getBizModelList();
            Assert.assertNotNull(bizModelList);
            Assert.assertEquals(2, bizModelList.size());

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), bizModelList.get(0));
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), bizModelList.get(1));

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLListSimpleFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicStdMockListsimplemodelApiRequest request = new AlipayMobilePublicStdMockListsimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListsimplemodelApiResponse response = alipayClient
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
