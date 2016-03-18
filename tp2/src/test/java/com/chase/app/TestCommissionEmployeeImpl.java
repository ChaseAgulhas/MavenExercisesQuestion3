package com.chase.app;

import com.chase.app.blah;

/**
 * Created by student on 2016/03/15.
 */
public class TestCommissionEmployeeImpl {

    @org.junit.Test
    public void testName() throws Exception {
        blah emp1 = new CommissionEmployeeImpl("Chase", "Agulhas", "1234", 3);
        emp1.calcCommission();
    }


}
