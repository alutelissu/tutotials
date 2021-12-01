package com.last.springbootbackend.model;

import javax.persistence.*;

@Entity
@Table(name="appointment_tb")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="fname")
    private String firstName;
    @Column(name="lname")
    private String lastName;
    @Column(name="mobile")
    private String mobile;
    @Column(name="address")
    private String address;
    @Column(name="clinic")
    private String clinic;
    @Column(name="tarehe")
    private String tarehe;
    @Column(name="muda")
    private String muda;


    public Appointment() {

    }

    public Appointment(String firstName,
                       String lastName,
                       String mobile,
                       String address,
                       String clinic,
                       String tarehe,
                       String muda) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.address = address;
        this.clinic = clinic;
        this.tarehe = tarehe;
        this.muda = muda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getTarehe() {
        return tarehe;
    }

    public void setTarehe(String tarehe) {
        this.tarehe = tarehe;
    }

    public String getMuda() {
        return muda;
    }

    public void setMuda(String muda) {
        this.muda = muda;
    }
}
