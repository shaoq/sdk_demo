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
import com.alipay.api.domain.ListListComplexMockModel;
import com.alipay.api.request.AlipayMobilePublicStdMockListcmlistApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockListcmlistApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.ModelCompareUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockListListComplexAPI.java, v 0.1 2015-4-17 下午8:14:21 jiehua Exp $
 */
public class StdMockListListComplexAPI {

    @Test
    public void testJSONListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicStdMockListcmlistApiRequest request = new AlipayMobilePublicStdMockListcmlistApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("10000", response.getCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<ListListComplexMockModel> listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List<ComplextMockModel> cmList0 = listCmList.get(0).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(1));

            List<ComplextMockModel> cmList1 = listCmList.get(1).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(1));

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();
        AlipayMobilePublicStdMockListcmlistApiRequest request = new AlipayMobilePublicStdMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 失败：");
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
    public void testXMLListListComplex() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicStdMockListcmlistApiRequest request = new AlipayMobilePublicStdMockListcmlistApiRequest();
        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("10000", response.getCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<ListListComplexMockModel> listCmList = response.getListCmList();
            Assert.assertEquals(2, listCmList.size());

            List<ComplextMockModel> cmList0 = listCmList.get(0).getCmList();
            Assert.assertEquals(2, cmList0.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList0.get(1));

            List<ComplextMockModel> cmList1 = listCmList.get(1).getCmList();
            Assert.assertEquals(2, cmList1.size());
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(0));
            ModelCompareUtil.assertComplexModel(
                com.demo.sdk.std.mock.model.ComplextMockModel.getInstance(), cmList1.get(1));

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLListListComplexFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();
        AlipayMobilePublicStdMockListcmlistApiRequest request = new AlipayMobilePublicStdMockListcmlistApiRequest();
        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListcmlistApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
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
