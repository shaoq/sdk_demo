/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.demo.sdk.mock.junit.old;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 
 * @author jiehua
 * @version $Id: AllOldTests.java, v 0.1 2015-4-23 ÏÂÎç8:42:18 jiehua Exp $
 */
public class AllOldTests {

    public static Test suite() {
        TestSuite suite = new TestSuite(AllOldTests.class.getName());
        //$JUnit-BEGIN$
        suite.addTestSuite(MockComplexAPI.class);
        suite.addTestSuite(MockListComplexAPI.class);
        suite.addTestSuite(MockListListComplexAPI.class);
        suite.addTestSuite(MockListListSimpleAPI.class);
        suite.addTestSuite(MockListPrimAPI.class);
        suite.addTestSuite(MockListSimpleAPI.class);
        suite.addTestSuite(MockPlaintAPI.class);
        suite.addTestSuite(MockSimpleAPI.class);
        //$JUnit-END$
        return suite;
    }

}
