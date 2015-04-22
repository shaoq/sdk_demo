/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicStdMockListprimApiRequest;
import com.alipay.api.response.AlipayMobilePublicStdMockListprimApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;

/**
 * 
 * @author jiehua
 * @version $Id: StdMockListPrimAPI.java, v 0.1 2015-4-17 下午7:40:49 jiehua Exp $
 */
public class StdMockListPrimAPI {

    @Test
    public void testJSONListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockListprimApiRequest request = new AlipayMobilePublicStdMockListprimApiRequest();

        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListprimApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<String> userIdList = response.getUserIdList();

            List<String> user_id_list = new ArrayList<String>();
            user_id_list.add("1222");
            user_id_list.add("1444");

            Assert.assertEquals(userIdList, user_id_list);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicStdMockListprimApiRequest request = new AlipayMobilePublicStdMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListprimApiResponse response = alipayClient.execute(request);
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
    public void testXMLListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockListprimApiRequest request = new AlipayMobilePublicStdMockListprimApiRequest();

        request.setBizContent("繁体骶骶龘の");

        try {

            AlipayMobilePublicStdMockListprimApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML 成功：");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("10000", response.getErrorCode());
            Assert.assertEquals("Success", response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // 验证结果
            List<String> userIdList = response.getUserIdList();

            List<String> user_id_list = new ArrayList<String>();
            user_id_list.add("1222");
            user_id_list.add("1444");

            Assert.assertEquals(userIdList, user_id_list);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicStdMockListprimApiRequest request = new AlipayMobilePublicStdMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicStdMockListprimApiResponse response = alipayClient.execute(request);
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
