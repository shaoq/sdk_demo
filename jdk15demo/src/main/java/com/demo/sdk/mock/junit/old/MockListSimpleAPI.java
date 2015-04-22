/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.SimpleMockModel;
import com.alipay.api.request.AlipayMobilePublicMockListsimplemodelApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListsimplemodelApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListSimpleAPI.java, v 0.1 2015-4-17 下午7:46:30 jiehua Exp $
 */
public class MockListSimpleAPI {

    @Test
    public void testJSONListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicMockListsimplemodelApiRequest request = new AlipayMobilePublicMockListsimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicMockListsimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
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
        AlipayMobilePublicMockListsimplemodelApiRequest request = new AlipayMobilePublicMockListsimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListsimplemodelApiResponse response = alipayClient
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
    public void testXMLListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicMockListsimplemodelApiRequest request = new AlipayMobilePublicMockListsimplemodelApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicMockListsimplemodelApiResponse response = alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
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
        AlipayMobilePublicMockListsimplemodelApiRequest request = new AlipayMobilePublicMockListsimplemodelApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListsimplemodelApiResponse response = alipayClient
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
