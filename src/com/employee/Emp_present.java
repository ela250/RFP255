package com.employee;

public class Emp_present {
    public static void main(String[] args) {
        int full_time = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == full_time) {
            System.out.println("employee is present");
        } else {
            System.out.println("emp is absent");
        }
    }
}
