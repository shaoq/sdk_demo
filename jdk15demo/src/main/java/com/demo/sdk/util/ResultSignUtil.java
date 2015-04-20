/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.util;

import java.util.Map;

import junit.framework.Assert;

import com.alipay.api.AlipayConstants;
import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.StringUtils;
import com.alipay.api.internal.util.json.ExceptionErrorListener;
import com.alipay.api.internal.util.json.JSONReader;
import com.alipay.api.internal.util.json.JSONValidatingReader;

/**
 * 
 * @author jiehua
 * @version $Id: ResultSignUtil.java, v 0.1 2015-4-20 下午5:06:43 jiehua Exp $
 */
public class ResultSignUtil {

    /**
     * JSON校验
     * 
     * @param body
     * @param request
     * @throws Exception
     */
    public static void checkJSONResult(String body, AlipayRequest<?> request) throws Exception {

        if (StringUtils.isEmpty(body)) {

            return;
        }

        String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
        String errorRootNode = "error_response";

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
        Object rootObj = reader.read(body);
        Map<?, ?> rootJson = (Map<?, ?>) rootObj;
        String sign = (String) rootJson.get(AlipayConstants.SIGN);

        // 成功或者新版接口
        if (indexOfRootNode > 0) {
            //  第一个字母+长度+引号和分号
            int signDataStartIndex = indexOfRootNode + rootNode.length() + 2;
            int indexOfSign = body.indexOf(AlipayConstants.SIGN);
            // 签名前-引号和逗号
            int signDataEndIndex = indexOfSign - 2;

            String signData = body.substring(signDataStartIndex, signDataEndIndex);

            boolean rsaCheckContent = AlipaySignature.rsaCheckContent(signData, sign,
                GateWayUtils.ALIPAY_PUBLIC_KEY, "UTF-8");

            Assert.assertTrue(rsaCheckContent);

            System.out.println(signData);

            // 老版失败结果
        } else if (indexOfErrorRoot > 0) {

            //  第一个字母+长度+引号和分号
            int signDataStartIndex = indexOfErrorRoot + errorRootNode.length() + 2;
            int indexOfSign = body.indexOf(AlipayConstants.SIGN);
            // 签名前-引号和逗号
            int signDataEndIndex = indexOfSign - 2;

            String signData = body.substring(signDataStartIndex, signDataEndIndex);

            boolean rsaCheckContent = AlipaySignature.rsaCheckContent(signData, sign,
                GateWayUtils.ALIPAY_PUBLIC_KEY, "UTF-8");

            Assert.assertTrue(rsaCheckContent);

            System.out.println(signData);

        }

    }

    /**
     * XML校验
     * 
     * @param body
     * @param request
     * @throws Exception
     */
    public static void checkXMLResult(String body, AlipayRequest<?> request) throws Exception {

        if (StringUtils.isEmpty(body)) {

            return;
        }

        String rootNode = request.getApiMethodName().replace('.', '_') + "_response";
        String errorRootNode = "error_response";
        String signNodeName = AlipayConstants.SIGN;
        String signEndNodeName = "</" + signNodeName + ">";

        int indexOfRootNode = body.indexOf(rootNode);
        int indexOfErrorRoot = body.indexOf(errorRootNode);

        int indexOfSignNode = body.indexOf(signNodeName);
        int indexOfSignEndNode = body.indexOf(signEndNodeName);

        if (indexOfSignNode < 0 || indexOfSignEndNode < 0) {
            return;
        }

        String sign = body.substring(indexOfSignNode + signNodeName.length() + 1,
            indexOfSignEndNode);

        // 成功或者新版接口
        if (indexOfRootNode > 0) {
            //  第一个字母+长度+>
            int signDataStartIndex = indexOfRootNode + rootNode.length() + 1;
            int indexOfSign = body.indexOf(AlipayConstants.SIGN);
            // 签名前减去/和<
            int signDataEndIndex = indexOfSign - 2;

            String signData = body.substring(signDataStartIndex, signDataEndIndex);

            boolean rsaCheckContent = AlipaySignature.rsaCheckContent(signData, sign,
                GateWayUtils.ALIPAY_PUBLIC_KEY, "UTF-8");

            Assert.assertTrue(rsaCheckContent);

            System.out.println(signData);

            // 老版失败结果
        } else if (indexOfErrorRoot > 0) {

            //  第一个字母+长度+引号和分号
            int signDataStartIndex = indexOfErrorRoot + errorRootNode.length() + 2;
            int indexOfSign = body.indexOf(AlipayConstants.SIGN);
            // 签名前-引号和逗号
            int signDataEndIndex = indexOfSign - 2;

            String signData = body.substring(signDataStartIndex, signDataEndIndex);

            boolean rsaCheckContent = AlipaySignature.rsaCheckContent(signData, sign,
                GateWayUtils.ALIPAY_PUBLIC_KEY, "UTF-8");

            Assert.assertTrue(rsaCheckContent);

            System.out.println(signData);

        }

    }
}
