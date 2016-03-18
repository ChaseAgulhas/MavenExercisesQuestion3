package com.chase.app;

/**
 * Created by Chase Agulhas on 2016/03/15.
 */
public class CommissionEmployeeImpl extends blah {

    private double commissionRate = 0.3;
    private double commission;

    public CommissionEmployeeImpl(String first, String last, String ID, int sales) {

        super(first, last, ID, sales);
        //this.commission = commission;
    }

    public double calcCommission()
    {
        return (commission = getSales()*commissionRate);
    }


    public void displayUsereDetails()
    {
        System.out.println("Commission: " + commission + "/n");
        super.displayUserDetails();
    }

}
