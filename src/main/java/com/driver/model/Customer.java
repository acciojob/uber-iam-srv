package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CustomerId;

    private String mobile;

    private String Password;

    @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public Customer() {
    }

    public int getCustomerID() {
        return CustomerId;
    }

    public void setCustomerID(int customerID) {
        this.CustomerId = customerID;
    }

    public String getMobileNo() {
        return mobile;
    }

    public void setMobileNo(String mobileNo) {
        this.mobile = mobileNo;
    }

    public String getPassWord() {
        return Password;
    }

    public void setPassWord(String passWord) {
        Password = passWord;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}