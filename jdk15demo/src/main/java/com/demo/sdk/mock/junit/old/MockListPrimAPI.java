/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayMobilePublicMockListprimApiRequest;
import com.alipay.api.response.AlipayMobilePublicMockListprimApiResponse;
import com.demo.sdk.util.AlipayClientUtil;
import com.demo.sdk.util.LoggerUtil;

/**
 * 
 * @author jiehua
 * @version $Id: MockListPrimAPI.java, v 0.1 2015-4-17 ����7:40:49 jiehua Exp $
 */
public class MockListPrimAPI {

    @Test
    public void testJSONListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("");

        try {

            AlipayMobilePublicMockListprimApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON �ɹ���");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // ��֤���
            List<String> userIdList = response.getUserIdList();

            List<String> user_id_list = new ArrayList<String>();
            user_id_list.add("1222");
            user_id_list.add("1444");

            for (int i = 0; i < userIdList.size(); i++) {
                Assert.assertEquals(userIdList.get(i), user_id_list.get(i));
            }

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testJSONListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getJSONInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListprimApiResponse response = alipayClient.execute(request);
            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("JSON ʧ�ܣ�");
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
    public void testXMLListPrimAPI() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("");

        try {

            AlipayMobilePublicMockListprimApiResponse response = alipayClient.execute(request);

            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML �ɹ���");
            LoggerUtil.info(response.getBody());

            Assert.assertTrue(response.isSuccess());
            Assert.assertNull(response.getErrorCode());
            Assert.assertNull(response.getMsg());
            Assert.assertNull(response.getSubCode());
            Assert.assertNull(response.getSubMsg());

            // ��֤���
            List<String> userIdList = response.getUserIdList();
            StringBuilder uid = new StringBuilder();
            uid.append(userIdList.get(0));

            // �Ͻӿڶ�XML List �ı���
            //            List<String> user_id_list = new ArrayList<String>();
            //            user_id_list.add("1222");
            //            user_id_list.add("1444");
            StringBuilder user_id_list = new StringBuilder();
            user_id_list.append("1222");
            user_id_list.append(",");
            user_id_list.append("1444");

            Assert.assertEquals(user_id_list.toString(), uid.toString());

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail();
        }

    }

    @Test
    public void testXMLListPrimAPIFail() {

        AlipayClient alipayClient = AlipayClientUtil.getXMLInStance();

        AlipayMobilePublicMockListprimApiRequest request = new AlipayMobilePublicMockListprimApiRequest();

        request.setBizContent("false");

        try {

            AlipayMobilePublicMockListprimApiResponse response = alipayClient.execute(request);
            LoggerUtil.info("===API: " + request.getApiMethodName());
            LoggerUtil.info("XML ʧ�ܣ�");
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
