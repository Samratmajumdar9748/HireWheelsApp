package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(nullable = false,precision = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(length = 50,nullable = false)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(length = 50,nullable = false)
    @Size(min = 5, max = 50)
    private String password;

    @Column(length = 50, nullable = false,unique = true)
    private String email;

    @Column(precision = 10,nullable = false,unique = true)
    private int mobileNo;

    @ManyToOne
    @JoinColumn(name = "roleId",nullable = false)
    private Role role;

    @OneToMany(mappedBy = "user",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private List<Booking> bookings;
    @Column(precision = 10, scale = 2)
    private float walletMoney = 10000.00f;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo=" + mobileNo +
                ", role=" + role +
                ", walletMoney=" + walletMoney +
                '}';
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public float getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(float walletMoney) {
        this.walletMoney = walletMoney;
    }


}
