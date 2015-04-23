/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.std;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 
 * @author jiehua
 * @version $Id: AllStdTests.java, v 0.1 2015-4-23 ÏÂÎç6:17:49 jiehua Exp $
 */
public class AllStdTests {

    public static Test suite() {
        TestSuite suite = new TestSuite(AllStdTests.class.getName());
        //$JUnit-BEGIN$
        suite.addTestSuite(StdMockComplexAPI.class);
        suite.addTestSuite(StdMockListComplexAPI.class);
        suite.addTestSuite(StdMockListListComplexAPI.class);
        suite.addTestSuite(StdMockListListSimpleAPI.class);
        suite.addTestSuite(StdMockListPrimAPI.class);
        suite.addTestSuite(StdMockListSimpleAPI.class);
        suite.addTestSuite(StdMockPlaintAPI.class);
        suite.addTestSuite(StdMockSimpleAPI.class);
        //$JUnit-END$
        return suite;
    }

}
