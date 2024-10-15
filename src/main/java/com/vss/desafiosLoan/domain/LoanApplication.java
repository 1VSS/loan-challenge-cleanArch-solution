package com.vss.desafiosLoan.domain;

import java.util.HashMap;

public class LoanApplication implements iLoanApplication {

    int age;
    String cpf;
    String name;
    double income;
    String location;

    public LoanApplication(int age, String cpf, String name, double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public LoanApplication() {
    }


    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getIncome() {
        return income;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
