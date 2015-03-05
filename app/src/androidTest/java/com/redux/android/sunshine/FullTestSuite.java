package com.redux.android.sunshine;

/**
 * Created by kumardivyarajat on 01/03/15.
 */
import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

public class FullTestSuite extends TestSuite {
        public static Test suite() {
                return new TestSuiteBuilder(FullTestSuite.class)
                                .includeAllPackagesUnderHere().build();
        }

        public FullTestSuite() {
                super();
        }
}
