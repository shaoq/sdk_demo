/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.OldComplextMockModel;
import com.alipay.api.domain.OldListListComplexMockModel;
import com.alipay.api.request.AlipayMobilePublicMockListcmlistApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListcmlistApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListListComplexAPI.java, v 0.1 2015-4-17 下午8:14:21 jiehua Exp $
 */
public class MockListListComplexAPI {

    @Test
    public void testJSONListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("繁体测试骶骶龘の");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<OldListListComplexMockModel> listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List<OldComplextMockModel> cmList0 = listCmList.get(0).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(0));
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(1));

            List<OldComplextMockModel> cmList1 = listCmList.get(1).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(0));
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(1));

            // 校验签名

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = alipayClient.execute(request);

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
    public void testXMLListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("🃁");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<OldListListComplexMockModel> listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List<OldComplextMockModel> cmList0 = listCmList.get(0).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(0));
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(1));

            List<OldComplextMockModel> cmList1 = listCmList.get(1).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(0));
            ModelCompareUtil.assertOldComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(1));

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicMockListcmlistApiRequest request = new AlipayMobilePublicMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListcmlistApiResponse response = alipayClient.execute(request);

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
