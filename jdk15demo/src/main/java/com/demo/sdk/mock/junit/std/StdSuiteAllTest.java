/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * ��׼���ز��Լ���
 *  
 * @author jie.hua
 * @version $Id: StdSuiteTest.java, v 0.1 2015-4-20 ����10:57:59 jiehua Exp $
 */
@RunWith(Suite.class)
@SuiteClasses({ StdMockListComplexAPI.class, StdMockListListSimpleAPI.class,
               StdMockListPrimAPI.class, StdMockComplexAPI.class, StdMockListSimpleAPI.class,
               StdMockListListComplexAPI.class, StdMockPlaintAPI.class, StdMockPlaintAPI.class })
public class StdSuiteAllTest {

}
