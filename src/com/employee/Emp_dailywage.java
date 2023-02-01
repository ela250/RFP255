package com.employee;

import java.sql.SQLOutput;

public class Emp_dailywage {
    public static void main(String[] args) {
        int fulltime = 1;
        int salaryperhour = 20;
        int emp_workinghour = 0;
        int emp_wage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == fulltime){
            emp_workinghour = 8;
            System.out.println("emp is present");
        }else{
            emp_workinghour = 0;
            System.out.println("emp is absent");
        }
        emp_wage = emp_workinghour * salaryperhour;
        System.out.println("empwage is :" + emp_wage);

    }
}
