package com.chase.app;

/**
 * Created by student on 2016/03/15.
 */
public abstract class blah {

    private String firstName = "";
    private String lastName = "";
    private String empId = "";
    private int sales;

    public blah(String first, String last, String ID, int sales)
    {
        this.firstName = first;
        this.lastName = last;
        this.empId = ID;
        this.sales = sales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public int getSales() {
        return sales;
    }

    public void displayUserDetails()
    {
        System.out.println("Name:" + firstName + "/n" + "last Name:" + lastName + "/n"  + "Sales:" + sales + "/n" );
    }

    abstract public double calcCommission();

    /*
    public void initializeName( String firstName );
    public void initializeLastName( String lastName );
    public void viewEmployee( String ID );*/



}
