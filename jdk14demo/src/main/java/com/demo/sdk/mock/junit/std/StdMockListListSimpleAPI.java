/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.ListListSmMockModel;
import com.alipay.api.domain.SimpleMockModel;
import com.alipay.api.request.AlipayMobilePublicStdMockListsmlistApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockListsmlistApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockListListSimpleAPI.java, v 0.1 2015-4-17 涓����8:02:31 jiehua Exp $
 */
public class StdMockListListSimpleAPI extends TestCase {

    public void testJSONListListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockListsmlistApiRequest request = new AlipayMobilePublicStdMockListsmlistApiRequest();
        request.setBizContent("貣龞哈迪大");

        try {

            AlipayMobilePublicStdMockListsmlistApiResponse response = (AlipayMobilePublicStdMockListsmlistApiResponse) alipayClient
                .execute(request);
            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
            List listSmModelList = response.getListSmModelList();
            Assert.assertEquals(2, listSmModelList.size());
            ListListSmMockModel listListSmMockModel0 = (ListListSmMockModel) listSmModelList.get(0);
            Assert.assertEquals(2, listListSmMockModel0.getListSimpleModelList().size());
            SimpleMockModel simpleMockModel00 = (SimpleMockModel) listListSmMockModel0
                .getListSimpleModelList().get(0);
            SimpleMockModel simpleMockModel01 = (SimpleMockModel) listListSmMockModel0
                .getListSimpleModelList().get(1);

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel00);
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel01);

            ListListSmMockModel listListSmMockModel1 = (ListListSmMockModel) listSmModelList.get(1);
            Assert.assertEquals(2, listListSmMockModel1.getListSimpleModelList().size());

            SimpleMockModel simpleMockModel10 = (SimpleMockModel) listListSmMockModel1
                .getListSimpleModelList().get(0);
            SimpleMockModel simpleMockModel11 = (SimpleMockModel) listListSmMockModel1
                .getListSimpleModelList().get(1);

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel10);
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel11);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testJSONListListSimpleFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockListsmlistApiRequest request = new AlipayMobilePublicStdMockListsmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListsmlistApiResponse response = (AlipayMobilePublicStdMockListsmlistApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());
            Assert.assertNotSame(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertNotSame(StringUtil.EMPTY_STRING, response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testXMLListListSimple() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockListsmlistApiRequest request = new AlipayMobilePublicStdMockListsmlistApiRequest();
        request.setBizContent("貣龞哈迪大");

        try {

            AlipayMobilePublicStdMockListsmlistApiResponse response = (AlipayMobilePublicStdMockListsmlistApiResponse) alipayClient
                .execute(request);
            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
            List listSmModelList = response.getListSmModelList();
            Assert.assertEquals(2, listSmModelList.size());
            ListListSmMockModel listListSmMockModel0 = (ListListSmMockModel) listSmModelList.get(0);
            Assert.assertEquals(2, listListSmMockModel0.getListSimpleModelList().size());
            SimpleMockModel simpleMockModel00 = (SimpleMockModel) listListSmMockModel0
                .getListSimpleModelList().get(0);
            SimpleMockModel simpleMockModel01 = (SimpleMockModel) listListSmMockModel0
                .getListSimpleModelList().get(1);

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel00);
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel01);

            ListListSmMockModel listListSmMockModel1 = (ListListSmMockModel) listSmModelList.get(1);
            Assert.assertEquals(2, listListSmMockModel1.getListSimpleModelList().size());

            SimpleMockModel simpleMockModel10 = (SimpleMockModel) listListSmMockModel1
                .getListSimpleModelList().get(0);
            SimpleMockModel simpleMockModel11 = (SimpleMockModel) listListSmMockModel1
                .getListSimpleModelList().get(1);

            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel10);
            ModelCompareUtil.assertPlaintModel(
                com.demo.sdk.std.mock.model.SimpleMockModel.getInstance(), simpleMockModel11);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testXMLListListSimpleFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockListsmlistApiRequest request = new AlipayMobilePublicStdMockListsmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListsmlistApiResponse response = (AlipayMobilePublicStdMockListsmlistApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
            LoggerUtil.info(response.getBody());

            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("40004", response.getErrorCode());
            Assert.assertEquals("Business Failed", response.getMsg());
            Assert.assertNotNull(response.getSubCode());
            Assert.assertNotNull(response.getSubMsg());
            Assert.assertNotSame(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertNotSame(StringUtil.EMPTY_STRING, response.getSubMsg());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

}
