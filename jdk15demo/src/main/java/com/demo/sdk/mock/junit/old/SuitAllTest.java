/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *  �ϰ汾�ӿڲ����׼�
 * @author jie.hua
 * @version $Id: SuitAllTest.java, v 0.1 2015-4-20 ����11:32:00 jiehua Exp $
 */
@RunWith(Suite.class)
@SuiteClasses({ MockComplexAPI.class, MockListComplexAPI.class, MockListListComplexAPI.class,
               MockListListSimpleAPI.class, MockListPrimAPI.class, MockListSimpleAPI.class,
               MockPlaintAPI.class, MockSimpleAPI.class })
public class SuitAllTest {

}
