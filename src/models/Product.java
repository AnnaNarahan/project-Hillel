package models;


import base.Fiscal;
import base.Income;
import utils.Rounder;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product extends Rounder implements Fiscal, Income {

    // Объявление полей модели
     String name;
     int quantity;
     double price;
     final double TAX_RATE=0.05;
     double netProfit;
     double income;
     double incomeTax;

    public double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(double netProfit) {
        this.netProfit = netProfit;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public  void income(int quantity, double price, double income) {
        income=(double) quantity*price;
    }
    @Override
    public void incomeTax(double incomeTax,double income,final double TAX_RATE) {
        incomeTax=(double) income* TAX_RATE;
    }

    @Override
    public void netProfit(double income, double tax, double netProfit) {
         netProfit=(double) income-income*tax;
    }

    }
    // Налоговоу ставку объявите в виде константы
    // здесь ...


    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...


    // Переопределите методы реализуемых интерфейсов.

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

    // Расчёт суммы налога с продаж.
    // здесь ...

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...

