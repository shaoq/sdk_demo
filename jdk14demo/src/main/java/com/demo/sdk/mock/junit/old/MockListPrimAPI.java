/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockListprimApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListprimApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;
import com.demo.sdk.util.StringUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListPrimAPI.java, v 0.1 2015-4-17 涓����7:40:49 jiehua Exp $
 */
public class MockListPrimAPI extends TestCase {

    public void testJSONListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("貣龞哈迪大");

        try {

            AlipayMobilePublicMockListprimApiResponse response = (AlipayMobilePublicMockListprimApiResponse) alipayClient
                .execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON  成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getErrorCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getMsg());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubCode());
            Assert.assertEquals(StringUtil.EMPTY_STRING, response.getSubMsg());

            // 楠�璇�缁����
            List userIdList = response.getUserIdList();

            List user_id_list = new ArrayList();
            user_id_list.add("1222");
            user_id_list.add("1444");

            Assert.assertEquals(userIdList, user_id_list);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testJSONListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListprimApiResponse response = (AlipayMobilePublicMockListprimApiResponse) alipayClient
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

    public void testXMLListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("貣龞哈迪大┱");

        try {

            AlipayMobilePublicMockListprimApiResponse response = (AlipayMobilePublicMockListprimApiResponse) alipayClient
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
            List userIdList = response.getUserIdList();

            List user_id_list = new ArrayList();
            user_id_list.add("1222");
            user_id_list.add("1444");

            Assert.assertEquals(userIdList, user_id_list);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    public void testXMLListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListprimApiResponse response = (AlipayMobilePublicMockListprimApiResponse) alipayClient
                .execute(request);
            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 失败：");
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
